package com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend.openlegend.player;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend.openlegend.sheets;

public class SavingSheets
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

    public void saveImage(Uri sourceuri)
    {
        String sourceFilename= sourceuri.getPath();
        String destinationFilename = android.os.Environment.getExternalStorageDirectory().getPath()+File.separatorChar+"openrpg/"+player.getCharName()+".png";
        Log.d("Saving Image", "Saving at: " + destinationFilename);
        player.setImagePath(destinationFilename);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(sourceFilename));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFilename, false));
            byte[] buf = new byte[1024];
            bis.read(buf);
            do {
                bos.write(buf);
            } while(bis.read(buf) != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*public String loadImage() {

        String destinationFilename = android.os.Environment.getExternalStorageDirectory().getPath() + File.separatorChar + "/openrpg/" + player.getCharName() + ".png";
    }*/
}
