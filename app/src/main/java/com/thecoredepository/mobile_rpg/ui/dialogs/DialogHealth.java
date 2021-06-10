package com.thecoredepository.mobile_rpg.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.thecoredepository.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.backend.OpenLegend.player;

public class DialogHealth extends Dialog implements android.view.View.OnClickListener
{

    public Activity activity;
    public Dialog d;

    public DialogHealth(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.activity = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_health);
        EditText editHealth = findViewById(R.id.editHealth);
        Button btnDamage = findViewById(R.id.btnDamage);
        Button btnHeal = findViewById(R.id.btnHeal);
        Button btnLethalDamage = findViewById(R.id.btnLethalDamage);
        Button btnLethalHeal = findViewById(R.id.btnLethalHeal);

        btnDamage.setOnClickListener(this);
        btnHeal.setOnClickListener(this);
        btnLethalDamage.setOnClickListener(this);
        btnLethalHeal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editHealth = findViewById(R.id.editHealth);
        String userin = "";
        int num = 0;
        switch (v.getId()) {
            case R.id.btnDamage:
                userin = editHealth.getText().toString();
                if (userin.length() <= 0) {
                    num = 0;
                } else {
                    num = Integer.valueOf(userin);
                }
                player.setDamageTaken(num);
                dismiss();
                break;
            case R.id.btnHeal:
                userin = editHealth.getText().toString();
                if (userin.length() <= 0) {
                    num = 0;
                } else {
                    num = Integer.valueOf(userin);
                }
                player.setDamagedHealed(num);
                dismiss();
                break;
            case R.id.btnLethalDamage:
                userin = editHealth.getText().toString();
                if (userin.length() <= 0) {
                    num = 0;
                } else {
                    num = Integer.valueOf(userin);
                }
                player.takeLethalDamage(num);
                dismiss();
                break;
            case R.id.btnLethalHeal:
                userin = editHealth.getText().toString();
                if (userin.length() <= 0) {
                    num = 0;
                } else {
                    num = Integer.valueOf(userin);
                }
                player.healLethalDamage(num);
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
