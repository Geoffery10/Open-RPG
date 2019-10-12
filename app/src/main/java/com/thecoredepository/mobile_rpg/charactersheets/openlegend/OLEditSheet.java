package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLEditSheet extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_editsheet);

        //Initialization of Elements
        TextView txtName = findViewById(R.id.txtCharName);
        txtName.setText(player.getCharName());
        TextView txtNickName = findViewById(R.id.txtNickName);
        if (!(player.getNickname().equals(""))) {
            txtNickName.setText("(" + player.getNickname() + ")");
            txtNickName.setVisibility(View.VISIBLE);
        }
        else {
            txtNickName.setVisibility(View.GONE);
        }
        TextView txtLvl = findViewById(R.id.txtLvl);
        txtLvl.setText("Level: " + (player.getMajorLvl()) + " (" + (player.getMinorLvl()) + ")");
        TextView txtDeity = findViewById(R.id.txtDeity);
        txtDeity.setText(player.getDeity());
        TextView txtLang = findViewById(R.id.txtLang);
        //String lang = "";
        //lang = getLangs(lang);
        //txtLang.setText("Languages: " + (lang));
        TextView txtBio = findViewById(R.id.txtBio);
        txtBio.setText("Bio: " + (player.getBio()));
        TextView txtAttributes = findViewById(R.id.txtAttributes);
        txtAttributes.setText("Attributes: " + player.getGetAttributePointsUsed() +"/"+ player.getAttributePointsAvailable());
        TextView txtToughness = findViewById(R.id.txtToughness);
        txtToughness.setText("Toughness: " + player.getToughness());
        TextView txtGuard = findViewById(R.id.txtGuard);
        txtGuard.setText("Guard: " + (player.getGuard()));
        TextView txtResolve = findViewById(R.id.txtResolve);
        txtResolve.setText("Resolve: " + player.getResolve());
        TextView txtHitpoints = findViewById(R.id.txtHitpoints);
        txtHitpoints.setText("Hitpoints: " + (player.getDamageTaken()) + "/" +(player.getHitpoints()));
        TextView txtSpeed = findViewById(R.id.txtSpeed);
        txtSpeed.setText("Speed: " + (player.getSpeed()));

        //Attributes
        TextView txtAgility = findViewById(R.id.txtAgility);
        LinearLayout LLAgility = findViewById(R.id.LLAgility);
        Button btnAgility = findViewById(R.id.btnAgility);
        TextView txtFortitude = findViewById(R.id.txtFortitude);
        LinearLayout LLFortitude = findViewById(R.id.LLFortitude);
        Button btnFortitude = findViewById(R.id.btnFortitude);
        TextView txtMight = findViewById(R.id.txtMight);
        LinearLayout LLMight = findViewById(R.id.LLMight);
        Button btnMight = findViewById(R.id.btnMight);
        TextView txtLearning = findViewById(R.id.txtLearning);
        LinearLayout LLLearning = findViewById(R.id.LLLearning);
        Button btnLearning = findViewById(R.id.btnLearning);
        TextView txtLogic = findViewById(R.id.txtLogic);
        LinearLayout LLLogic = findViewById(R.id.LLLogic);
        Button btnLogic = findViewById(R.id.btnLogic);
        TextView txtPerception = findViewById(R.id.txtPerception);
        LinearLayout LLPerception = findViewById(R.id.LLPerception);
        Button btnPerception = findViewById(R.id.btnPerception);
        TextView txtWill = findViewById(R.id.txtWill);
        LinearLayout LLWill = findViewById(R.id.LLWill);
        Button btnWill = findViewById(R.id.btnWill);
        TextView txtDeception = findViewById(R.id.txtDeception);
        LinearLayout LLDeception = findViewById(R.id.LLDeception);
        Button btnDeception = findViewById(R.id.btnDeception);
        TextView txtPersuasion = findViewById(R.id.txtPersuasion);
        LinearLayout LLPersuasion = findViewById(R.id.LLPersuasion);
        Button btnPersuasion = findViewById(R.id.btnPersuasion);
        TextView txtPresence = findViewById(R.id.txtPresence);
        LinearLayout LLPresence = findViewById(R.id.LLPresence);
        Button btnPresence = findViewById(R.id.btnPresence);
        TextView txtAlteration = findViewById(R.id.txtAlteration);
        LinearLayout LLAlteration = findViewById(R.id.LLAlteration);
        Button btnAlteration = findViewById(R.id.btnAlteration);
        TextView txtCreation = findViewById(R.id.txtCreation);
        LinearLayout LLCreation = findViewById(R.id.LLCreation);
        Button btnCreation = findViewById(R.id.btnCreation);
        TextView txtEnergy = findViewById(R.id.txtEnergy);
        LinearLayout LLEnergy = findViewById(R.id.LLEnergy);
        Button btnEnergy = findViewById(R.id.btnEnergy);
        TextView txtEntropy = findViewById(R.id.txtEntropy);
        LinearLayout LLEntropy = findViewById(R.id.LLEntropy);
        Button btnEntropy = findViewById(R.id.btnEntropy);
        TextView txtInfluence = findViewById(R.id.txtInfluence);
        LinearLayout LLInfluence = findViewById(R.id.LLInfluence);
        Button btnInfluence = findViewById(R.id.btnInfluence);
        TextView txtMovement = findViewById(R.id.txtMovement);
        LinearLayout LLMovement = findViewById(R.id.LLMovement);
        Button btnMovement = findViewById(R.id.btnMovement);
        TextView txtPrescience = findViewById(R.id.txtPrescience);
        LinearLayout LLPrescience = findViewById(R.id.LLPrescience);
        Button btnPrescience = findViewById(R.id.btnPrescience);
        TextView txtProtection = findViewById(R.id.txtProtection);
        LinearLayout LLProtection = findViewById(R.id.LLProtection);
        Button btnProtection = findViewById(R.id.btnProtection);

        Button btnInventory = findViewById(R.id.btnInventory);
        Button btnBanes = findViewById(R.id.btnBanes);
        Button btnBoons = findViewById(R.id.btnBoons);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnFeats = findViewById(R.id.btnFeats);

        //THIS IS BEING REPLACED BY FEATS MENU
        TextView txtFeats = findViewById(R.id.txtFeats);
        txtFeats.setVisibility(View.GONE);

        //Button Clicks
        buttonClicks(btnBanes, btnBoons, btnInventory, btnSave);

        //Element Visibility and Values
        setAttributes(txtAgility, LLAgility, btnAgility, txtFortitude, LLFortitude, btnFortitude, txtMight, LLMight, btnMight, txtLearning, LLLearning, btnLearning, txtLogic, LLLogic, btnLogic, txtPerception, LLPerception, btnPerception, txtWill, LLWill, btnWill, txtDeception, LLDeception, btnDeception, txtPersuasion, LLPersuasion, btnPersuasion, txtPresence, LLPresence, btnPresence, txtAlteration, LLAlteration, btnAlteration, txtCreation, LLCreation, btnCreation, txtEnergy, LLEnergy, btnEnergy, txtEntropy, LLEntropy, btnEntropy, txtInfluence, LLInfluence, btnInfluence, txtMovement, LLMovement, btnMovement, txtPrescience, LLPrescience, btnPrescience, txtProtection, LLProtection, btnProtection);
    }

    private void setAttributes(TextView txtAgility, LinearLayout LLAgility, Button btnAgility, TextView txtFortitude, LinearLayout LLFortitude, Button btnFortitude, TextView txtMight, LinearLayout LLMight, Button btnMight, TextView txtLearning, LinearLayout LLLearning, Button btnLearning, TextView txtLogic, LinearLayout LLLogic, Button btnLogic, TextView txtPerception, LinearLayout LLPerception, Button btnPerception, TextView txtWill, LinearLayout LLWill, Button btnWill, TextView txtDeception, LinearLayout LLDeception, Button btnDeception, TextView txtPersuasion, LinearLayout LLPersuasion, Button btnPersuasion, TextView txtPresence, LinearLayout LLPresence, Button btnPresence, TextView txtAlteration, LinearLayout LLAlteration, Button btnAlteration, TextView txtCreation, LinearLayout LLCreation, Button btnCreation, TextView txtEnergy, LinearLayout LLEnergy, Button btnEnergy, TextView txtEntropy, LinearLayout LLEntropy, Button btnEntropy, TextView txtInfluence, LinearLayout LLInfluence, Button btnInfluence, TextView txtMovement, LinearLayout LLMovement, Button btnMovement, TextView txtPrescience, LinearLayout LLPrescience, Button btnPrescience, TextView txtProtection, LinearLayout LLProtection, Button btnProtection) {
        if (player.getAgility() != 0) {
            txtAgility.setText("Agility: " + player.getAgility());
        }
        else {
            txtAgility.setText("0");
        }
        if (player.getFortitude() != 0) {
            txtFortitude.setText("Fortitude: " + (player.getFortitude()));
        }
        else {
            txtFortitude.setText("0");
        }
        if (player.getMight() != 0) {
            txtMight.setText("Might: " + player.getMight());
        }
        else {
            txtMight.setText("0");
        }
        if (player.getLearning() != 0) {
            txtLearning.setText("Learning: " + (player.getLearning()));
        }
        else {
            txtLearning.setText("0");
        }
        if (player.getLogic() != 0) {
            txtLogic.setText("Logic: " + (player.getLogic()));
        }
        else {
            txtLogic.setText("0");
        }
        if (player.getPerception() != 0) {
            txtPerception.setText("Perception: " + (player.getPerception()));
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getWill() != 0) {
            txtWill.setText("Will: " + (player.getWill()));
        }
        else {
            txtWill.setText("0");
        }
        if (player.getDeception() != 0) {
            txtDeception.setText("Deception: " + (player.getDeception()));
        }
        else {
            txtDeception.setText("0");
        }
        if (player.getPersuasion() != 0) {
            txtPersuasion.setText("Persuasion: " + (player.getPersuasion()));
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getPresence() != 0) {
            txtPresence.setText("Presence: " + (player.getPresence()));
        }
        else {
            txtPresence.setText("0");
        }
        if (player.getAlteration() != 0) {
            txtAlteration.setText("Alteration: " + (player.getAlteration()));
        }
        else {
            txtAlteration.setText("0");
        }
        if (player.getCreation() != 0) {
            txtCreation.setText("Creation: " + (player.getCreation()));
        }
        else {
            txtCreation.setText("0");
        }
        if (player.getEnergy() != 0) {
            txtEnergy.setText("Energy: " + (player.getEnergy()));
        }
        else {
            txtEnergy.setText("0");
        }
        if (player.getEntropy() != 0) {
            txtEntropy.setText("Entropy: " + (player.getEntropy()));
        }
        else {
            txtEntropy.setText("0");
        }
        if (player.getInfluence() != 0) {
            txtInfluence.setText("Influence: " + (player.getInfluence()));
        }
        else {
            txtInfluence.setText("0");
        }
        if (player.getMovement() != 0) {
            txtMovement.setText("Movement: " + (player.getMovement()));
        }
        else {
            txtMovement.setText("0");
        }
        if (player.getPrescience() != 0) {
            txtPrescience.setText("Prescience: " + (player.getPrescience()));
        }
        else {
            txtPrescience.setText("0");
        }
        if (player.getProtection() != 0) {
            txtProtection.setText("Protection: " + (player.getProtection()));
        }
        else {
            txtProtection.setText("0");
        }
    }

    private void saveAttributes(TextView txtAgility, LinearLayout LLAgility, Button btnAgility, TextView txtFortitude, LinearLayout LLFortitude, Button btnFortitude, TextView txtMight, LinearLayout LLMight, Button btnMight, TextView txtLearning, LinearLayout LLLearning, Button btnLearning, TextView txtLogic, LinearLayout LLLogic, Button btnLogic, TextView txtPerception, LinearLayout LLPerception, Button btnPerception, TextView txtWill, LinearLayout LLWill, Button btnWill, TextView txtDeception, LinearLayout LLDeception, Button btnDeception, TextView txtPersuasion, LinearLayout LLPersuasion, Button btnPersuasion, TextView txtPresence, LinearLayout LLPresence, Button btnPresence, TextView txtAlteration, LinearLayout LLAlteration, Button btnAlteration, TextView txtCreation, LinearLayout LLCreation, Button btnCreation, TextView txtEnergy, LinearLayout LLEnergy, Button btnEnergy, TextView txtEntropy, LinearLayout LLEntropy, Button btnEntropy, TextView txtInfluence, LinearLayout LLInfluence, Button btnInfluence, TextView txtMovement, LinearLayout LLMovement, Button btnMovement, TextView txtPrescience, LinearLayout LLPrescience, Button btnPrescience, TextView txtProtection, LinearLayout LLProtection, Button btnProtection) {
        if (!(txtAgility.getText().equals("0"))) {
            player.setAgility(Integer.parseInt("" + txtAgility.getText()));
        }
        else {
            player.setAgility(0);
        }
        if (player.getFortitude() != 0) {
            txtFortitude.setText("Fortitude: " + (player.getFortitude()));
        }
        else {
            txtFortitude.setText("0");
        }
        if (player.getMight() != 0) {
            txtMight.setText("Might: " + player.getMight());
        }
        else {
            txtMight.setText("0");
        }
        if (player.getLearning() != 0) {
            txtLearning.setText("Learning: " + (player.getLearning()));
        }
        else {
            txtLearning.setText("0");
        }
        if (player.getLogic() != 0) {
            txtLogic.setText("Logic: " + (player.getLogic()));
        }
        else {
            txtLogic.setText("0");
        }
        if (player.getPerception() != 0) {
            txtPerception.setText("Perception: " + (player.getPerception()));
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getWill() != 0) {
            txtWill.setText("Will: " + (player.getWill()));
        }
        else {
            txtWill.setText("0");
        }
        if (player.getDeception() != 0) {
            txtDeception.setText("Deception: " + (player.getDeception()));
        }
        else {
            txtDeception.setText("0");
        }
        if (player.getPersuasion() != 0) {
            txtPersuasion.setText("Persuasion: " + (player.getPersuasion()));
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getPresence() != 0) {
            txtPresence.setText("Presence: " + (player.getPresence()));
        }
        else {
            txtPresence.setText("0");
        }
        if (player.getAlteration() != 0) {
            txtAlteration.setText("Alteration: " + (player.getAlteration()));
        }
        else {
            txtAlteration.setText("0");
        }
        if (player.getCreation() != 0) {
            txtCreation.setText("Creation: " + (player.getCreation()));
        }
        else {
            txtCreation.setText("0");
        }
        if (player.getEnergy() != 0) {
            txtEnergy.setText("Energy: " + (player.getEnergy()));
        }
        else {
            txtEnergy.setText("0");
        }
        if (player.getEntropy() != 0) {
            txtEntropy.setText("Entropy: " + (player.getEntropy()));
        }
        else {
            txtEntropy.setText("0");
        }
        if (player.getInfluence() != 0) {
            txtInfluence.setText("Influence: " + (player.getInfluence()));
        }
        else {
            txtInfluence.setText("0");
        }
        if (player.getMovement() != 0) {
            txtMovement.setText("Movement: " + (player.getMovement()));
        }
        else {
            txtMovement.setText("0");
        }
        if (player.getPrescience() != 0) {
            txtPrescience.setText("Prescience: " + (player.getPrescience()));
        }
        else {
            txtPrescience.setText("0");
        }
        if (player.getProtection() != 0) {
            txtProtection.setText("Protection: " + (player.getProtection()));
        }
        else {
            txtProtection.setText("0");
        }
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

    private void buttonClicks(Button btnBanes, Button btnBoons, Button btnInventory, Button btnSave) {
        btnBanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Attributes First
                toBanes();
            }
        });

        btnBoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Attributes First
                toBoons();
            }
        });

        btnInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent in = new Intent(getApplicationContext(), OLInventoryActivity.class);
                //in.putExtra("", attributeToDice();
                startActivity(in);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Save Attributes to player

            }
        });

        /*
        btnFeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Feats Menu
                Intent in = new Intent(getApplicationContext(), OLFeatsActivitiy.class);
                //in.putExtra("dice", attributeToDice(player.getProtection()));
                startActivity(in);
            }
        });

         */
    }
}
