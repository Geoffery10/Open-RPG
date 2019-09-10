package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mobile_rpg.R;

import java.util.Arrays;

public class OLSheetActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_sheet);
        openlegend player = new openlegend();
        player = Tazmur(player);

        TextView txtName = findViewById(R.id.txtCharName);
        txtName.setText(player.getCharName());
        TextView txtNickName = findViewById(R.id.txtNickName);
        txtNickName.setText("(" + player.getNickname() + ")");
        TextView txtLvl = findViewById(R.id.txtLvl);
        txtLvl.setText("Level: " + (player.getMajorLvl()) + " (" + (player.getMinorLvl()) + ")");
        TextView txtDeity = findViewById(R.id.txtDeity);
        txtDeity.setText(player.getDeity());
        TextView txtLang = findViewById(R.id.txtLang);
        txtLang.setText("Languages: " + (Arrays.toString(player.getLanguages())));
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
        txtHitpoints.setText("Hitpoints: " + (player.getHitpoints()));
        TextView txtSpeed = findViewById(R.id.txtSpeed);
        txtSpeed.setText("Speed: " + (player.getSpeed()));

        TextView txtAgility = findViewById(R.id.txtAgility);
        TextView txtFortitude = findViewById(R.id.txtFortitude);
        TextView txtMight = findViewById(R.id.txtMight);
        TextView txtLearning = findViewById(R.id.txtLearning);
        TextView txtLogic = findViewById(R.id.txtLogic);
        TextView txtPerception = findViewById(R.id.txtPerception);
        TextView txtWill = findViewById(R.id.txtWill);
        TextView txtDeception = findViewById(R.id.txtDeception);
        TextView txtPersuasion = findViewById(R.id.txtPersuasion);
        TextView txtPresence = findViewById(R.id.txtPresence);
        TextView txtAlteration = findViewById(R.id.txtAlteration);
        TextView txtCreation = findViewById(R.id.txtCreation);
        TextView txtEnergy = findViewById(R.id.txtEnergy);
        TextView txtEntropy = findViewById(R.id.txtEntropy);
        TextView txtInfluence = findViewById(R.id.txtInfluence);
        TextView txtMovement = findViewById(R.id.txtMovement);
        TextView txtPrescience = findViewById(R.id.txtPrescience);
        TextView txtProtection = findViewById(R.id.txtProtection);

        if (player.getAgility() != 0) {
            txtAgility.setText("Agility: " + player.getAgility());
        }
        else {
            txtAgility.setVisibility(View.GONE);
        }
        if (player.getFortitude() != 0) {
            txtFortitude.setText("Fortitude: " + (player.getFortitude()));
        }
        else {
            txtFortitude.setVisibility(View.GONE);
        }
        if (player.getMight() != 0) {
            txtMight.setText("Might: " + player.getMight());
        }
        else {
            txtMight.setVisibility(View.GONE);
        }
        if (player.getLearning() != 0) {
            txtLearning.setText("Learning: " + (player.getLearning()));
        }
        else {
            txtLearning.setVisibility(View.GONE);
        }
        if (player.getLogic() != 0) {
            txtLogic.setText("Logic: " + (player.getLogic()));
        }
        else {
            txtLogic.setVisibility(View.GONE);
        }
        if (player.getPerception() != 0) {
            txtPerception.setText("Perception: " + (player.getPerception()));
        }
        else {
            txtPerception.setVisibility(View.GONE);
        }
        if (player.getWill() != 0) {
            txtWill.setText("Will: " + (player.getWill()));
        }
        else {
            txtWill.setVisibility(View.GONE);
        }
        if (player.getDeception() != 0) {
            txtDeception.setText("Deception: " + (player.getDeception()));
        }
        else {
            txtDeception.setVisibility(View.GONE);
        }
        if (player.getPersuasion() != 0) {
            txtPersuasion.setText("Persuasion: " + (player.getPersuasion()));
        }
        else {
            txtPersuasion.setVisibility(View.GONE);
        }
        if (player.getLogic() != 0) {
            txtPresence.setText("Presence: " + (player.getPresence()));
        }
        else {
            txtLogic.setVisibility(View.GONE);
        }
        if (player.getAlteration() != 0) {
            txtAlteration.setText("Alteration: " + (player.getAlteration()));
        }
        else {
            txtAlteration.setVisibility(View.GONE);
        }
        if (player.getCreation() != 0) {
            txtCreation.setText("Creation: " + (player.getCreation()));
        }
        else {
            txtCreation.setVisibility(View.GONE);
        }
        if (player.getEnergy() != 0) {
            txtEnergy.setText("Energy: " + (player.getEnergy()));
        }
        else {
            txtEnergy.setVisibility(View.GONE);
        }
        if (player.getEntropy() != 0) {
            txtEntropy.setText("Entropy: " + (player.getEntropy()));
        }
        else {
            txtEntropy.setVisibility(View.GONE);
        }
        if (player.getInfluence() != 0) {
            txtInfluence.setText("Influence: " + (player.getInfluence()));
        }
        else {
            txtInfluence.setVisibility(View.GONE);
        }
        if (player.getMovement() != 0) {
            txtMovement.setText("Movement: " + (player.getMovement()));
        }
        else {
            txtMovement.setVisibility(View.GONE);
        }
        if (player.getPrescience() != 0) {
            txtPrescience.setText("Prescience: " + (player.getPrescience()));
        }
        else {
            txtPrescience.setVisibility(View.GONE);
        }
        if (player.getProtection() != 0) {
            txtProtection.setText("Protection: " + (player.getProtection()));
        }
        else {
            txtProtection.setVisibility(View.GONE);
        }
    }

    public static openlegend Tazmur(openlegend player)
    {
        player.setCharName("Tazmur");
        player.setNickname("Taz");
        player.setDeity("Kalle Demos");
        String[] lang = new String[3];
        lang[0] = "Gerudo";
        lang[1] = "Hylian";
        lang[2] = "Sheikah";
        player.setLanguages(lang);
        player.setBio("Possibly an evil male Gerudo who wanders the land lacking any real home. In his travels he befriended an extremely magical cat named Noujou. It’s possible he has evil goals in life but he’s pretty chill. ");
        player.setFortitude(2);
        player.setPresence(2);
        player.setPerception(2);
        player.setAlteration(6);
        player.setMovement(4);
        player.setEnergy(4);
        player.setAgility(2);
        player.setLearning(2);
        player.setWill(2);
        player.setArmor(1);
        player.setLevelTotal(10);
        player.setSpeed(30);

        player.setStats();
        player.setGetAttributePointsUsed();
        player.setAttributePointsAvailable();

        featsOL.featList();

        return player;
    }
}
