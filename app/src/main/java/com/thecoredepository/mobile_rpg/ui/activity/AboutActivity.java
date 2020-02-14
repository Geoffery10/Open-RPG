package com.thecoredepository.mobile_rpg.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.ui.Theming;

public class AboutActivity extends AppCompatActivity
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
        Button btnTester = findViewById(R.id.btnTester);

        ImageView imgGeoffery = findViewById(R.id.imgGeoffery);
        ImageView imgConnor = findViewById(R.id.imgConnor);
        TextView txtGeofferyName = findViewById(R.id.txtGeofferyName);
        txtGeofferyName.setTextColor(Theming.getFontColor());
        TextView txtConnorName = findViewById(R.id.txtConnorName);
        txtConnorName.setTextColor(Theming.getFontColor());
        TextView txtDevs = findViewById(R.id.txtDevs);
        txtDevs.setTextColor(Theming.getColoredFontColor());

        btnTester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://appdistribution.firebase.dev/i/B74jmJty");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(webIntent);
            }
        });

        /*try {
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL("").getContent());
            imgGeoffery.setImageBitmap(bitmap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
