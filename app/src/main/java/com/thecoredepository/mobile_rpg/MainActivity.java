package com.thecoredepository.mobile_rpg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLNewSheet;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSavingSheets;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity.OLSheetActivity;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLFeats.featList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;


public class MainActivity extends AppCompatActivity {

    public Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppContext.mContext = mContext;
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        Button btnNewSheet = findViewById(R.id.btnNewSheet);
        Button btnDeleteSheet = findViewById(R.id.btnDeleteSheet);
        TextView txtVersion = findViewById(R.id.txtVersion);
        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);

        //Preload Feats
        featList();

        //Load Saved Data
        final OLSavingSheets saveData = new OLSavingSheets();
        saveData.loadData(this);

        //Load Data into Spinner
        ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(this, R.layout.spinner_style, sheetList);
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

    private void saveLastSheet(String selected) {
        //Save lastSheet
        SharedPreferences saveLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
        SharedPreferences.Editor editor = saveLastSheet.edit();
        editor.putString("lastSheet", selected);
        editor.apply();
    }
}
