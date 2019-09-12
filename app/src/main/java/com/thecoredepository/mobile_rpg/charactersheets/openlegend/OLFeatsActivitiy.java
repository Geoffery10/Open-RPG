package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;

public class OLFeatsActivitiy extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_feats);
        Intent intent = getIntent();
        //String selected = intent.getExtras().getString("selected");
    }
}