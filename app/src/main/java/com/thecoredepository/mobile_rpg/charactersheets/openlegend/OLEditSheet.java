package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

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
        txtLang.setVisibility(View.GONE);
        //String lang = "";
        //lang = getLangs(lang);
        //txtLang.setText("Languages: " + (lang));
        TextView txtBio = findViewById(R.id.txtBioEdit);
        txtBio.setText(player.getBio());
        updateStats();
        EditText txtSpeed = findViewById(R.id.editSpeed);
        txtSpeed.setText("" + player.getSpeed());

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
        setAttributes();
    }

    private void updateStats() {
        //Update Stats
        player.setStats();
        player.setAttributePointsAvailable(player.getType());
        player.setGetAttributePointsUsed();

        //Update Fields
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
    }

    private void setAttributes() {
        //Attributes
        EditText editAgility = findViewById(R.id.editAgility);
        EditText editFortitude = findViewById(R.id.editFortitude);
        EditText editMight = findViewById(R.id.editMight);
        EditText editLearning = findViewById(R.id.editLearning);
        EditText editLogic = findViewById(R.id.editLogic);
        EditText editPerception = findViewById(R.id.editPerception);
        EditText editWill = findViewById(R.id.editWill);
        EditText editDeception = findViewById(R.id.editDeception);
        EditText editPersuasion = findViewById(R.id.editPersuasion);
        EditText editPresence = findViewById(R.id.editPresence);
        EditText editAlteration = findViewById(R.id.editAlteration);
        EditText editCreation = findViewById(R.id.editCreation);
        EditText editEnergy = findViewById(R.id.editEnergy);
        EditText editEntropy = findViewById(R.id.editEntropy);
        EditText editInfluence = findViewById(R.id.editInfluence);
        EditText editMovement = findViewById(R.id.editMovement);
        EditText editPrescience = findViewById(R.id.editPrescience);
        EditText editProtection = findViewById(R.id.editProtection);

        if (player.getAgility() != 0) {
            editAgility.setText("" + player.getAgility());
        }
        else {
            editAgility.setText("0");
        }
        if (player.getFortitude() != 0) {
            editFortitude.setText("" + player.getFortitude());
        }
        else {
            editFortitude.setText("0");
        }
        if (player.getMight() != 0) {
            editMight.setText("" + player.getMight());
        }
        else {
            editMight.setText("0");
        }
        if (player.getLearning() != 0) {
            editLearning.setText("" + player.getLearning());
        }
        else {
            editLearning.setText("0");
        }
        if (player.getLogic() != 0) {
            editLogic.setText("" + player.getLogic());
        }
        else {
            editLogic.setText("0");
        }
        if (player.getPerception() != 0) {
            editPerception.setText("" + player.getPerception());
        }
        else {
            editPerception.setText("0");
        }
        if (player.getWill() != 0) {
            editWill.setText("" + player.getWill());
        }
        else {
            editWill.setText("0");
        }
        if (player.getDeception() != 0) {
            editDeception.setText("" + player.getDeception());
        }
        else {
            editDeception.setText("0");
        }
        if (player.getPersuasion() != 0) {
            editPersuasion.setText("" + player.getPersuasion());
        }
        else {
            editPersuasion.setText("0");
        }
        if (player.getPresence() != 0) {
            editPresence.setText("" + player.getPresence());
        }
        else {
            editPresence.setText("0");
        }
        if (player.getAlteration() != 0) {
            editAlteration.setText("" + player.getAlteration());
        }
        else {
            editAlteration.setText("0");
        }
        if (player.getCreation() != 0) {
            editCreation.setText("" + player.getCreation());
        }
        else {
            editCreation.setText("0");
        }
        if (player.getEnergy() != 0) {
            editEnergy.setText("" + player.getEnergy());
        }
        else {
            editEnergy.setText("0");
        }
        if (player.getEntropy() != 0) {
            editEntropy.setText("" + player.getEntropy());
        }
        else {
            editEntropy.setText("0");
        }
        if (player.getInfluence() != 0) {
            editInfluence.setText("" + player.getInfluence());
        }
        else {
            editInfluence.setText("0");
        }
        if (player.getMovement() != 0) {
            editMovement.setText("" + player.getMovement());
        }
        else {
            editMovement.setText("0");
        }
        if (player.getPrescience() != 0) {
            editPrescience.setText("" + player.getPrescience());
        }
        else {
            editPrescience.setText("0");
        }
        if (player.getProtection() != 0) {
            editProtection.setText("" + player.getProtection());
        }
        else {
            editProtection.setText("0");
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

        TextView txtBioEdit = findViewById(R.id.txtBioEdit);
        player.setBio("" + txtBioEdit.getText());

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

        player.setStats();

        updateStats();
        OLSavingSheets saveData = new OLSavingSheets();
        saveData.saveData(this);

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
