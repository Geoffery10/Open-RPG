package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLBanesBoonsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_baneboons);
        Intent intent = getIntent();
        String selected = intent.getExtras().getString("selected"); //Banes or Boons

        showBanesByStats();

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

        final LinearLayout infoBB14 = findViewById(R.id.infoBB14);
        Button btnBB14 = findViewById(R.id.btnBB14);
        btnBB14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB14.getVisibility() == View.VISIBLE)
                {
                    infoBB14.setVisibility(View.GONE);
                }
                else
                {
                    infoBB14.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB15 = findViewById(R.id.infoBB15);
        Button btnBB15 = findViewById(R.id.btnBB15);
        btnBB15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB15.getVisibility() == View.VISIBLE)
                {
                    infoBB15.setVisibility(View.GONE);
                }
                else
                {
                    infoBB15.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB16 = findViewById(R.id.infoBB16);
        Button btnBB16 = findViewById(R.id.btnBB16);
        btnBB16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB16.getVisibility() == View.VISIBLE)
                {
                    infoBB16.setVisibility(View.GONE);
                }
                else
                {
                    infoBB16.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB17 = findViewById(R.id.infoBB17);
        Button btnBB17 = findViewById(R.id.btnBB17);
        btnBB17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB17.getVisibility() == View.VISIBLE)
                {
                    infoBB17.setVisibility(View.GONE);
                }
                else
                {
                    infoBB17.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void showBanesByStats()
    {
        View viewBB01 = findViewById(R.id.viewBB01_1);
        viewBB01.setVisibility(View.GONE);
        View viewBB02 = findViewById(R.id.viewBB02_1);
        viewBB02.setVisibility(View.GONE);
        View viewBB03 = findViewById(R.id.viewBB03_1);
        viewBB03.setVisibility(View.GONE);
        View viewBB04 = findViewById(R.id.viewBB04_1);
        viewBB04.setVisibility(View.GONE);
        View viewBB05 = findViewById(R.id.viewBB05_1);
        viewBB05.setVisibility(View.GONE);
        View viewBB06 = findViewById(R.id.viewBB06_1);
        viewBB06.setVisibility(View.GONE);
        View viewBB07 = findViewById(R.id.viewBB07_1);
        viewBB07.setVisibility(View.GONE);
        View viewBB08 = findViewById(R.id.viewBB08_1);
        viewBB08.setVisibility(View.GONE);
        View viewBB09 = findViewById(R.id.viewBB09_1);
        viewBB09.setVisibility(View.GONE);
        View viewBB10 = findViewById(R.id.viewBB10_1);
        viewBB09.setVisibility(View.GONE);
        View viewBB11 = findViewById(R.id.viewBB11_1);
        viewBB11.setVisibility(View.GONE);
        View viewBB12 = findViewById(R.id.viewBB12_1);
        viewBB12.setVisibility(View.GONE);
        View viewBB13 = findViewById(R.id.viewBB13_1);
        viewBB13.setVisibility(View.GONE);
        View viewBB14 = findViewById(R.id.viewBB14_1);
        viewBB14.setVisibility(View.GONE);
        View viewBB15 = findViewById(R.id.viewBB15_1);
        viewBB15.setVisibility(View.GONE);
        View viewBB16 = findViewById(R.id.viewBB16_1);
        viewBB16.setVisibility(View.GONE);
        View viewBB17 = findViewById(R.id.viewBB17_1);
        viewBB17.setVisibility(View.GONE);

        if(player.getAlteration() >= 5 || player.getCreation() >= 5 || player.getEnergy() >= 5 || player.getEntropy() >= 5)
        {
            viewBB01.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 3)
        {
            viewBB02.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 4 || player.getEnergy() >= 4 || player.getEntropy() >= 4)
        {
            viewBB03.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 9 || player.getEntropy() >= 9)
        {
            viewBB04.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 3 || player.getEnergy() >= 3 || player.getEntropy() >= 3 || player.getInfluence() >= 3 || player.getMight() >= 3 || player.getPersuasion() >= 3 || player.getPresence() >= 3)
        {
            viewBB05.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 3 || player.getAlteration() >= 3 || player.getEnergy() >= 3 || player.getEntropy() >= 3 || player.getInfluence() >= 3 || player.getMight() >= 3 || player.getMovement() >= 3)
        {
            viewBB06.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 5)
        {
            viewBB07.setVisibility(View.VISIBLE);
        }
        if(player.getEntropy() >= 5)
        {
            viewBB08.setVisibility(View.VISIBLE);
        }
        if(player.getCreation() >= 5 || player.getEntropy() >= 5 || player.getInfluence() >= 5 || player.getMight() >= 5)
        {
            viewBB09.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 2 || player.getEnergy() >= 2 || player.getMight() >= 2 || player.getMovement() >= 2)
        {
            viewBB10.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 1 || player.getAlteration() >= 1 || player.getCreation() >= 1 || player.getEnergy() >= 1 || player.getEntropy() >= 1 || player.getInfluence() >= 1 || player.getMight() >= 1 || player.getMovement() >= 1)
        {
            viewBB11.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 5 || player.getEntropy() >= 5 || player.getInfluence() >= 5)
        {
            viewBB12.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 1 || player.getEnergy() >= 1 || player.getMight() >= 1 || player.getMovement() >= 1)
        {
            viewBB13.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 5)
        {
            viewBB14.setVisibility(View.VISIBLE);
        }
        if(player.getPrescience() >= 2)
        {
            viewBB15.setVisibility(View.VISIBLE);
        }
        if(player.getProtection() >= 1)
        {
            viewBB16.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 2 || player.getEnergy() >= 2 || player.getEntropy() >= 2)
        {
            viewBB17.setVisibility(View.VISIBLE);
        }
    }
}
