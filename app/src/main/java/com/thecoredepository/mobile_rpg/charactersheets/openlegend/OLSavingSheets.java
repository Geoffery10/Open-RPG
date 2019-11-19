package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;

public class OLSavingSheets
{

    public void saveData(Context context)
    {
        SharedPreferences sheetPreferences = context.getSharedPreferences("sheetList", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sheetPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(sheetList);
        editor.putString("sheetList", json);
        editor.apply();

        SharedPreferences sheetsPreferences = context.getSharedPreferences("sheets", Context.MODE_PRIVATE);
        editor = sheetsPreferences.edit();
        gson = new Gson();
        json = gson.toJson(sheets);
        editor.putString("sheets", json);
        editor.apply();
    }

    public void loadData(Context context)
    {
        SharedPreferences sheetPreferences = context.getSharedPreferences("sheetList", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sheetPreferences.getString("sheetList", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        sheetList = gson.fromJson(json, type);

        SharedPreferences sheetsPreferences = context.getSharedPreferences("sheets", Context.MODE_PRIVATE);
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
