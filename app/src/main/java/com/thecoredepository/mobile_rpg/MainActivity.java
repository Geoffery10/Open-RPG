package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLEditSheet;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLNewSheet;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSavingSheets;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity.OLSheetActivity;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLFeats.featList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;


public class MainActivity extends AppCompatActivity {

    public Context mContext = this;
    public Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppContext.mContext = mContext;

        //Load Theme
        loadTheming();

        ConstraintLayout mainactivity_layout = findViewById(R.id.mainactivity_layout);
        mainactivity_layout.setBackgroundResource(Theming.getBackground());
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        Button btnNewSheet = findViewById(R.id.btnNewSheet);
        Button btnDeleteSheet = findViewById(R.id.btnDeleteSheet);
        TextView txtVersion = findViewById(R.id.txtVersion);
        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);
        txtVersion.setTextColor(Theming.getColoredFontColor());

        //Preload Feats
        featList();

        //Load Saved Data
        final OLSavingSheets saveData = new OLSavingSheets();
        saveData.loadData(this);

        //Load Data into Spinner
        ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(this, Theming.getSpinnerStyle(), sheetList);
        spinnerOL.setAdapter(adapterOL);
        //Load lastSheet
        SharedPreferences loadLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
        spinnerOL.setSelection(sheetList.indexOf(loadLastSheet.getString("lastSheet", "ERROR")));

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();
                Log.i("selected", selected);
                //Save lastSheet
                saveLastSheet(selected);
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                in.putExtra("selected", selected);
                startActivity(in);
            }
        });

        btnNewSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //New Sheet
                Intent in = new Intent(getApplicationContext(), OLNewSheet.class);
                startActivity(in);
            }
        });

        btnDeleteSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();

                //Confirm Deletion
                new AlertDialog.Builder(mContext)
                        .setTitle("Delete " + selected)
                        .setMessage("Do you really want to delete "+selected+"?")
                        .setIcon(android.R.drawable.ic_delete)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int whichButton) {
                                //Delete the selected sheet
                                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                                String selected = (String)spinnerOL.getSelectedItem();
                                Log.i("selected", selected);

                                //Check for Sheet
                                if (sheetList.contains(selected))
                                {
                                    int index = 0;
                                    index = sheetList.indexOf(selected);
                                    sheetList.remove(index);
                                    sheets.remove(index);
                                }

                                //Update Spinner
                                ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(mContext, R.layout.spinner_style, sheetList);
                                spinnerOL.setAdapter(adapterOL);

                                //Save Data
                                saveData.saveData(mContext);
                            }})
                        .setNegativeButton(android.R.string.no, null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.DarkMode:
                if (Theming.getThemeID() == 1) {
                    new AlertDialog.Builder(mContext)
                            .setTitle("Enable Dark Mode?")
                            .setMessage("Dark Mode is not finished and may still contain bugs. Do you want to enable?")
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int whichButton) {
                                    Theming.setThemeID(2);
                                    loadTheming(2);
                                    updateTheme();
                                    setTheme(R.style.AppThemeDark);
                                    saveTheme(2);
                                }})
                            .setNegativeButton(android.R.string.no, null).show();
                }
                else {
                    Theming.setThemeID(1);
                    loadTheming(1);
                    updateTheme();
                    setTheme(R.style.AppTheme);
                    saveTheme(1);
                }
                break;
            case R.id.exportSheet:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.importSheet:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void loadTheming() {
        Theming.setContext(mContext);

        int themeID = 1;

        Log.d("Load Theme", "Loading Theme...");
        SharedPreferences themePreferences = mContext.getSharedPreferences("theme", Context.MODE_PRIVATE);
        themeID = themePreferences.getInt("theme", 0);
        Log.d("Load Theme", "Loaded Theme: " + themeID);

        if (themeID == 0)
        {
            themeID = 1;
            Theming.setThemeID(1);

            saveTheme(themeID);
        }

        Theming.setThemeID(themeID);

        //Load Theme From Save if Any
        if (Theming.getThemeID() >= 1) {
            //Theming
        } else {
            Theming.setThemeID(1);
        }

        //Set Theme According to Loaded Theme
        switch (Theming.getThemeID()) {
            case 1:
                Theming.setFontColor(getResources().getColor(R.color.text));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColored));
                Theming.setBackground(R.drawable.paper_bg);
                Theming.setSpinnerStyle(R.layout.spinner_style);
                break;
            case 2:
                Theming.setFontColor(getResources().getColor(R.color.textDarkTheme));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColoredDarkTheme));
                Theming.setBackground(R.drawable.paper_bg_dark);
                Theming.setSpinnerStyle(R.layout.spinner_style_dark);
                Theming.setThemeID(2);
                break;
        }
    }

    private void saveTheme(int themeID) {
        Log.d("Saving Theme", "Saving Theme: " + themeID);
        SharedPreferences themeSavePreferences = mContext.getSharedPreferences("theme", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = themeSavePreferences.edit();
        editor.putInt("theme", themeID);
        editor.commit();
        Log.d("Saved Theme", "Saved Theme: " + themeID);
    }

    private void loadTheming(int theme) {
        Theming.setContext(mContext);

        //Load Theme From Save if Any
        Theming.setThemeID(theme);

        //Set Theme According to Loaded Theme
        switch (Theming.getThemeID()) {
            case 1:
                Theming.setFontColor(getResources().getColor(R.color.text));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColored));
                Theming.setBackground(R.drawable.paper_bg);
                Theming.setSpinnerStyle(R.layout.spinner_style);
                break;
            case 2:
                Theming.setFontColor(getResources().getColor(R.color.textDarkTheme));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColoredDarkTheme));
                Theming.setBackground(R.drawable.paper_bg_dark);
                Theming.setSpinnerStyle(R.layout.spinner_style_dark);
                break;
        }
    }

    private void updateTheme() {
        ConstraintLayout mainactivity_layout = findViewById(R.id.mainactivity_layout);
        mainactivity_layout.setBackgroundResource(Theming.getBackground());
        TextView txtVersion = findViewById(R.id.txtVersion);
        txtVersion.setTextColor(Theming.getColoredFontColor());
    }

    private void saveLastSheet(String selected) {
        //Save lastSheet
        SharedPreferences saveLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
        SharedPreferences.Editor editor = saveLastSheet.edit();
        editor.putString("lastSheet", selected);
        editor.apply();
    }
}
