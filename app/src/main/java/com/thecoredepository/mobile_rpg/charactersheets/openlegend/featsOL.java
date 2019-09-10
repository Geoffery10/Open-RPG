package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class featsOL
{
    private String title;
    private int level;
    private int featCost;
    private int featCostTotal;
    private String description;
    private String prerequisites;
    private String effects;
    private String special;

    public void featList(Context context)
    {
        featsOL[] list = new featsOL[53];
        /*
        String text = "";
        try {
            InputStream input = context.getAssets().open("feats.txt");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
            text = new String(buffer);
        }catch (IOException ex){
            ex.printStackTrace();
        }

        for (int i = 0; i <= 53; i++)
        {

        }

         */
    }
}