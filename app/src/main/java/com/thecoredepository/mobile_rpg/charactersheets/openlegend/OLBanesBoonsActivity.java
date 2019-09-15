package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        TextView txtBanesBoonsTitle = findViewById(R.id.txtBanesBoonsTitle);
        txtBanesBoonsTitle.setText(selected);

        //Display Banes/Boons
        if (selected.equals("Banes"))
        {
            showBanesByStats();
        }
        else if (selected.equals("Boons"))
        {
            showBoonsByStats();
        }
        else if (selected.equals("Banes/Boons"))
        {
            showBanesByStats();
            showBoonsByStats();
        }
        else //All
        {
            //Show All Banes/Boons
            int visibility = View.VISIBLE;
            baneVisibility(visibility);
            boonVisibility(visibility);

        }

        //Banes Buttons
        banesShowHideButtons();
        //boonsShowHideButtons();
    }

    private void banesShowHideButtons() {
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

        final LinearLayout infoBB18 = findViewById(R.id.infoBB18);
        Button btnBB18 = findViewById(R.id.btnBB18);
        btnBB18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB18.getVisibility() == View.VISIBLE)
                {
                    infoBB18.setVisibility(View.GONE);
                }
                else
                {
                    infoBB18.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB19 = findViewById(R.id.infoBB19);
        Button btnBB19 = findViewById(R.id.btnBB19);
        btnBB19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB19.getVisibility() == View.VISIBLE)
                {
                    infoBB19.setVisibility(View.GONE);
                }
                else
                {
                    infoBB19.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB20 = findViewById(R.id.infoBB20);
        Button btnBB20 = findViewById(R.id.btnBB20);
        btnBB20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB20.getVisibility() == View.VISIBLE)
                {
                    infoBB20.setVisibility(View.GONE);
                }
                else
                {
                    infoBB20.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB21 = findViewById(R.id.infoBB21);
        Button btnBB21 = findViewById(R.id.btnBB21);
        btnBB21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB21.getVisibility() == View.VISIBLE)
                {
                    infoBB21.setVisibility(View.GONE);
                }
                else
                {
                    infoBB21.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB22 = findViewById(R.id.infoBB22);
        Button btnBB22 = findViewById(R.id.btnBB22);
        btnBB22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB22.getVisibility() == View.VISIBLE)
                {
                    infoBB22.setVisibility(View.GONE);
                }
                else
                {
                    infoBB22.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB23 = findViewById(R.id.infoBB23);
        Button btnBB23 = findViewById(R.id.btnBB23);
        btnBB23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB23.getVisibility() == View.VISIBLE)
                {
                    infoBB23.setVisibility(View.GONE);
                }
                else
                {
                    infoBB23.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB24 = findViewById(R.id.infoBB24);
        Button btnBB24 = findViewById(R.id.btnBB24);
        btnBB24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB24.getVisibility() == View.VISIBLE)
                {
                    infoBB24.setVisibility(View.GONE);
                }
                else
                {
                    infoBB24.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB25 = findViewById(R.id.infoBB25);
        Button btnBB25 = findViewById(R.id.btnBB25);
        btnBB25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB25.getVisibility() == View.VISIBLE)
                {
                    infoBB25.setVisibility(View.GONE);
                }
                else
                {
                    infoBB25.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB26 = findViewById(R.id.infoBB26);
        Button btnBB26 = findViewById(R.id.btnBB26);
        btnBB26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB26.getVisibility() == View.VISIBLE)
                {
                    infoBB26.setVisibility(View.GONE);
                }
                else
                {
                    infoBB26.setVisibility(View.VISIBLE);
                }
            }
        });

        final LinearLayout infoBB27 = findViewById(R.id.infoBB27);
        Button btnBB27 = findViewById(R.id.btnBB27);
        btnBB27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoBB27.getVisibility() == View.VISIBLE)
                {
                    infoBB27.setVisibility(View.GONE);
                }
                else
                {
                    infoBB27.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void showBanesByStats()
    {
        //Hide Banes
        int visibility = View.GONE;
        baneVisibility(visibility);
        //Hide Boons
        boonVisibility(visibility);

        View viewBB01 = findViewById(R.id.viewBB01_1);
        View viewBB02 = findViewById(R.id.viewBB02_1);
        View viewBB03 = findViewById(R.id.viewBB03_1);
        View viewBB04 = findViewById(R.id.viewBB04_1);
        View viewBB05 = findViewById(R.id.viewBB05_1);
        View viewBB06 = findViewById(R.id.viewBB06_1);
        View viewBB07 = findViewById(R.id.viewBB07_1);
        View viewBB08 = findViewById(R.id.viewBB08_1);
        View viewBB09 = findViewById(R.id.viewBB09_1);
        View viewBB10 = findViewById(R.id.viewBB10_1);
        View viewBB11 = findViewById(R.id.viewBB11_1);
        View viewBB12 = findViewById(R.id.viewBB12_1);
        View viewBB13 = findViewById(R.id.viewBB13_1);
        View viewBB14 = findViewById(R.id.viewBB14_1);
        View viewBB15 = findViewById(R.id.viewBB15_1);
        View viewBB16 = findViewById(R.id.viewBB16_1);
        View viewBB17 = findViewById(R.id.viewBB17_1);
        View viewBB18 = findViewById(R.id.viewBB18_1);
        View viewBB19 = findViewById(R.id.viewBB19_1);
        View viewBB20 = findViewById(R.id.viewBB20_1);
        View viewBB21 = findViewById(R.id.viewBB21_1);
        View viewBB22 = findViewById(R.id.viewBB22_1);
        View viewBB23 = findViewById(R.id.viewBB23_1);
        View viewBB24 = findViewById(R.id.viewBB24_1);
        View viewBB25 = findViewById(R.id.viewBB25_1);
        View viewBB26 = findViewById(R.id.viewBB26_1);
        View viewBB27 = findViewById(R.id.viewBB27_1);

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
        if(player.getInfluence() >= 1)
        {
            viewBB18.setVisibility(View.VISIBLE);
        }
        if(player.getAlteration() >= 5)
        {
            viewBB19.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 4 || player.getCreation() >= 4 || player.getDeception() >= 4 || player.getEnergy() >= 4 || player.getInfluence() >= 4 || player.getMight() >= 4 || player.getPersuasion() >= 4 || player.getPrescience() >= 4)
        {
            viewBB20.setVisibility(View.VISIBLE);
        }
        if(player.getPrescience() >= 5)
        {
            viewBB21.setVisibility(View.VISIBLE);
        }
        if(player.getEntropy() >= 5)
        {
            viewBB22.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 2 || player.getAlteration() >= 2 || player.getEntropy() >= 2 || player.getMight() >= 2)
        {
            viewBB23.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 1 || player.getEnergy() >= 1 || player.getEntropy() >= 1 || player.getMight() >= 1 || player.getMovement() >= 1)
        {
            viewBB24.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 4 || player.getEnergy() >= 4 || player.getEntropy() >= 4 || player.getMight() >= 4)
        {
            viewBB25.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 7)
        {
            viewBB26.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 5)
        {
            viewBB27.setVisibility(View.VISIBLE);
        }
    }

    public void showBoonsByStats()
    {
        //Hide Banes
        int visibility = View.GONE;
        baneVisibility(visibility);
        //Hide Boons
        boonVisibility(visibility);

        View viewBB28 = findViewById(R.id.viewBB28_1);
        View viewBB29 = findViewById(R.id.viewBB29_1);
        View viewBB30 = findViewById(R.id.viewBB30_1);
        View viewBB31 = findViewById(R.id.viewBB31_1);
        View viewBB32 = findViewById(R.id.viewBB32_1);
        View viewBB33 = findViewById(R.id.viewBB33_1);
        View viewBB34 = findViewById(R.id.viewBB34_1);
        View viewBB35 = findViewById(R.id.viewBB35_1);
        View viewBB36 = findViewById(R.id.viewBB36_1);
        View viewBB37 = findViewById(R.id.viewBB37_1);
        View viewBB38 = findViewById(R.id.viewBB38_1);
        View viewBB39 = findViewById(R.id.viewBB39_1);
        View viewBB40 = findViewById(R.id.viewBB40_1);
        View viewBB41 = findViewById(R.id.viewBB41_1);
        View viewBB42 = findViewById(R.id.viewBB42_1);
        View viewBB43 = findViewById(R.id.viewBB43_1);
        View viewBB44 = findViewById(R.id.viewBB44_1);
        View viewBB45 = findViewById(R.id.viewBB45_1);
        View viewBB46 = findViewById(R.id.viewBB46_1);
        View viewBB47 = findViewById(R.id.viewBB47_1);
        View viewBB48 = findViewById(R.id.viewBB48_1);
        View viewBB49 = findViewById(R.id.viewBB49_1);
        View viewBB50 = findViewById(R.id.viewBB50_1);
        View viewBB51 = findViewById(R.id.viewBB51_1);
        View viewBB52 = findViewById(R.id.viewBB52_1);
        View viewBB53 = findViewById(R.id.viewBB53_1);
        View viewBB54 = findViewById(R.id.viewBB54_1);
        View viewBB55 = findViewById(R.id.viewBB55_1);
        View viewBB56 = findViewById(R.id.viewBB56_1);
        View viewBB57 = findViewById(R.id.viewBB57_1);
        View viewBB58 = findViewById(R.id.viewBB58_1);

        /*
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
        if(player.getInfluence() >= 1)
        {
            viewBB18.setVisibility(View.VISIBLE);
        }
        if(player.getAlteration() >= 5)
        {
            viewBB19.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 4 || player.getCreation() >= 4 || player.getDeception() >= 4 || player.getEnergy() >= 4 || player.getInfluence() >= 4 || player.getMight() >= 4 || player.getPersuasion() >= 4 || player.getPrescience() >= 4)
        {
            viewBB20.setVisibility(View.VISIBLE);
        }
        if(player.getPrescience() >= 5)
        {
            viewBB21.setVisibility(View.VISIBLE);
        }
        if(player.getEntropy() >= 5)
        {
            viewBB22.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 2 || player.getAlteration() >= 2 || player.getEntropy() >= 2 || player.getMight() >= 2)
        {
            viewBB23.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 1 || player.getEnergy() >= 1 || player.getEntropy() >= 1 || player.getMight() >= 1 || player.getMovement() >= 1)
        {
            viewBB24.setVisibility(View.VISIBLE);
        }
        if(player.getAgility() >= 4 || player.getEnergy() >= 4 || player.getEntropy() >= 4 || player.getMight() >= 4)
        {
            viewBB25.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 7)
        {
            viewBB26.setVisibility(View.VISIBLE);
        }
        if(player.getInfluence() >= 5)
        {
            viewBB27.setVisibility(View.VISIBLE);
        }

         */
    }

    private void baneVisibility(int visibility) {
        View viewBB01 = findViewById(R.id.viewBB01_1);
        View viewBB02 = findViewById(R.id.viewBB02_1);
        View viewBB03 = findViewById(R.id.viewBB03_1);
        View viewBB04 = findViewById(R.id.viewBB04_1);
        View viewBB05 = findViewById(R.id.viewBB05_1);
        View viewBB06 = findViewById(R.id.viewBB06_1);
        View viewBB07 = findViewById(R.id.viewBB07_1);
        View viewBB08 = findViewById(R.id.viewBB08_1);
        View viewBB09 = findViewById(R.id.viewBB09_1);
        View viewBB10 = findViewById(R.id.viewBB10_1);
        View viewBB11 = findViewById(R.id.viewBB11_1);
        View viewBB12 = findViewById(R.id.viewBB12_1);
        View viewBB13 = findViewById(R.id.viewBB13_1);
        View viewBB14 = findViewById(R.id.viewBB14_1);
        View viewBB15 = findViewById(R.id.viewBB15_1);
        View viewBB16 = findViewById(R.id.viewBB16_1);
        View viewBB17 = findViewById(R.id.viewBB17_1);
        View viewBB18 = findViewById(R.id.viewBB18_1);
        View viewBB19 = findViewById(R.id.viewBB19_1);
        View viewBB20 = findViewById(R.id.viewBB20_1);
        View viewBB21 = findViewById(R.id.viewBB21_1);
        View viewBB22 = findViewById(R.id.viewBB22_1);
        View viewBB23 = findViewById(R.id.viewBB23_1);
        View viewBB24 = findViewById(R.id.viewBB24_1);
        View viewBB25 = findViewById(R.id.viewBB25_1);
        View viewBB26 = findViewById(R.id.viewBB26_1);
        View viewBB27 = findViewById(R.id.viewBB27_1);

        viewBB01.setVisibility(visibility);
        viewBB02.setVisibility(visibility);
        viewBB03.setVisibility(visibility);
        viewBB04.setVisibility(visibility);
        viewBB05.setVisibility(visibility);
        viewBB06.setVisibility(visibility);
        viewBB07.setVisibility(visibility);
        viewBB08.setVisibility(visibility);
        viewBB09.setVisibility(visibility);
        viewBB09.setVisibility(visibility);
        viewBB10.setVisibility(visibility);
        viewBB11.setVisibility(visibility);
        viewBB12.setVisibility(visibility);
        viewBB13.setVisibility(visibility);
        viewBB14.setVisibility(visibility);
        viewBB15.setVisibility(visibility);
        viewBB16.setVisibility(visibility);
        viewBB17.setVisibility(visibility);
        viewBB18.setVisibility(visibility);
        viewBB19.setVisibility(visibility);
        viewBB20.setVisibility(visibility);
        viewBB21.setVisibility(visibility);
        viewBB22.setVisibility(visibility);
        viewBB23.setVisibility(visibility);
        viewBB24.setVisibility(visibility);
        viewBB25.setVisibility(visibility);
        viewBB26.setVisibility(visibility);
        viewBB27.setVisibility(visibility);
    }

    private void boonVisibility(int visibility) {
        View viewBB28 = findViewById(R.id.viewBB28_1);
        View viewBB29 = findViewById(R.id.viewBB29_1);
        View viewBB30 = findViewById(R.id.viewBB30_1);
        View viewBB31 = findViewById(R.id.viewBB31_1);
        View viewBB32 = findViewById(R.id.viewBB32_1);
        View viewBB33 = findViewById(R.id.viewBB33_1);
        View viewBB34 = findViewById(R.id.viewBB34_1);
        View viewBB35 = findViewById(R.id.viewBB35_1);
        View viewBB36 = findViewById(R.id.viewBB36_1);
        View viewBB37 = findViewById(R.id.viewBB37_1);
        View viewBB38 = findViewById(R.id.viewBB38_1);
        View viewBB39 = findViewById(R.id.viewBB39_1);
        View viewBB40 = findViewById(R.id.viewBB40_1);
        View viewBB41 = findViewById(R.id.viewBB41_1);
        View viewBB42 = findViewById(R.id.viewBB42_1);
        View viewBB43 = findViewById(R.id.viewBB43_1);
        View viewBB44 = findViewById(R.id.viewBB44_1);
        View viewBB45 = findViewById(R.id.viewBB45_1);
        View viewBB46 = findViewById(R.id.viewBB46_1);
        View viewBB47 = findViewById(R.id.viewBB47_1);
        View viewBB48 = findViewById(R.id.viewBB48_1);
        View viewBB49 = findViewById(R.id.viewBB49_1);
        View viewBB50 = findViewById(R.id.viewBB50_1);
        View viewBB51 = findViewById(R.id.viewBB51_1);
        View viewBB52 = findViewById(R.id.viewBB52_1);
        View viewBB53 = findViewById(R.id.viewBB53_1);
        View viewBB54 = findViewById(R.id.viewBB54_1);
        View viewBB55 = findViewById(R.id.viewBB55_1);
        View viewBB56 = findViewById(R.id.viewBB56_1);
        View viewBB57 = findViewById(R.id.viewBB57_1);
        View viewBB58 = findViewById(R.id.viewBB58_1);

        viewBB28.setVisibility(visibility);
        viewBB29.setVisibility(visibility);
        viewBB30.setVisibility(visibility);
        viewBB31.setVisibility(visibility);
        viewBB32.setVisibility(visibility);
        viewBB33.setVisibility(visibility);
        viewBB34.setVisibility(visibility);
        viewBB35.setVisibility(visibility);
        viewBB36.setVisibility(visibility);
        viewBB37.setVisibility(visibility);
        viewBB38.setVisibility(visibility);
        viewBB39.setVisibility(visibility);
        viewBB40.setVisibility(visibility);
        viewBB41.setVisibility(visibility);
        viewBB42.setVisibility(visibility);
        viewBB43.setVisibility(visibility);
        viewBB44.setVisibility(visibility);
        viewBB45.setVisibility(visibility);
        viewBB46.setVisibility(visibility);
        viewBB47.setVisibility(visibility);
        viewBB48.setVisibility(visibility);
        viewBB49.setVisibility(visibility);
        viewBB50.setVisibility(visibility);
        viewBB51.setVisibility(visibility);
        viewBB52.setVisibility(visibility);
        viewBB53.setVisibility(visibility);
        viewBB54.setVisibility(visibility);
        viewBB55.setVisibility(visibility);
        viewBB56.setVisibility(visibility);
        viewBB57.setVisibility(visibility);
        viewBB58.setVisibility(visibility);
    }
}
