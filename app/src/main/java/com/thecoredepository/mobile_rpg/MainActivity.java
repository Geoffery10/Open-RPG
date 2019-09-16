package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSheetActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        TextView txtVersion = findViewById(R.id.txtVersion);
        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);

        loadData();

        ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(this, R.layout.spinner_style, sheetList);
        spinnerOL.setAdapter(adapterOL);
        //Load lastSheet
        SharedPreferences loadLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
        spinnerOL.setSelection(sheetList.indexOf(loadLastSheet.getString("lastSheet", "ERROR")));

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();
                Log.i("selected", selected);
                //Save lastSheet
                SharedPreferences saveLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
                SharedPreferences.Editor editor = saveLastSheet.edit();
                editor.putString("lastSheet", selected);
                editor.apply();
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                in.putExtra("selected", selected);
                startActivity(in);
            }
        });
    }

    private void saveData()
    {
        SharedPreferences sheetPreferences = getSharedPreferences("sheetList", MODE_PRIVATE);
        SharedPreferences.Editor editor = sheetPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(sheetList);
        editor.putString("sheetList", json);
        editor.apply();

        SharedPreferences sheetsPreferences = getSharedPreferences("sheetList", MODE_PRIVATE);
        editor = sheetsPreferences.edit();
        gson = new Gson();
        json = gson.toJson(sheets);
        editor.putString("sheets", json);
        editor.apply();
    }

    private void loadData()
    {
        SharedPreferences sheetPreferences = getSharedPreferences("sheetList", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sheetPreferences.getString("sheetList", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        sheetList = gson.fromJson(json, type);

        SharedPreferences sheetsPreferences = getSharedPreferences("sheets", MODE_PRIVATE);
        gson = new Gson();
        json = sheetsPreferences.getString("sheets", null);
        type = new TypeToken<ArrayList<openlegend>>() {}.getType();
        sheets = gson.fromJson(json, type);

        if (sheetList == null || sheets == null)
        {
            sheetList = new ArrayList<>();
            sheets = new ArrayList<>();
            openlegend.HARDCODEDSHEETS();
        }
    }
}
