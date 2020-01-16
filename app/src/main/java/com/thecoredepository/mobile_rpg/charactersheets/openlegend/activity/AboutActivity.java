package com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.Theming;

public class AboutActivity  extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent = getIntent();

        ConstraintLayout aboutView = findViewById(R.id.aboutView);
        aboutView.setBackgroundResource(Theming.getBackground());
        TextView txtAboutHeader = findViewById(R.id.txtAboutHeader);
        txtAboutHeader.setTextColor(Theming.getColoredFontColor());
        TextView txtAbout_01 = findViewById(R.id.txtAbout_01);
        txtAbout_01.setTextColor(Theming.getFontColor());
    }
}
