package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;

public class OLNewSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_newsheet);

        LinearLayout layoutBio = findViewById(R.id.layoutBio);
        layoutBio.setVisibility(View.VISIBLE);

        continueButtons();
    }

    private void continueButtons() {
        Button btnContinue01 = findViewById(R.id.btnContinue01);
        Button btnContinue02 = findViewById(R.id.btnContinue02);
        Button btnContinue03 = findViewById(R.id.btnContinue03);
        Button btnContinue04 = findViewById(R.id.btnContinue04);
        Button btnContinue05 = findViewById(R.id.btnContinue05);
        Button btnContinue06 = findViewById(R.id.btnContinue06);

        btnContinue01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //REQUIRE CHARACTER NAME
                EditText txtCharName = findViewById(R.id.txtCharName);
                if (txtCharName.getText().toString().trim().length() > 0)
                {
                    getBioSection(txtCharName);

                    LinearLayout layoutBio = findViewById(R.id.layoutBio);
                    layoutBio.setVisibility(View.GONE);
                    LinearLayout layoutLang = findViewById(R.id.layoutLang);
                    layoutLang.setVisibility(View.VISIBLE);
                }
            }
        });

        btnContinue02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Languages aren't required
                LinearLayout layoutLang = findViewById(R.id.layoutLang);
                layoutLang.setVisibility(View.GONE);
                LinearLayout layoutLevel = findViewById(R.id.layoutLevel);
                layoutLevel.setVisibility(View.VISIBLE);
            }
        });

        btnContinue03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Level 0 if blank
                LinearLayout layoutLevel = findViewById(R.id.layoutLevel);
                layoutLevel.setVisibility(View.GONE);
                LinearLayout layoutAttributes = findViewById(R.id.layoutAttributes);
                layoutAttributes.setVisibility(View.VISIBLE);
            }
        });

        btnContinue04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Speed 0 if none
                LinearLayout layoutAttributes = findViewById(R.id.layoutAttributes);
                layoutAttributes.setVisibility(View.GONE);
                LinearLayout layoutFeats = findViewById(R.id.layoutFeats);
                layoutFeats.setVisibility(View.VISIBLE);
            }
        });

        btnContinue05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //FEATS aren't required
                LinearLayout layoutFeats = findViewById(R.id.layoutFeats);
                layoutFeats.setVisibility(View.GONE);
                LinearLayout layoutInventory = findViewById(R.id.layoutInventory);
                layoutInventory.setVisibility(View.VISIBLE);
            }
        });

        btnContinue06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Items aren't required
                LinearLayout layoutInventory = findViewById(R.id.layoutInventory);
                layoutInventory.setVisibility(View.GONE);
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                sheets.add(player);
                sheetList.add(player.getCharName());
                in.putExtra("selected", player.getCharName());
                startActivity(in);
            }
        });
    }

    private void getBioSection(EditText txtCharName) {
        player.setCharName(""+txtCharName.getText());
        EditText txtNickName = findViewById(R.id.txtNickName);
        player.setNickname(""+txtNickName.getText());
        EditText txtDeity = findViewById(R.id.txtDeity);
        if (txtDeity.getText().toString().trim().length() > 0) {
            player.setDeity(""+txtDeity.getText());
        }
        else {
            player.setDeity("No Deity");
        }
        getPlayerType();
        EditText txtBioEdit = findViewById(R.id.txtBioEdit);
        player.setBio(""+txtBioEdit.getText());
    }

    private void getPlayerType() {
        Spinner spinnerType = findViewById(R.id.spinnerType);
        String type = (String)spinnerType.getSelectedItem();
        if (type.equals("Player Character")) {
            type = "pc";
        }
        else if (type.equals("Companion Character - I")) {
            type = "ccI";
        }
        else if (type.equals("Companion Character - II")) {
            type = "ccII";
        }
        else if (type.equals("Companion Character - III")) {
            type = "ccIII";
        }
        else {
            Log.i("Type", "Error: "+type);
            type = "pc";
        }
        player.setType(type);
    }
}
