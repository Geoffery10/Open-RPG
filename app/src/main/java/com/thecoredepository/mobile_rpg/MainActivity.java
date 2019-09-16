package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import com.thecoredepository.mobile_rpg.charactersheets.openlegend.DatabaseHelper;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSheetActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;


public class MainActivity extends AppCompatActivity {

    Cursor c = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        TextView txtVersion = findViewById(R.id.txtVersion);
        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);

        //LOAD DB
        /*
        DatabaseHelper myDbHelper = new DatabaseHelper(MainActivity.this);
        try {
            myDbHelper.createDataBase();
        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }
        myDbHelper.openDataBase();

        Toast.makeText(MainActivity.this, "Successfully Imported", Toast.LENGTH_SHORT).show();
        c = myDbHelper.query("player", null, null, null, null, null, null);
        if (c.moveToFirst()) {
            do {
                Toast.makeText(MainActivity.this,
                        "_id: " + c.getString(0) + "\n" +
                                "playerName: " + c.getString(1) + "\n" +
                                "type: " + c.getString(2) + "\n" +
                                "charName:  " + c.getString(3),
                        Toast.LENGTH_LONG).show();
            } while (c.moveToNext());
        }
        
         */


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
