package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.dice.DiceActivity;

import java.util.Arrays;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;
import static com.thecoredepository.mobile_rpg.dice.dice.attributeToDice;

public class OLSheetActivity extends AppCompatActivity {

    //public openlegend player = new openlegend();
    public boolean bioEnabled = false;
    public Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_sheet);
        Intent intent = getIntent();
        String selected = intent.getExtras().getString("selected");
        player = player.loadCharacterSheet(selected);
        showHideBio();

        //Initialization of Elements
        TextView txtName = findViewById(R.id.txtCharName);
        txtName.setText(player.getCharName());
        TextView txtNickName = findViewById(R.id.txtNickName);
        txtNickName.setText("(" + player.getNickname() + ")");
        TextView txtLvl = findViewById(R.id.txtLvl);
        txtLvl.setText("Level: " + (player.getMajorLvl()) + " (" + (player.getMinorLvl()) + ")");
        TextView txtDeity = findViewById(R.id.txtDeity);
        txtDeity.setText(player.getDeity());
        TextView txtLang = findViewById(R.id.txtLang);
        String lang = "";
        lang = getLangs(lang);
        txtLang.setText("Languages: " + (lang));
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

        TextView txtFeats = findViewById(R.id.txtFeats);
        player.setFeatPointsAvailable();
        player.setFeatPointsUsed();
        txtFeats.setText("Feats: " + player.getFeatPointsUsed() + "/" + player.getFeatPointsAvailable() + "\n" + player.getFeatsList());

        //Button Clicks
        buttonClicks(btnBanes, btnBoons, btnInventory, btnAgility, btnFortitude, btnMight, btnLearning, btnLogic, btnPerception, btnWill, btnDeception, btnPersuasion, btnPresence, btnAlteration, btnCreation, btnEnergy, btnEntropy, btnInfluence, btnMovement, btnPrescience, btnProtection);

        //Element Visibility and Values
        setAttributes(txtAgility, LLAgility, btnAgility, txtFortitude, LLFortitude, btnFortitude, txtMight, LLMight, btnMight, txtLearning, LLLearning, btnLearning, txtLogic, LLLogic, btnLogic, txtPerception, LLPerception, btnPerception, txtWill, LLWill, btnWill, txtDeception, LLDeception, btnDeception, txtPersuasion, LLPersuasion, btnPersuasion, txtPresence, LLPresence, btnPresence, txtAlteration, LLAlteration, btnAlteration, txtCreation, LLCreation, btnCreation, txtEnergy, LLEnergy, btnEnergy, txtEntropy, LLEntropy, btnEntropy, txtInfluence, LLInfluence, btnInfluence, txtMovement, LLMovement, btnMovement, txtPrescience, LLPrescience, btnPrescience, txtProtection, LLProtection, btnProtection);

    }

    private String getLangs(String lang) {
        for (int i = 0; i < 10; i++)
        {
            if (null != player.getLanguage(i))
            {
                lang = lang + player.getLanguages()[i] + ", ";
            }
        }
        if (lang.length() > 2)
        {
            lang = lang.substring(0, lang.length() - 2);
        }
        return lang;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sheet_menu, menu);
        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId()) {
            case R.id.Bio:
                MenuItem bio = menu.findItem(R.id.Bio);
                if (bioEnabled == false) {
                    bioEnabled = true;
                    bio.setTitle("Hide Bio");
                }
                else {
                    bioEnabled = false;
                    bio.setTitle("Show Bio");
                }
                showHideBio();
                break;
            case R.id.EditSheet:
                    Toast toast = Toast.makeText(this, "Editing Comming Soon!", Toast.LENGTH_SHORT);
                    toast.show();
                    break;
            case R.id.Banes:
                toBanes();
                break;
            case R.id.Boons:
                toBoons();
                break;
            case R.id.Damage:
                damageDialog();
                break;
            case R.id.Healing:
                healingDialog();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void damageDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Damage");

        // Set up the input
        final EditText input = new EditText(this);
        input.setGravity(Gravity.CENTER_HORIZONTAL);
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String userin = input.getText().toString();
                int num = Integer.valueOf(userin);
                player.setDamageTaken(num);
                TextView txtHitpoints = findViewById(R.id.txtHitpoints);
                txtHitpoints.setText("Hitpoints: " + (player.getDamageTaken()) + "/" +(player.getHitpoints()));
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    private void healingDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Healing");

        // Set up the input
        final EditText input = new EditText(this);
        input.setGravity(Gravity.CENTER_HORIZONTAL);
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String userin = input.getText().toString();
                int num = Integer.valueOf(userin);
                player.setDamagedHealed(num);
                TextView txtHitpoints = findViewById(R.id.txtHitpoints);
                txtHitpoints.setText("Hitpoints: " + (player.getDamageTaken()) + "/" +(player.getHitpoints()));
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    private void showHideBio()
    {
        TextView txtLvl = findViewById(R.id.txtLvl);
        TextView txtDeity = findViewById(R.id.txtDeity);
        TextView txtLang = findViewById(R.id.txtLang);
        TextView txtBio = findViewById(R.id.txtBio);
        if (bioEnabled == false)
        {
            txtLvl.setVisibility(View.GONE);
            txtDeity.setVisibility(View.GONE);
            txtLang.setVisibility(View.GONE);
            txtBio.setVisibility(View.GONE);
        }
        else
        {
            txtLvl.setVisibility(View.VISIBLE);
            txtDeity.setVisibility(View.VISIBLE);
            txtLang.setVisibility(View.VISIBLE);
            txtBio.setVisibility(View.VISIBLE);
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

    private void setAttributes(TextView txtAgility, LinearLayout LLAgility, Button btnAgility, TextView txtFortitude, LinearLayout LLFortitude, Button btnFortitude, TextView txtMight, LinearLayout LLMight, Button btnMight, TextView txtLearning, LinearLayout LLLearning, Button btnLearning, TextView txtLogic, LinearLayout LLLogic, Button btnLogic, TextView txtPerception, LinearLayout LLPerception, Button btnPerception, TextView txtWill, LinearLayout LLWill, Button btnWill, TextView txtDeception, LinearLayout LLDeception, Button btnDeception, TextView txtPersuasion, LinearLayout LLPersuasion, Button btnPersuasion, TextView txtPresence, LinearLayout LLPresence, Button btnPresence, TextView txtAlteration, LinearLayout LLAlteration, Button btnAlteration, TextView txtCreation, LinearLayout LLCreation, Button btnCreation, TextView txtEnergy, LinearLayout LLEnergy, Button btnEnergy, TextView txtEntropy, LinearLayout LLEntropy, Button btnEntropy, TextView txtInfluence, LinearLayout LLInfluence, Button btnInfluence, TextView txtMovement, LinearLayout LLMovement, Button btnMovement, TextView txtPrescience, LinearLayout LLPrescience, Button btnPrescience, TextView txtProtection, LinearLayout LLProtection, Button btnProtection) {
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
        if (player.getPresence() != 0) {
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

    private void buttonClicks(Button btnBanes, Button btnBoons, Button btnInventory, Button btnAgility, Button btnFortitude, Button btnMight, Button btnLearning, Button btnLogic, Button btnPerception, Button btnWill, Button btnDeception, Button btnPersuasion, Button btnPresence, Button btnAlteration, Button btnCreation, Button btnEnergy, Button btnEntropy, Button btnInfluence, Button btnMovement, Button btnPrescience, Button btnProtection) {
        btnBanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                toBanes();
            }
        });

        btnBoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
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

        btnAgility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getAgility()));
                startActivity(in);
            }
        });
        btnFortitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getFortitude()));
                startActivity(in);
            }
        });
        btnMight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getMight()));
                startActivity(in);
            }
        });
        btnLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getLearning()));
                startActivity(in);
            }
        });
        btnLogic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getLogic()));
                startActivity(in);
            }
        });
        btnPerception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getPerception()));
                startActivity(in);
            }
        });
        btnWill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getWill()));
                startActivity(in);
            }
        });
        btnDeception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getDeception()));
                startActivity(in);
            }
        });
        btnPersuasion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getPersuasion()));
                startActivity(in);
            }
        });
        btnPresence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getPresence()));
                startActivity(in);
            }
        });
        btnAlteration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getAlteration()));
                startActivity(in);
            }
        });
        btnCreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getCreation()));
                startActivity(in);
            }
        });
        btnEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getEnergy()));
                startActivity(in);
            }
        });
        btnEntropy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getEntropy()));
                startActivity(in);
            }
        });
        btnInfluence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getInfluence()));
                startActivity(in);
            }
        });
        btnMovement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getMovement()));
                startActivity(in);
            }
        });
        btnPrescience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getPrescience()));
                startActivity(in);
            }
        });
        btnProtection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Roll Dice
                Intent in = new Intent(getApplicationContext(), DiceActivity.class);
                in.putExtra("dice", attributeToDice(player.getProtection()));
                startActivity(in);
            }
        });
    }

}
