package com.thecoredepository.mobile_rpg.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.backend.files.SavingSheets;
import com.thecoredepository.mobile_rpg.ui.activity.InventoryActivity;
import com.thecoredepository.mobile_rpg.backend.lists.OLItem;

import static com.thecoredepository.mobile_rpg.backend.OpenLegend.player;

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
                //FeatAdapter.notifyDataSetChanged();
                //Save
                try {
                    Log.i("Saving", "Started Saving...");
                    SavingSheets saveData = new SavingSheets();
                    saveData.saveData(getContext());
                    Log.i("Saving", "Saved");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    InventoryActivity.itemAdapter.notifyDataSetChanged();
                } catch (Exception e) {
                    Log.e("Inventory Refresh", "Inventory did not refresh: " + e);
                }
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
