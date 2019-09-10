package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mobile_rpg.R;

import java.nio.file.Files;
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
        txtHitpoints.setText("Hitpoints: " + (player.getDamageTaken()) + "/" +(player.getHitpoints()));
        TextView txtSpeed = findViewById(R.id.txtSpeed);
        txtSpeed.setText("Speed: " + (player.getSpeed()));

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

        if (player.getAgility() != 0) {
            txtAgility.setText("Agility: " + player.getAgility());
            btnAgility.setText(attributeToDice(player.getAgility()));
            LLAgility.setVisibility(View.VISIBLE);
        }
        else {
            LLAgility.setVisibility(View.GONE);
        }
        if (player.getFortitude() != 0) {
            txtFortitude.setText("Fortitude: " + (player.getFortitude()));
            btnFortitude.setText(attributeToDice(player.getFortitude()));
            LLFortitude.setVisibility(View.VISIBLE);
        }
        else {
            LLFortitude.setVisibility(View.GONE);
        }
        if (player.getMight() != 0) {
            txtMight.setText("Might: " + player.getMight());
            btnMight.setText(attributeToDice(player.getMight()));
            LLMight.setVisibility(View.VISIBLE);
        }
        else {
            LLMight.setVisibility(View.GONE);
        }
        if (player.getLearning() != 0) {
            txtLearning.setText("Learning: " + (player.getLearning()));
            btnLearning.setText(attributeToDice(player.getLearning()));
            LLLearning.setVisibility(View.VISIBLE);
        }
        else {
            LLLearning.setVisibility(View.GONE);
        }
        if (player.getLogic() != 0) {
            txtLogic.setText("Logic: " + (player.getLogic()));
            btnLogic.setText(attributeToDice(player.getLogic()));
            LLLogic.setVisibility(View.VISIBLE);
        }
        else {
            LLLogic.setVisibility(View.GONE);
        }
        if (player.getPerception() != 0) {
            txtPerception.setText("Perception: " + (player.getPerception()));
            btnPerception.setText(attributeToDice(player.getPerception()));
            LLPerception.setVisibility(View.VISIBLE);
        }
        else {
            LLPerception.setVisibility(View.GONE);
        }
        if (player.getWill() != 0) {
            txtWill.setText("Will: " + (player.getWill()));
            btnWill.setText(attributeToDice(player.getWill()));
            LLWill.setVisibility(View.VISIBLE);
        }
        else {
            LLWill.setVisibility(View.GONE);
        }
        if (player.getDeception() != 0) {
            txtDeception.setText("Deception: " + (player.getDeception()));
            btnDeception.setText(attributeToDice(player.getDeception()));
            LLDeception.setVisibility(View.VISIBLE);
        }
        else {
            LLDeception.setVisibility(View.GONE);
        }
        if (player.getPersuasion() != 0) {
            txtPersuasion.setText("Persuasion: " + (player.getPersuasion()));
            btnPersuasion.setText(attributeToDice(player.getPersuasion()));
            LLPersuasion.setVisibility(View.VISIBLE);
        }
        else {
            LLPersuasion.setVisibility(View.GONE);
        }
        if (player.getLogic() != 0) {
            txtPresence.setText("Presence: " + (player.getPresence()));
            btnPresence.setText(attributeToDice(player.getPresence()));
            LLPresence.setVisibility(View.VISIBLE);
        }
        else {
            LLPresence.setVisibility(View.GONE);
        }
        if (player.getAlteration() != 0) {
            txtAlteration.setText("Alteration: " + (player.getAlteration()));
            btnAlteration.setText(attributeToDice(player.getAlteration()));
            LLAlteration.setVisibility(View.VISIBLE);
        }
        else {
            LLAlteration.setVisibility(View.GONE);
        }
        if (player.getCreation() != 0) {
            txtCreation.setText("Creation: " + (player.getCreation()));
            btnCreation.setText(attributeToDice(player.getCreation()));
            LLCreation.setVisibility(View.VISIBLE);
        }
        else {
            LLCreation.setVisibility(View.GONE);
        }
        if (player.getEnergy() != 0) {
            txtEnergy.setText("Energy: " + (player.getEnergy()));
            btnEnergy.setText(attributeToDice(player.getEnergy()));
            LLEnergy.setVisibility(View.VISIBLE);
        }
        else {
            LLEnergy.setVisibility(View.GONE);
        }
        if (player.getEntropy() != 0) {
            txtEntropy.setText("Entropy: " + (player.getEntropy()));
            btnEntropy.setText(attributeToDice(player.getEntropy()));
            LLEntropy.setVisibility(View.VISIBLE);
        }
        else {
            LLEntropy.setVisibility(View.GONE);
        }
        if (player.getInfluence() != 0) {
            txtInfluence.setText("Influence: " + (player.getInfluence()));
            btnInfluence.setText(attributeToDice(player.getInfluence()));
            LLInfluence.setVisibility(View.VISIBLE);
        }
        else {
            LLInfluence.setVisibility(View.GONE);
        }
        if (player.getMovement() != 0) {
            txtMovement.setText("Movement: " + (player.getMovement()));
            btnMovement.setText(attributeToDice(player.getMovement()));
            LLMovement.setVisibility(View.VISIBLE);
        }
        else {
            LLMovement.setVisibility(View.GONE);
        }
        if (player.getPrescience() != 0) {
            txtPrescience.setText("Prescience: " + (player.getPrescience()));
            btnPrescience.setText(attributeToDice(player.getPrescience()));
            LLPrescience.setVisibility(View.VISIBLE);
        }
        else {
            LLPrescience.setVisibility(View.GONE);
        }
        if (player.getProtection() != 0) {
            txtProtection.setText("Protection: " + (player.getProtection()));
            btnProtection.setText(attributeToDice(player.getProtection()));
            LLProtection.setVisibility(View.VISIBLE);
        }
        else {
            LLProtection.setVisibility(View.GONE);
        }
    }

    public String attributeToDice(int attribute)
    {
        if (attribute == 1){
            return "1d4";
        }
        else if (attribute == 2){
            return "1d6";
        }
        else if (attribute == 3){
            return "1d8";
        }
        else if (attribute == 4){
            return "1d10";
        }
        else if (attribute == 5){
            return "2d6";
        }
        else if (attribute == 6){
            return "2d8";
        }
        else if (attribute == 7){
            return "2d10";
        }
        else if (attribute == 8){
            return "3d8";
        }
        else if (attribute == 9){
            return "3d10";
        }
        else if (attribute == 10){
            return "4d8";
        }
        else {
            return "NULL";
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
        player.setDamageTaken(0);

        player.setStats();
        player.setGetAttributePointsUsed();
        player.setAttributePointsAvailable();

        featsOL.featList();

        return player;
    }
}
