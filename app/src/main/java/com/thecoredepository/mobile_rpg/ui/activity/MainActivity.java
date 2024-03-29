package com.thecoredepository.mobile_rpg.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoredepository.mobile_rpg.BuildConfig;
import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.backend.files.ExportSheets;
import com.thecoredepository.mobile_rpg.backend.files.SavingSheets;
import com.thecoredepository.mobile_rpg.ui.AppContext;
import com.thecoredepository.mobile_rpg.ui.Theming;

import static com.thecoredepository.mobile_rpg.backend.OpenLegend.sheetList;
import static com.thecoredepository.mobile_rpg.backend.OpenLegend.sheets;
import static com.thecoredepository.mobile_rpg.backend.lists.OLFeats.featList;


public class MainActivity extends AppCompatActivity {

    public Context mContext = this;
    public Menu menu;
    private FirebaseAnalytics mFirebaseAnalytics;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppContext.mContext = mContext;
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //Load Ads
        ads();

        //Load Theme
        loadTheming();

        ConstraintLayout mainactivity_layout = findViewById(R.id.mainactivity_layout);
        mainactivity_layout.setBackgroundResource(Theming.getBackground());
        Spinner spinnerOL = findViewById(R.id.spinnerOL);
        Button btnSignIn = findViewById(R.id.btnSignIn);
        Button btnInfo = findViewById(R.id.btnInfo);
        Button btnDarkMode = findViewById(R.id.btnDarkMode);
        Button btnDownload = findViewById(R.id.btnDownload);
        Button btnOpenSheet = findViewById(R.id.btnOpenSheet);
        Button btnNewSheet = findViewById(R.id.btnNewSheet);
        Button btnDeleteSheet = findViewById(R.id.btnDeleteSheet);
        TextView txtVersion = findViewById(R.id.txtVersion);
        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);
        //txtVersion.setTextColor(Theming.getFontColor());

        //Preload Feats
        featList();

        //Load Saved Data
        final SavingSheets saveData = new SavingSheets();
        saveData.loadData(this);

        //Load Data into Spinner
        ArrayAdapter<String> adapterOL = new ArrayAdapter<String>(this, Theming.getSpinnerStyle(), sheetList);
        spinnerOL.setAdapter(adapterOL);
        //Load lastSheet
        SharedPreferences loadLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
        spinnerOL.setSelection(sheetList.indexOf(loadLastSheet.getString("lastSheet", "ERROR")));

        if (Theming.getThemeID() == 2) {
            btnDarkMode.setBackgroundResource(R.drawable.ic_sun);
        }

        btnOpenSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();
                Log.i("selected", selected);
                //Save lastSheet
                saveLastSheet(selected);
                //Log
                Bundle params = new Bundle();
                params.putString("sheet_name", selected);
                mFirebaseAnalytics.logEvent("open_sheet", params);
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), SheetActivity.class);
                in.putExtra("selected", selected);
                startActivity(in);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean featureReady = false;
                if (featureReady) {
                    //Log
                    Bundle params = new Bundle();
                    params.putString("sign_in", "Started Sign In");
                    mFirebaseAnalytics.logEvent("sign_in", params);
                    //New Sheet
                    Intent in = new Intent(getApplicationContext(), NewSheet.class);
                    startActivity(in);
                }
                else {
                    Toast.makeText(mContext, "Coming Soon...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean featureReady = true;
                if (featureReady) {
                    //Log
                    Bundle params = new Bundle();
                    params.putString("about", "Started About");
                    mFirebaseAnalytics.logEvent("about", params);
                    //About Us
                    Intent in;
                    in = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(in);
                }
                else {
                    Toast.makeText(mContext, "Coming Soon...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDarkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                                    btnDarkMode.setBackgroundResource(R.drawable.ic_sun);
                                }})
                            .setNegativeButton(android.R.string.no, null).show();
                }
                else {
                    Theming.setThemeID(1);
                    loadTheming(1);
                    updateTheme();
                    setTheme(R.style.AppTheme);
                    saveTheme(1);
                    btnDarkMode.setBackgroundResource(R.drawable.ic_moon);
                }
            }
        });

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean featureReady = false;

                if (featureReady) {
                    //Log
                    Bundle params = new Bundle();
                    params.putString("sign_in", "Started Sign In");
                    mFirebaseAnalytics.logEvent("sign_in", params);
                    //New Sheet
                    Intent in = new Intent(getApplicationContext(), NewSheet.class);
                    startActivity(in);
                }
                else {
                    Toast.makeText(mContext, "Coming Soon...", Toast.LENGTH_SHORT).show();
                    //requests.getRequest(mContext);
                }
            }
        });

        btnNewSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log
                Bundle params = new Bundle();
                params.putString("new_sheet", "Started New Sheet");
                mFirebaseAnalytics.logEvent("new_sheet", params);
                //New Sheet
                Intent in = new Intent(getApplicationContext(), NewSheet.class);
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
                                //Log
                                Bundle params = new Bundle();
                                params.putString("sheet_name", selected);
                                mFirebaseAnalytics.logEvent("delete_sheet", params);

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

    private void ads() {
        //Ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("AF2561E3607CBE6EAB2B78A1329365F0").build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                //Log
                Bundle params = new Bundle();
                params.putString("Ads", "Ads_Loaded");
                mFirebaseAnalytics.logEvent("Ads", params);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                //Log
                Bundle params = new Bundle();
                params.putString("Ads", "Ads_Clicked");
                mFirebaseAnalytics.logEvent("Ads", params);
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
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
        Intent in;
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
                Spinner spinnerOL = findViewById(R.id.spinnerOL);
                String selected = (String)spinnerOL.getSelectedItem();
                Log.i("selected", selected);
                //Log
                Bundle params = new Bundle();
                params.putString("sheet_name", selected);
                mFirebaseAnalytics.logEvent("export_sheet", params);

                //Check for Sheet
                if (sheetList.contains(selected))
                {
                    int index = 0;
                    index = sheetList.indexOf(selected);
                    ExportSheets.exportSheet(sheets.get(index));
                }
                break;
            case R.id.importSheet:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uploadSheet:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.downloadSheet:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                in = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(in);
                break;
            case R.id.account:
                Toast.makeText(this, "Coming Soon...", Toast.LENGTH_SHORT).show();
                in = new Intent(getApplicationContext(), AccountActivity.class);
                //startActivity(in);
                break;
            case R.id.corerules:
                openURL("https://openlegendrpg.com/core-rules/00-introduction");
                break;
            case R.id.encounters:
                openURL("https://encounters.heromuster.com/");
                break;
            case R.id.dndConversion:
                openURL("http://blog.openlegendrpg.com/5th-edition-dd-to-open-legend-character-conversion-guide/");
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void openURL(String url) {
        Uri uri = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(webIntent);
    }

    private void loadTheming() {
        Theming.setContext(mContext);

        int themeID = 1;

        Log.d("Load Theme", "Loading Theme...");
        try {
            SharedPreferences themePreferences = mContext.getSharedPreferences("theme", Context.MODE_PRIVATE);
            themeID = themePreferences.getInt("theme", 0);
            Log.d("Load Theme", "Loaded Theme: " + themeID);
        } catch (Exception e) {
            themeID = 1;
            Log.d("Load Theme", "Theme failed to load");
        }


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
        setThemeValues();
    }

    private void setThemeValues() {
        switch (Theming.getThemeID()) {
            case 1:
                Theming.setFontColor(getResources().getColor(R.color.text));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColored));
                Theming.setBackground(R.drawable.background_2);
                Theming.setTopbannerBG(R.drawable.ic_top_card);
                Theming.setButtonBG(R.drawable.custom_buttons_white);
                Theming.setCardViewBG("#FFFFFF");
                Theming.setSpinnerStyle(R.layout.spinner_style);
                break;
            case 2:
                Theming.setFontColor(getResources().getColor(R.color.textDarkTheme));
                Theming.setColoredFontColor(getResources().getColor(R.color.textColoredDarkTheme));
                Theming.setBackground(R.drawable.background_2);
                Theming.setTopbannerBG(R.drawable.ic_top_card_dark);
                Theming.setButtonBG(R.drawable.custom_buttons_dark);
                Theming.setCardViewBG("#1f1f1f");
                Theming.setSpinnerStyle(R.layout.spinner_style_dark);
                break;
        }
    }

    private void saveTheme(int themeID) {
        Log.d("Saving Theme", "Saving Theme: " + themeID);
        try {
            SharedPreferences themeSavePreferences = mContext.getSharedPreferences("theme", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = themeSavePreferences.edit();
            editor.putInt("theme", themeID);
            editor.commit();
            Log.d("Saved Theme", "Saved Theme: " + themeID);
        } catch (Exception e) {
            Log.d("Saved Theme", "Theme Saving Failed");
        }
    }

    private void loadTheming(int theme) {
        Theming.setContext(mContext);

        //Load Theme From Save if Any
        Theming.setThemeID(theme);

        //Set Theme According to Loaded Theme
        setThemeValues();
    }

    private void updateTheme() {
        ConstraintLayout mainactivity_layout = findViewById(R.id.mainactivity_layout);
        mainactivity_layout.setBackgroundResource(Theming.getBackground());
        TextView txtVersion = findViewById(R.id.txtVersion);
        //txtVersion.setTextColor(Theming.getFontColor());
    }

    private void saveLastSheet(String selected) {
        //Save lastSheet
        Log.d("Saving Sheet", "Saving Sheet");
        try {
            SharedPreferences saveLastSheet = getSharedPreferences("lastSheet", MODE_PRIVATE);
            SharedPreferences.Editor editor = saveLastSheet.edit();
            editor.putString("lastSheet", selected);
            editor.apply();
            Log.d("Saving Sheet", "Saving Sheet Success");
        } catch (Exception e) {
            Log.d("Saving Sheet", "Saving Sheet Failed");
        }
    }
}
