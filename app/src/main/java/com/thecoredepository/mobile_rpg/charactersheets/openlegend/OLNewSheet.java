package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheetList;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.sheets;

public class OLNewSheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_newsheet);

        LinearLayout layoutBio = findViewById(R.id.layoutBio);
        layoutBio.setVisibility(View.VISIBLE);

        continueButtons();

        final TextView editMajorLvl = findViewById(R.id.editMajorLvl);
        final TextView editMinorLvl = findViewById(R.id.editMinorLvl);
        final TextView editLevel = findViewById(R.id.editLevel);

        plusLevelButtons(editMajorLvl, editMinorLvl, editLevel);
        minusLevelButtons(editMajorLvl, editMinorLvl, editLevel);

        final TextView editAgility = findViewById(R.id.editAgility);
        final TextView editFortitude = findViewById(R.id.editFortitude);
        final TextView editMight = findViewById(R.id.editMight);

        final TextView editLearning = findViewById(R.id.editLearning);
        final TextView editLogic = findViewById(R.id.editLogic);
        final TextView editPerception = findViewById(R.id.editPerception);
        final TextView editWill = findViewById(R.id.editWill);

        final TextView editDeception = findViewById(R.id.editDeception);
        final TextView editPersuasion = findViewById(R.id.editPersuasion);
        final TextView editPresence = findViewById(R.id.editPresence);

        final TextView editAlteration = findViewById(R.id.editAlteration);
        final TextView editCreation = findViewById(R.id.editCreation);
        final TextView editEnergy = findViewById(R.id.editEnergy);
        final TextView editEntropy = findViewById(R.id.editEntropy);
        final TextView editInfluence = findViewById(R.id.editInfluence);
        final TextView editMovement = findViewById(R.id.editMovement);
        final TextView editPrescience = findViewById(R.id.editPrescience);
        final TextView editProtection = findViewById(R.id.editProtection);

        final TextView editArmor = findViewById(R.id.editArmor);

        plusAttributeButtons(editAgility, editFortitude, editMight, editLearning, editLogic, editPerception, editWill, editDeception, editPersuasion, editPresence, editAlteration, editCreation, editEnergy, editEntropy, editInfluence, editMovement, editPrescience, editProtection, editArmor);
        minusAttributeButtons(editAgility, editFortitude, editMight, editLearning, editLogic, editPerception, editWill, editDeception, editPersuasion, editPresence, editAlteration, editCreation, editEnergy, editEntropy, editInfluence, editMovement, editPrescience, editProtection, editArmor);

        baneboonButtons();
    }

    private void plusLevelButtons(final TextView editMajorLvl, final TextView editMinorLvl, final TextView editLevel) {
        ImageButton btnMajorLvlPlus = findViewById(R.id.btnMajorLvlPlus);
        btnMajorLvlPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
        ImageButton btnMinorLvlPlus = findViewById(R.id.btnMinorLvlPlus);
        btnMinorLvlPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
        ImageButton btnLevelPlus = findViewById(R.id.btnLevelPlus);
        btnLevelPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                player.setLevelTotal(player.getLevelTotal() +  1);
                editLevel.setText(""+player.getLevelTotal());
                player.setLevel();
                editMajorLvl.setText(""+player.getMajorLvl());
                editMinorLvl.setText(""+player.getMinorLvl());
            }
        });
    }

    private void minusLevelButtons(final TextView editMajorLvl, final TextView editMinorLvl, final TextView editLevel) {
        ImageButton btnMajorLvlPlus = findViewById(R.id.btnMajorLvlPlus);
        btnMajorLvlPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
        ImageButton btnMinorLvlPlus = findViewById(R.id.btnMinorLvlPlus);
        btnMinorLvlPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
        ImageButton btnLevelPlus = findViewById(R.id.btnLevelPlus);
        btnLevelPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                player.setLevelTotal(player.getLevelTotal() +  1);
                editLevel.setText(""+player.getLevelTotal());
                player.setLevel();
                editMajorLvl.setText(""+player.getMajorLvl());
                editMinorLvl.setText(""+player.getMinorLvl());
            }
        });
    }

    private void baneboonButtons() {
        Button btnBanes = findViewById(R.id.btnBanes);
        btnBanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                toBanes();
            }
        });
        Button btnBoons = findViewById(R.id.btnBoons);
        btnBoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                toBoons();
            }
        });
    }

    private void plusAttributeButtons(final TextView editAgility, final TextView editFortitude, final TextView editMight, final TextView editLearning, final TextView editLogic, final TextView editPerception, final TextView editWill, final TextView editDeception, final TextView editPersuasion, final TextView editPresence, final TextView editAlteration, final TextView editCreation, final TextView editEnergy, final TextView editEntropy, final TextView editInfluence, final TextView editMovement, final TextView editPrescience, final TextView editProtection, final TextView editArmor) {

        ImageButton btnAgilityPlus = findViewById(R.id.btnAgilityPlus);
        ImageButton btnFortitudePlus = findViewById(R.id.btnFortitudePlus);
        ImageButton btnMightPlus = findViewById(R.id.btnMightPlus);

        ImageButton btnLearningPlus = findViewById(R.id.btnLearningPlus);
        ImageButton btnLogicPlus = findViewById(R.id.btnLogicPlus);
        ImageButton btnPerceptionPlus = findViewById(R.id.btnPerceptionPlus);
        ImageButton btnWillPlus = findViewById(R.id.btnWillPlus);

        ImageButton btnDeceptionPlus = findViewById(R.id.btnDeceptionPlus);
        ImageButton btnPersuasionPlus = findViewById(R.id.btnPersuasionPlus);
        ImageButton btnPresencePlus = findViewById(R.id.btnPresencePlus);

        ImageButton btnAlterationPlus = findViewById(R.id.btnAlterationPlus);
        ImageButton btnCreationPlus = findViewById(R.id.btnCreationPlus);
        ImageButton btnEnergyPlus = findViewById(R.id.btnEnergyPlus);
        ImageButton btnEntropyPlus = findViewById(R.id.btnEntropyPlus);
        ImageButton btnInfluencePlus = findViewById(R.id.btnInfluencePlus);
        ImageButton btnMovementPlus = findViewById(R.id.btnMovementPlus);
        ImageButton btnPresciencePlus = findViewById(R.id.btnPresciencePlus);
        ImageButton btnProtectionPlus = findViewById(R.id.btnProtectionPlus);

        ImageButton btnArmorPlus = findViewById(R.id.btnArmorPlus);

        btnAgilityPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getAgility() + 1) <= maxScore)
                {
                    player.setAgility(player.getAgility() + 1);
                    editAgility.setText(""+player.getAgility());
                    updateAttributes();
                }
            }
        });
        btnFortitudePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getFortitude() + 1) <= maxScore) {
                    player.setFortitude(player.getFortitude() + 1);
                    editFortitude.setText("" + player.getFortitude());
                    updateAttributes();
                }
            }
        });
        btnMightPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getMight() + 1) <= maxScore) {
                    player.setMight(player.getMight() + 1);
                    editMight.setText("" + player.getMight());
                    updateAttributes();
                }
            }
        });

        btnLearningPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getLearning() + 1) <= maxScore) {
                    player.setLearning(player.getLearning() + 1);
                    editLearning.setText("" + player.getLearning());
                    updateAttributes();
                }
            }
        });
        btnLogicPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getLogic() + 1) <= maxScore) {
                    player.setLogic(player.getLogic() + 1);
                    editLogic.setText("" + player.getLogic());
                    updateAttributes();
                }
            }
        });
        btnPerceptionPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getPerception() + 1) <= maxScore) {
                    player.setPerception(player.getPerception() + 1);
                    editPerception.setText("" + player.getPerception());
                    updateAttributes();
                }
            }
        });
        btnWillPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getWill() + 1) <= maxScore) {
                    player.setWill(player.getWill() + 1);
                    editWill.setText("" + player.getWill());
                    updateAttributes();
                }
            }
        });

        btnDeceptionPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getDeception() + 1) <= maxScore) {
                    player.setDeception(player.getDeception() + 1);
                    editDeception.setText("" + player.getDeception());
                    updateAttributes();
                }
            }
        });
        btnPersuasionPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getPersuasion() + 1) <= maxScore) {
                    player.setPersuasion(player.getPersuasion() + 1);
                    editPersuasion.setText("" + player.getPersuasion());
                    updateAttributes();
                }
            }
        });
        btnPresencePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getPresence() + 1) <= maxScore) {
                    player.setPresence(player.getPresence() + 1);
                    editPresence.setText("" + player.getPresence());
                    updateAttributes();
                }
            }
        });

        btnAlterationPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getAlteration() + 1) <= maxScore) {
                    player.setAlteration(player.getAlteration() + 1);
                    editAlteration.setText("" + player.getAlteration());
                    updateAttributes();
                }
            }
        });
        btnCreationPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getCreation() + 1) <= maxScore) {
                    player.setCreation(player.getCreation() + 1);
                    editCreation.setText("" + player.getCreation());
                    updateAttributes();
                }
            }
        });
        btnEnergyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getEnergy() + 1) <= maxScore) {
                    player.setEnergy(player.getEnergy() + 1);
                    editEnergy.setText("" + player.getEnergy());
                    updateAttributes();
                }
            }
        });
        btnEntropyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getEntropy() + 1) <= maxScore) {
                    player.setEntropy(player.getEntropy() + 1);
                    editEntropy.setText("" + player.getEntropy());
                    updateAttributes();
                }
            }
        });
        btnInfluencePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getInfluence() + 1) <= maxScore) {
                    player.setInfluence(player.getInfluence() + 1);
                    editInfluence.setText("" + player.getInfluence());
                    updateAttributes();
                }
            }
        });
        btnMovementPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getMovement() + 1) <= maxScore) {
                    player.setMovement(player.getMovement() + 1);
                    editMovement.setText("" + player.getMovement());
                    updateAttributes();
                }
            }
        });
        btnPresciencePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getPrescience() + 1) <= maxScore) {
                    player.setPrescience(player.getPrescience() + 1);
                    editPrescience.setText("" + player.getPrescience());
                    updateAttributes();
                }
            }
        });
        btnProtectionPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int maxScore = getMaxScore();
                if ((player.getProtection() + 1) <= maxScore) {
                    player.setProtection(player.getProtection() + 1);
                    editProtection.setText("" + player.getProtection());
                    updateAttributes();
                }
            }
        });

        btnArmorPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                player.setArmor(player.getArmor() + 1);
                editArmor.setText(""+player.getArmor());
                updateAttributes();
            }
        });
    }

    private void minusAttributeButtons(final TextView editAgility, final TextView editFortitude, final TextView editMight, final TextView editLearning, final TextView editLogic, final TextView editPerception, final TextView editWill, final TextView editDeception, final TextView editPersuasion, final TextView editPresence, final TextView editAlteration, final TextView editCreation, final TextView editEnergy, final TextView editEntropy, final TextView editInfluence, final TextView editMovement, final TextView editPrescience, final TextView editProtection, final TextView editArmor) {

        ImageButton btnAgilityMinus = findViewById(R.id.btnAgilityMinus);
        ImageButton btnFortitudeMinus = findViewById(R.id.btnFortitudeMinus);
        ImageButton btnMightMinus = findViewById(R.id.btnMightMinus);

        ImageButton btnLearningMinus = findViewById(R.id.btnLearningMinus);
        ImageButton btnLogicMinus = findViewById(R.id.btnLogicMinus);
        ImageButton btnPerceptionMinus = findViewById(R.id.btnPerceptionMinus);
        ImageButton btnWillMinus = findViewById(R.id.btnWillMinus);

        ImageButton btnDeceptionMinus = findViewById(R.id.btnDeceptionMinus);
        ImageButton btnPersuasionMinus = findViewById(R.id.btnPersuasionMinus);
        ImageButton btnPresenceMinus = findViewById(R.id.btnPresenceMinus);

        ImageButton btnAlterationMinus = findViewById(R.id.btnAlterationMinus);
        ImageButton btnCreationMinus = findViewById(R.id.btnCreationMinus);
        ImageButton btnEnergyMinus = findViewById(R.id.btnEnergyMinus);
        ImageButton btnEntropyMinus = findViewById(R.id.btnEntropyMinus);
        ImageButton btnInfluenceMinus = findViewById(R.id.btnInfluenceMinus);
        ImageButton btnMovementMinus = findViewById(R.id.btnMovementMinus);
        ImageButton btnPrescienceMinus = findViewById(R.id.btnPrescienceMinus);
        ImageButton btnProtectionMinus = findViewById(R.id.btnProtectionMinus);

        ImageButton btnArmorMinus = findViewById(R.id.btnArmorMinus);

        btnAgilityMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getAgility() - 1) >= 0)
                {
                    player.setAgility(player.getAgility() - 1);
                    editAgility.setText(""+player.getAgility());
                    updateAttributes();
                }
            }
        });
        btnFortitudeMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getFortitude() - 1) >= 0) {
                    player.setFortitude(player.getFortitude() - 1);
                    editFortitude.setText("" + player.getFortitude());
                    updateAttributes();
                }
            }
        });
        btnMightMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getMight() - 1) >= 0) {
                    player.setMight(player.getMight() - 1);
                    editMight.setText("" + player.getMight());
                    updateAttributes();
                }
            }
        });

        btnLearningMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getLearning() - 1) >= 0) {
                    player.setLearning(player.getLearning() - 1);
                    editLearning.setText("" + player.getLearning());
                    updateAttributes();
                }
            }
        });
        btnLogicMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getLogic() - 1) >= 0) {
                    player.setLogic(player.getLogic() - 1);
                    editLogic.setText("" + player.getLogic());
                    updateAttributes();
                }
            }
        });
        btnPerceptionMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getPerception() - 1) >= 0) {
                    player.setPerception(player.getPerception() - 1);
                    editPerception.setText("" + player.getPerception());
                    updateAttributes();
                }
            }
        });
        btnWillMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getWill() - 1) >= 0) {
                    player.setWill(player.getWill() - 1);
                    editWill.setText("" + player.getWill());
                    updateAttributes();
                }
            }
        });

        btnDeceptionMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getDeception() - 1) >= 0) {
                    player.setDeception(player.getDeception() - 1);
                    editDeception.setText("" + player.getDeception());
                    updateAttributes();
                }
            }
        });
        btnPersuasionMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getPersuasion() - 1) >= 0) {
                    player.setPersuasion(player.getPersuasion() - 1);
                    editPersuasion.setText("" + player.getPersuasion());
                    updateAttributes();
                }
            }
        });
        btnPresenceMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getPresence() - 1) >= 0) {
                    player.setPresence(player.getPresence() - 1);
                    editPresence.setText("" + player.getPresence());
                    updateAttributes();
                }
            }
        });

        btnAlterationMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getAlteration() - 1) >= 0) {
                    player.setAlteration(player.getAlteration() - 1);
                    editAlteration.setText("" + player.getAlteration());
                    updateAttributes();
                }
            }
        });
        btnCreationMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getCreation() - 1) >= 0) {
                    player.setCreation(player.getCreation() - 1);
                    editCreation.setText("" + player.getCreation());
                    updateAttributes();
                }
            }
        });
        btnEnergyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getEnergy() - 1) >= 0) {
                    player.setEnergy(player.getEnergy() - 1);
                    editEnergy.setText("" + player.getEnergy());
                    updateAttributes();
                }
            }
        });
        btnEntropyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getEntropy() - 1) >= 0) {
                    player.setEntropy(player.getEntropy() - 1);
                    editEntropy.setText("" + player.getEntropy());
                    updateAttributes();
                }
            }
        });
        btnInfluenceMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getInfluence() - 1) >= 0) {
                    player.setInfluence(player.getInfluence() - 1);
                    editInfluence.setText("" + player.getInfluence());
                    updateAttributes();
                }
            }
        });
        btnMovementMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getMovement() - 1) >= 0) {
                    player.setMovement(player.getMovement() - 1);
                    editMovement.setText("" + player.getMovement());
                    updateAttributes();
                }
            }
        });
        btnPrescienceMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if ((player.getPrescience() - 1) >= 0) {
                    player.setPrescience(player.getPrescience() - 1);
                    editPrescience.setText("" + player.getPrescience());
                    updateAttributes();
                }
            }
        });
        btnProtectionMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                
                if ((player.getProtection() - 1) >= 0) {
                    player.setProtection(player.getProtection() - 1);
                    editProtection.setText("" + player.getProtection());
                    updateAttributes();
                }
            }
        });

        btnArmorMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if ((player.getArmor() - 1) >= 0) {
                    player.setArmor(player.getArmor() - 1);
                    editArmor.setText("" + player.getArmor());
                    updateAttributes();
                }
            }
        });
    }

    private void updateAttributes()
    {
        player.setStats();
        player.setGetAttributePointsUsed();
        player.setAttributePointsAvailable(player.getType());
        TextView txtAttributes = findViewById(R.id.txtAttributes);
        txtAttributes.setText("Attributes: " + player.getGetAttributePointsUsed() +"/"+ player.getAttributePointsAvailable());
        txtAttributes = findViewById(R.id.txtAttributes2);
        txtAttributes.setText("Attributes: " + player.getGetAttributePointsUsed() +"/"+ player.getAttributePointsAvailable());
        TextView txtToughness = findViewById(R.id.txtToughness);
        txtToughness.setText("Toughness: " + player.getToughness());
        TextView txtGuard = findViewById(R.id.txtGuard);
        txtGuard.setText("Guard: " + (player.getGuard()));
        TextView txtResolve = findViewById(R.id.txtResolve);
        txtResolve.setText("Resolve: " + player.getResolve());
        TextView txtHitpoints = findViewById(R.id.txtHitpoints);
        txtHitpoints.setText("Hitpoints: " + (player.getHitpoints()));

    }

    private int getMaxScore() {
        int maxScore = 0;
        if (player.getLevelTotal() <= 3) {
            maxScore = 5;
        }
        else if (player.getLevelTotal() <= 9) {
            maxScore = 6;
        }
        else if (player.getLevelTotal() <= 15) {
            maxScore = 7;
        }
        else if (player.getLevelTotal() <= 21) {
            maxScore = 8;
        }
        else {
            maxScore = 9;
        }
        return maxScore;
    }

    private void continueButtons() {
        Button btnContinue01 = findViewById(R.id.btnContinue01);
        Button btnContinue02 = findViewById(R.id.btnContinue02);
        Button btnContinue03 = findViewById(R.id.btnContinue03);
        Button btnContinue04 = findViewById(R.id.btnContinue04);
        Button btnContinue05 = findViewById(R.id.btnContinue05);
        Button btnContinue06 = findViewById(R.id.btnContinue06);

        btnContinue01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //REQUIRE CHARACTER NAME
                EditText txtCharName = findViewById(R.id.txtCharName);
                if (txtCharName.getText().toString().trim().length() > 0)
                {
                    getBioSection(txtCharName);

                    LinearLayout layoutBio = findViewById(R.id.layoutBio);
                    layoutBio.setVisibility(View.GONE);
                    LinearLayout layoutLang = findViewById(R.id.layoutLang);
                    layoutLang.setVisibility(View.VISIBLE);
                }
            }
        });

        btnContinue02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Languages aren't required
                LinearLayout layoutLang = findViewById(R.id.layoutLang);
                layoutLang.setVisibility(View.GONE);
                LinearLayout layoutLevel = findViewById(R.id.layoutLevel);
                layoutLevel.setVisibility(View.VISIBLE);
            }
        });

        btnContinue03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Level 0 if blank
                LinearLayout layoutLevel = findViewById(R.id.layoutLevel);
                layoutLevel.setVisibility(View.GONE);
                LinearLayout layoutAttributes = findViewById(R.id.layoutAttributes);
                layoutAttributes.setVisibility(View.VISIBLE);
                updateAttributes();
            }
        });

        btnContinue04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Speed 0 if none
                LinearLayout layoutAttributes = findViewById(R.id.layoutAttributes);
                layoutAttributes.setVisibility(View.GONE);
                LinearLayout layoutFeats = findViewById(R.id.layoutFeats);
                layoutFeats.setVisibility(View.VISIBLE);
            }
        });

        btnContinue05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //FEATS aren't required
                LinearLayout layoutFeats = findViewById(R.id.layoutFeats);
                layoutFeats.setVisibility(View.GONE);
                LinearLayout layoutInventory = findViewById(R.id.layoutInventory);
                layoutInventory.setVisibility(View.VISIBLE);
            }
        });

        btnContinue06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Items aren't required
                LinearLayout layoutInventory = findViewById(R.id.layoutInventory);
                layoutInventory.setVisibility(View.GONE);
                //Open Sheet
                Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
                sheets.add(player);
                sheetList.add(player.getCharName());
                in.putExtra("selected", player.getCharName());
                startActivity(in);
            }
        });
    }

    private void getBioSection(EditText txtCharName) {
        player.setCharName(""+txtCharName.getText());
        EditText txtNickName = findViewById(R.id.txtNickName);
        player.setNickname(""+txtNickName.getText());
        EditText txtDeity = findViewById(R.id.txtDeity);
        if (txtDeity.getText().toString().trim().length() > 0) {
            player.setDeity(""+txtDeity.getText());
        }
        else {
            player.setDeity("No Deity");
        }
        getPlayerType();
        EditText txtBioEdit = findViewById(R.id.txtBioEdit);
        player.setBio(""+txtBioEdit.getText());
    }

    private void getPlayerType() {
        Spinner spinnerType = findViewById(R.id.spinnerType);
        String type = (String)spinnerType.getSelectedItem();
        if (type.equals("Player Character")) {
            type = "pc";
        }
        else if (type.equals("Companion Character - I")) {
            type = "ccI";
        }
        else if (type.equals("Companion Character - II")) {
            type = "ccII";
        }
        else if (type.equals("Companion Character - III")) {
            type = "ccIII";
        }
        else {
            Log.i("Type", "Error: "+type);
            type = "pc";
        }
        player.setType(type);
    }

    private void toBanes()
    {
        Intent in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
        in.putExtra("selected", "Banes");
        startActivity(in);
    }

    private void toBoons()
    {
        Intent in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
        in.putExtra("selected", "Boons");
        startActivity(in);
    }
}
