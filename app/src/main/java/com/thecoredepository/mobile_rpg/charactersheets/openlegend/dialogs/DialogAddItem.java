package com.thecoredepository.mobile_rpg.charactersheets.openlegend.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSavingSheets;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity.OLInventoryActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLFeatAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLItem;

import java.lang.reflect.Type;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class DialogAddItem extends Dialog implements android.view.View.OnClickListener
{

    public Activity activity;
    public Dialog d;

    public DialogAddItem(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_add_item);
        Button btnSave = findViewById(R.id.btnSave);
        ImageView btnCancel = findViewById(R.id.btnCancel);
        EditText editTitle = findViewById(R.id.editTitle);
        EditText editDescription = findViewById(R.id.editDescription);
        EditText editQuantity = findViewById(R.id.editQuantity);

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                OLItem item = new OLItem();
                int quantity;
                EditText editTitle = findViewById(R.id.editTitle);
                EditText editDescription = findViewById(R.id.editDescription);
                EditText editQuantity = findViewById(R.id.editQuantity);
                if (editTitle.getText().equals("")) {
                    item.setTitle("Unknown");
                } else {
                    item.setTitle("" + editTitle.getText());
                }
                if (editDescription.getText().equals("")) {
                    item.setDescription("Unknown");
                } else {
                    item.setDescription("" + editDescription.getText());
                }
                try {
                    quantity = Integer.parseInt(String.valueOf(editQuantity.getText()));
                } catch (Exception e)
                {
                    quantity = 1;
                }
                item.setQuantity(quantity);
                //Type should be gathered from a spinner
                item.setType("Item");
                player.addItem(item);
                //OLFeatAdapter.notifyDataSetChanged();
                //Save
                try {
                    Log.i("Saving", "Started Saving...");
                    OLSavingSheets saveData = new OLSavingSheets();
                    saveData.saveData(getContext());
                    Log.i("Saving", "Saved");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                OLInventoryActivity.itemAdapter.notifyDataSetChanged();
                break;
            case R.id.btnCancel:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
