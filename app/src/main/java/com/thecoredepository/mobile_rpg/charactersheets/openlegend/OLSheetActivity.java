package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

public class OLSheetActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_sheet);
        openlegend player = new openlegend();
        player.generateRandomCharacter();
        TextView textViewTest =findViewById(R.id.textTest);
        textViewTest.setText(player.toString());
    }
}
