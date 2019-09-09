package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSheetActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                startActivity(in);
            }
        });
    }
}
