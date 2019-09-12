package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;

public class OLBanesBoonsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_baneboons);
        Intent intent = getIntent();
        String selected = intent.getExtras().getString("selected"); //Banes or Boons

        final LinearLayout infoBB01 = findViewById(R.id.infoBB01);
        Button btnBB01 = findViewById(R.id.btnBB01);
        btnBB01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB01.getVisibility() == View.VISIBLE)
                {
                    infoBB01.setVisibility(View.GONE);
                }
                else
                {
                    infoBB01.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB02 = findViewById(R.id.infoBB02);
        Button btnBB02 = findViewById(R.id.btnBB02);
        btnBB02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB02.getVisibility() == View.VISIBLE)
                {
                    infoBB02.setVisibility(View.GONE);
                }
                else
                {
                    infoBB02.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB03 = findViewById(R.id.infoBB03);
        Button btnBB03 = findViewById(R.id.btnBB03);
        btnBB03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB03.getVisibility() == View.VISIBLE)
                {
                    infoBB03.setVisibility(View.GONE);
                }
                else
                {
                    infoBB03.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB04 = findViewById(R.id.infoBB04);
        Button btnBB04 = findViewById(R.id.btnBB04);
        btnBB04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB04.getVisibility() == View.VISIBLE)
                {
                    infoBB04.setVisibility(View.GONE);
                }
                else
                {
                    infoBB04.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB05 = findViewById(R.id.infoBB05);
        Button btnBB05 = findViewById(R.id.btnBB05);
        btnBB05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB05.getVisibility() == View.VISIBLE)
                {
                    infoBB05.setVisibility(View.GONE);
                }
                else
                {
                    infoBB05.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB06 = findViewById(R.id.infoBB06);
        Button btnBB06 = findViewById(R.id.btnBB06);
        btnBB06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB06.getVisibility() == View.VISIBLE)
                {
                    infoBB06.setVisibility(View.GONE);
                }
                else
                {
                    infoBB06.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB07 = findViewById(R.id.infoBB07);
        Button btnBB07 = findViewById(R.id.btnBB07);
        btnBB07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB07.getVisibility() == View.VISIBLE)
                {
                    infoBB07.setVisibility(View.GONE);
                }
                else
                {
                    infoBB07.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB08 = findViewById(R.id.infoBB08);
        Button btnBB08 = findViewById(R.id.btnBB08);
        btnBB08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB08.getVisibility() == View.VISIBLE)
                {
                    infoBB08.setVisibility(View.GONE);
                }
                else
                {
                    infoBB08.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB09 = findViewById(R.id.infoBB09);
        Button btnBB09 = findViewById(R.id.btnBB09);
        btnBB09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB09.getVisibility() == View.VISIBLE)
                {
                    infoBB09.setVisibility(View.GONE);
                }
                else
                {
                    infoBB09.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB10 = findViewById(R.id.infoBB10);
        Button btnBB10 = findViewById(R.id.btnBB10);
        btnBB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB10.getVisibility() == View.VISIBLE)
                {
                    infoBB10.setVisibility(View.GONE);
                }
                else
                {
                    infoBB10.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB11 = findViewById(R.id.infoBB11);
        Button btnBB11 = findViewById(R.id.btnBB11);
        btnBB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB11.getVisibility() == View.VISIBLE)
                {
                    infoBB11.setVisibility(View.GONE);
                }
                else
                {
                    infoBB11.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB12 = findViewById(R.id.infoBB12);
        Button btnBB12 = findViewById(R.id.btnBB12);
        btnBB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB12.getVisibility() == View.VISIBLE)
                {
                    infoBB12.setVisibility(View.GONE);
                }
                else
                {
                    infoBB12.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB13 = findViewById(R.id.infoBB13);
        Button btnBB13 = findViewById(R.id.btnBB13);
        btnBB13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB13.getVisibility() == View.VISIBLE)
                {
                    infoBB13.setVisibility(View.GONE);
                }
                else
                {
                    infoBB13.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
