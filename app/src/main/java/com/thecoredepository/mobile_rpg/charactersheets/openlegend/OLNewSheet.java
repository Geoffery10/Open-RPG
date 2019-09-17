package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.mobile_rpg.R;

public class OLNewSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_newsheet);

        LinearLayout layoutBio = findViewById(R.id.layoutBio);
        layoutBio.setVisibility(View.VISIBLE);

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
                LinearLayout layoutBio = findViewById(R.id.layoutBio);
                layoutBio.setVisibility(View.GONE);
                LinearLayout layoutLang = findViewById(R.id.layoutLang);
                layoutLang.setVisibility(View.VISIBLE);
            }
        });

        btnContinue02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
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
                LinearLayout layoutInventory = findViewById(R.id.layoutInventory);
                layoutInventory.setVisibility(View.GONE);
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                in.putExtra("selected", "Tazmur");
                startActivity(in);
            }
        });
    }
}
