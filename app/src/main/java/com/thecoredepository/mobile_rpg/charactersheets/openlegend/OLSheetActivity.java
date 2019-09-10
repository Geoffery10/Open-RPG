package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mobile_rpg.R;

import java.util.Arrays;

public class OLSheetActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_sheet);
        openlegend player = new openlegend();
        player.generateRandomCharacter();
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
        txtAttributes.setText("Attributes: " + player.getAttributePointsAvalible() +"/"+ player.getGetAttributePointsUsed());
        TextView txtAttribute01 = findViewById(R.id.txtAttribute01);
        txtBio.setText("Fortitude: " + (player.getFortitude()));
        TextView txtToughness = findViewById(R.id.txtToughness);
        txtAttributes.setText("Toughness: " + player.getToughness());
    }

    public static openlegend Tazmur(openlegend player)
    {
        player.setCharName("Tazmur");
        player.setNickname("Taz");
        player.setMajorLvl(4);
        player.setMinorLvl(1);
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

        player.setStats();

        return player;
    }
}
