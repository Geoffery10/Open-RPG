package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
    final Context context=this;
    private SQLiteDatabase mDataBase;
    private static String DB_NAME ="opSheets.db";

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
        String DB_PATH;

        DatabaseHelper db;
        db = new DatabaseHelper(this);
        try {
            db.createDB();
        } catch (IOException ioe) {
            throw new Error("Database not created....");
        }
        try
        {
            db.openDB();
        } catch (Exception e)
        {
            Log.i("open DB......","Database not opened");
        }

        SQLiteDatabase db1;
        db1 = openOrCreateDatabase("opSheets", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        Cursor c = db1.rawQuery("SELECT * FROM player", null);
        c.moveToFirst();
        String temp = "";
        while (!c.isAfterLast()) {
            String s2 = c.getString(0);
            String s3 = c.getString(1);
            String s4 = c.getString(2);
            temp = temp + "\n Id:" + s2 + "\tType:" + s3 + "\tBal:" + s4;
            c.moveToNext();
        }
        Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_LONG);
        
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
