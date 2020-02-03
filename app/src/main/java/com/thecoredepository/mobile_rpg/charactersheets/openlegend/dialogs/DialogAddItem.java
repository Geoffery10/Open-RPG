package com.thecoredepository.mobile_rpg.charactersheets.openlegend.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.thecoredepository.mobile_rpg.R;

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
                activity.finish();
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
