package com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.Theming;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class AboutActivity  extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent = getIntent();

        ConstraintLayout aboutView = findViewById(R.id.aboutView);
        aboutView.setBackgroundResource(Theming.getBackground());
        TextView txtAboutHeader = findViewById(R.id.txtAboutHeader);
        txtAboutHeader.setTextColor(Theming.getColoredFontColor());
        TextView txtAbout_01 = findViewById(R.id.txtAbout_01);
        txtAbout_01.setTextColor(Theming.getFontColor());

        ImageView imgGeoffery = findViewById(R.id.imgGeoffery);
        try {
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL("").getContent());
            imgGeoffery.setImageBitmap(bitmap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
