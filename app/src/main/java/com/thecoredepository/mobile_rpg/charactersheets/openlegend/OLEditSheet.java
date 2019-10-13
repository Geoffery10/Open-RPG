package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        txtNickName.setText(player.getNickname());
        TextView txtLvl = findViewById(R.id.txtLvl);
        txtLvl.setText("Level: ");
        TextView editLvl = findViewById(R.id.editLvl);
        editLvl.setText(""+player.getLevelTotal());
        TextView txtDeity = findViewById(R.id.txtDeity);
        txtDeity.setText(player.getDeity());
        TextView txtLang = findViewById(R.id.txtLang);
        //String lang = "";
        //lang = getLangs(lang);
        //txtLang.setText("Languages: " + (lang));
        TextView txtBio = findViewById(R.id.txtBioEdit);
        txtBio.setText(player.getBio());
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
        EditText txtSpeed = findViewById(R.id.editSpeed);
        txtSpeed.setText("" + player.getSpeed());

        //Attributes
        TextView editAgility = findViewById(R.id.editAgility);
        LinearLayout LLAgility = findViewById(R.id.LLAgility);
        Button btnAgility = findViewById(R.id.btnAgility);
        TextView editFortitude = findViewById(R.id.editFortitude);
        LinearLayout LLFortitude = findViewById(R.id.LLFortitude);
        Button btnFortitude = findViewById(R.id.btnFortitude);
        TextView editMight = findViewById(R.id.editMight);
        LinearLayout LLMight = findViewById(R.id.LLMight);
        Button btnMight = findViewById(R.id.btnMight);
        TextView editLearning = findViewById(R.id.editLearning);
        LinearLayout LLLearning = findViewById(R.id.LLLearning);
        Button btnLearning = findViewById(R.id.btnLearning);
        TextView editLogic = findViewById(R.id.editLogic);
        LinearLayout LLLogic = findViewById(R.id.LLLogic);
        Button btnLogic = findViewById(R.id.btnLogic);
        TextView editPerception = findViewById(R.id.editPerception);
        LinearLayout LLPerception = findViewById(R.id.LLPerception);
        Button btnPerception = findViewById(R.id.btnPerception);
        TextView editWill = findViewById(R.id.editWill);
        LinearLayout LLWill = findViewById(R.id.LLWill);
        Button btnWill = findViewById(R.id.btnWill);
        TextView editDeception = findViewById(R.id.editDeception);
        LinearLayout LLDeception = findViewById(R.id.LLDeception);
        Button btnDeception = findViewById(R.id.btnDeception);
        TextView editPersuasion = findViewById(R.id.editPersuasion);
        LinearLayout LLPersuasion = findViewById(R.id.LLPersuasion);
        Button btnPersuasion = findViewById(R.id.btnPersuasion);
        TextView editPresence = findViewById(R.id.editPresence);
        LinearLayout LLPresence = findViewById(R.id.LLPresence);
        Button btnPresence = findViewById(R.id.btnPresence);
        TextView editAlteration = findViewById(R.id.editAlteration);
        LinearLayout LLAlteration = findViewById(R.id.LLAlteration);
        Button btnAlteration = findViewById(R.id.btnAlteration);
        TextView editCreation = findViewById(R.id.editCreation);
        LinearLayout LLCreation = findViewById(R.id.LLCreation);
        Button btnCreation = findViewById(R.id.btnCreation);
        TextView editEnergy = findViewById(R.id.editEnergy);
        LinearLayout LLEnergy = findViewById(R.id.LLEnergy);
        Button btnEnergy = findViewById(R.id.btnEnergy);
        TextView editEntropy = findViewById(R.id.editEntropy);
        LinearLayout LLEntropy = findViewById(R.id.LLEntropy);
        Button btnEntropy = findViewById(R.id.btnEntropy);
        TextView editInfluence = findViewById(R.id.editInfluence);
        LinearLayout LLInfluence = findViewById(R.id.LLInfluence);
        Button btnInfluence = findViewById(R.id.btnInfluence);
        TextView editMovement = findViewById(R.id.editMovement);
        LinearLayout LLMovement = findViewById(R.id.LLMovement);
        Button btnMovement = findViewById(R.id.btnMovement);
        TextView editPrescience = findViewById(R.id.editPrescience);
        LinearLayout LLPrescience = findViewById(R.id.LLPrescience);
        Button btnPrescience = findViewById(R.id.btnPrescience);
        TextView editProtection = findViewById(R.id.editProtection);
        LinearLayout LLProtection = findViewById(R.id.LLProtection);
        Button btnProtection = findViewById(R.id.btnProtection);

        Button btnInventory = findViewById(R.id.btnInventory);
        Button btnBanes = findViewById(R.id.btnBanes);
        Button btnBoons = findViewById(R.id.btnBoons);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnFeats = findViewById(R.id.btnFeats);

        //THIS IS BEING REPLACED BY FEATS MENU
        //TextView editFeats = findViewById(R.id.Feats);
        //editFeats.setVisibility(View.GONE);

        //Button Clicks
        buttonClicks(btnBanes, btnBoons, btnInventory, btnSave);

        //Element Visibility and Values
        setAttributes(editAgility, LLAgility, btnAgility, editFortitude, LLFortitude, btnFortitude, editMight, LLMight, btnMight, editLearning, LLLearning, btnLearning, editLogic, LLLogic, btnLogic, editPerception, LLPerception, btnPerception, editWill, LLWill, btnWill, editDeception, LLDeception, btnDeception, editPersuasion, LLPersuasion, btnPersuasion, editPresence, LLPresence, btnPresence, editAlteration, LLAlteration, btnAlteration, editCreation, LLCreation, btnCreation, editEnergy, LLEnergy, btnEnergy, editEntropy, LLEntropy, btnEntropy, editInfluence, LLInfluence, btnInfluence, editMovement, LLMovement, btnMovement, editPrescience, LLPrescience, btnPrescience, editProtection, LLProtection, btnProtection);
    }

    private void setAttributes(TextView txtAgility, LinearLayout LLAgility, Button btnAgility, TextView txtFortitude, LinearLayout LLFortitude, Button btnFortitude, TextView txtMight, LinearLayout LLMight, Button btnMight, TextView txtLearning, LinearLayout LLLearning, Button btnLearning, TextView txtLogic, LinearLayout LLLogic, Button btnLogic, TextView txtPerception, LinearLayout LLPerception, Button btnPerception, TextView txtWill, LinearLayout LLWill, Button btnWill, TextView txtDeception, LinearLayout LLDeception, Button btnDeception, TextView txtPersuasion, LinearLayout LLPersuasion, Button btnPersuasion, TextView txtPresence, LinearLayout LLPresence, Button btnPresence, TextView txtAlteration, LinearLayout LLAlteration, Button btnAlteration, TextView txtCreation, LinearLayout LLCreation, Button btnCreation, TextView txtEnergy, LinearLayout LLEnergy, Button btnEnergy, TextView txtEntropy, LinearLayout LLEntropy, Button btnEntropy, TextView txtInfluence, LinearLayout LLInfluence, Button btnInfluence, TextView txtMovement, LinearLayout LLMovement, Button btnMovement, TextView txtPrescience, LinearLayout LLPrescience, Button btnPrescience, TextView txtProtection, LinearLayout LLProtection, Button btnProtection) {
        if (player.getAgility() != 0) {
            txtAgility.setText("" + player.getAgility());
        }
        else {
            txtAgility.setText("0");
        }
        if (player.getFortitude() != 0) {
            txtFortitude.setText("" + player.getFortitude());
        }
        else {
            txtFortitude.setText("0");
        }
        if (player.getMight() != 0) {
            txtMight.setText("" + player.getMight());
        }
        else {
            txtMight.setText("0");
        }
        if (player.getLearning() != 0) {
            txtLearning.setText("" + player.getLearning());
        }
        else {
            txtLearning.setText("0");
        }
        if (player.getLogic() != 0) {
            txtLogic.setText("" + player.getLogic());
        }
        else {
            txtLogic.setText("0");
        }
        if (player.getPerception() != 0) {
            txtPerception.setText("" + player.getPerception());
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getWill() != 0) {
            txtWill.setText("" + player.getWill());
        }
        else {
            txtWill.setText("0");
        }
        if (player.getDeception() != 0) {
            txtDeception.setText("" + player.getDeception());
        }
        else {
            txtDeception.setText("0");
        }
        if (player.getPersuasion() != 0) {
            txtPersuasion.setText("" + player.getPersuasion());
        }
        else {
            txtPerception.setText("0");
        }
        if (player.getPresence() != 0) {
            txtPresence.setText("" + player.getPresence());
        }
        else {
            txtPresence.setText("0");
        }
        if (player.getAlteration() != 0) {
            txtAlteration.setText("" + player.getAlteration());
        }
        else {
            txtAlteration.setText("0");
        }
        if (player.getCreation() != 0) {
            txtCreation.setText("" + player.getCreation());
        }
        else {
            txtCreation.setText("0");
        }
        if (player.getEnergy() != 0) {
            txtEnergy.setText("" + player.getEnergy());
        }
        else {
            txtEnergy.setText("0");
        }
        if (player.getEntropy() != 0) {
            txtEntropy.setText("" + player.getEntropy());
        }
        else {
            txtEntropy.setText("0");
        }
        if (player.getInfluence() != 0) {
            txtInfluence.setText("" + player.getInfluence());
        }
        else {
            txtInfluence.setText("0");
        }
        if (player.getMovement() != 0) {
            txtMovement.setText(player.getMovement());
        }
        else {
            txtMovement.setText("0");
        }
        if (player.getPrescience() != 0) {
            txtPrescience.setText("" + player.getPrescience());
        }
        else {
            txtPrescience.setText("0");
        }
        if (player.getProtection() != 0) {
            txtProtection.setText("" + player.getProtection());
        }
        else {
            txtProtection.setText("0");
        }
    }

    private void saveAttributes() {
        //Initialization of Elements
        TextView txtName = findViewById(R.id.txtCharName);
        player.setCharName("" + txtName.getText());
        TextView txtNickName = findViewById(R.id.txtNickName);
        player.setNickname("" + txtNickName.getText());

        EditText editText = findViewById(R.id.editLvl);
        player.setLevelTotal(Integer.parseInt("" + editText.getText()));
        TextView txtDeity = findViewById(R.id.txtDeity);
        player.setDeity("" + txtDeity.getText());

        TextView txtLang = findViewById(R.id.txtLang);
        //String lang = "";
        //lang = getLangs(lang);
        //txtLang.setText("Languages: " + (lang));

        TextView txtBio = findViewById(R.id.txtBio);
        player.setBio("" + txtBio.getText());

        TextView editSpeed = findViewById(R.id.editSpeed);
        player.setSpeed(Integer.parseInt("" + editSpeed.getText()));

        //Attributes
        TextView editAgility = findViewById(R.id.editAgility);
        player.setAgility(Integer.parseInt("" + editAgility.getText()));

        TextView editFortitude = findViewById(R.id.editFortitude);
        player.setFortitude(Integer.parseInt("" + editFortitude.getText()));

        TextView editMight = findViewById(R.id.editMight);
        player.setMight(Integer.parseInt("" + editMight.getText()));

        TextView editLearning = findViewById(R.id.editLearning);
        player.setLearning(Integer.parseInt("" + editLearning.getText()));

        TextView editLogic = findViewById(R.id.editLogic);
        player.setLogic(Integer.parseInt("" + editLogic.getText()));

        TextView editPerception = findViewById(R.id.editPerception);
        player.setPerception(Integer.parseInt("" + editPerception.getText()));

        TextView editWill = findViewById(R.id.editWill);
        player.setWill(Integer.parseInt("" + editWill.getText()));

        TextView editDeception = findViewById(R.id.editDeception);
        player.setDeception(Integer.parseInt("" + editDeception.getText()));

        TextView editPersuasion = findViewById(R.id.editPersuasion);
        player.setPersuasion(Integer.parseInt("" + editPersuasion.getText()));

        TextView editPresence = findViewById(R.id.editPresence);
        player.setPresence(Integer.parseInt("" + editPresence.getText()));

        TextView editAlteration = findViewById(R.id.editAlteration);
        player.setAlteration(Integer.parseInt("" + editAlteration.getText()));

        TextView editCreation = findViewById(R.id.editCreation);
        player.setCreation(Integer.parseInt("" + editCreation.getText()));

        TextView editEnergy = findViewById(R.id.editEnergy);
        player.setEnergy(Integer.parseInt("" + editEnergy.getText()));

        TextView editEntropy = findViewById(R.id.editEntropy);
        player.setEntropy(Integer.parseInt("" + editEntropy.getText()));

        TextView editInfluence = findViewById(R.id.editInfluence);
        player.setInfluence(Integer.parseInt("" + editInfluence.getText()));

        TextView editMovement = findViewById(R.id.editMovement);
        player.setMovement(Integer.parseInt("" + editMovement.getText()));

        TextView editPrescience = findViewById(R.id.editPrescience);
        player.setPrescience(Integer.parseInt("" + editPrescience.getText()));

        TextView editProtection = findViewById(R.id.editProtection);
        player.setProtection(Integer.parseInt("" + editProtection.getText()));

        player.setLevel();

        Toast toast = Toast.makeText(this, "Player Saved", Toast.LENGTH_SHORT);
        toast.show();
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
                saveAttributes();
                toBanes();
            }
        });

        btnBoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Set Attributes First
                saveAttributes();
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
                saveAttributes();
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
