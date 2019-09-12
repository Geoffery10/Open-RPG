package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.example.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSheetActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

import java.util.ArrayList;
import java.util.List;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        openlegend.HARDCODEDSHEETS();

        ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sheetList);
        spinnerOL.setAdapter(adapterOL);

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();
                Log.i("selected", selected);
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                in.putExtra("selected", selected);
                startActivity(in);
            }
        });
    }
}
