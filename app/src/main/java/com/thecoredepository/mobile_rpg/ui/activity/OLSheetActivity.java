package com.thecoredepository.mobile_rpg.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.ui.Theming;
import com.thecoredepository.mobile_rpg.backend.OLSavingSheets;

import static com.thecoredepository.mobile_rpg.backend.openlegend.player;
import static com.thecoredepository.mobile_rpg.backend.dice.attributeToDice;

public class OLSheetActivity extends AppCompatActivity {

    private static final int GALLERY_REQUEST = 1000;
    private static final int PERMISSION_CODE = 1001;
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
        initializationOfElement();
        showHideBio();
        navButtons();
    }

    private void setCharacterImage() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                requestPermissions(permissions, PERMISSION_CODE);
            } else {
                pickImageFromGallery();
            }
        } else {
            pickImageFromGallery();
        }
    }

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, GALLERY_REQUEST);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickImageFromGallery();
                } else {
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK && requestCode == GALLERY_REQUEST) {
            ImageView imgTopSheet = findViewById(R.id.imgTopSheet);
            Glide.with(this)
                    .load(data.getData())
                    .placeholder(R.drawable.banner_ol)
                    .error(R.drawable.banner_ol)
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .transform(new FitCenter(), new CircleCrop())
                    .into(imgTopSheet);
            OLSavingSheets saveData = new OLSavingSheets();
            saveData.saveImage(data.getData());
        }
    }

    private void initializationOfElement() {
        //Initialization of Elements
        ImageView imgTopSheet = findViewById(R.id.imgTopSheet);
        CardView playerInfoCard = findViewById(R.id.playerInfoCard);
        playerInfoCard.setCardBackgroundColor(Color.parseColor(Theming.getCardViewBG()));
        CardView playerStatsCard = findViewById(R.id.playerStatsCard);
        playerStatsCard.setCardBackgroundColor(Color.parseColor(Theming.getCardViewBG()));
        CardView playerButtonsCard = findViewById(R.id.playerButtonsCard);
        playerButtonsCard.setCardBackgroundColor(Color.parseColor(Theming.getCardViewBG()));
        LinearLayout sheetView = findViewById(R.id.sheetView);
        sheetView.setBackgroundResource(Theming.getBackground());
        TextView txtName = findViewById(R.id.txtCharName);
        txtName.setText(player.getCharName());
        txtName.setTextColor(Theming.getFontColor());
        TextView txtNickName = findViewById(R.id.txtNickName);
        txtNickName.setTextColor(Theming.getFontColor());
        if (!(player.getNickname().equals(""))) {
            txtNickName.setText("(" + player.getNickname() + ")");
            txtNickName.setVisibility(View.VISIBLE);
        }
        else {
            txtNickName.setVisibility(View.GONE);
        }
        TextView txtLvl = findViewById(R.id.txtLvl);
        txtLvl.setTextColor(Theming.getFontColor());
        txtLvl.setText("Level: " + (player.getMajorLvl()) + " (" + (player.getMinorLvl()) + ")");
        TextView txtDeity = findViewById(R.id.txtDeity);
        txtDeity.setTextColor(Theming.getFontColor());
        txtDeity.setText(player.getDeity());
        TextView txtLang = findViewById(R.id.txtLang);
        txtLang.setTextColor(Theming.getFontColor());
        String lang = "";
        lang = getLangs(lang);
        txtLang.setText("Languages: " + (lang));
        TextView txtBio = findViewById(R.id.txtBio);
        txtBio.setTextColor(Theming.getFontColor());
        txtBio.setText("Bio: " + (player.getBio()));
        TextView txtAttributes = findViewById(R.id.txtAttributes);
        txtAttributes.setTextColor(Theming.getFontColor());
        txtAttributes.setText("Attributes: " + player.getGetAttributePointsUsed() +"/"+ player.getAttributePointsAvailable());
        TextView txtToughness = findViewById(R.id.txtToughness);
        txtToughness.setText("Toughness: " + player.getToughness());
        txtToughness.setTextColor(Theming.getFontColor());
        TextView txtGuard = findViewById(R.id.txtGuard);
        txtGuard.setTextColor(Theming.getFontColor());
        txtGuard.setText("Guard: " + (player.getGuard()));
        TextView txtResolve = findViewById(R.id.txtResolve);
        txtResolve.setTextColor(Theming.getFontColor());
        txtResolve.setText("Resolve: " + player.getResolve());
        TextView txtHitpoints = findViewById(R.id.txtHitpoints);
        ProgressBar barHealth = findViewById(R.id.barHealth);
        barHealth.getProgressDrawable().setColorFilter(getResources().getColor(R.color.hpBar), PorterDuff.Mode.SRC_IN);
        TextView txtHPBar = findViewById(R.id.txtHPBar);
        txtHitpoints.setTextColor(Theming.getFontColor());
        updateHPInfo();

        TextView txtSpeed = findViewById(R.id.txtSpeed);
        txtSpeed.setTextColor(Theming.getFontColor());
        txtSpeed.setText("Speed: " + (player.getSpeed()));

        //Attributes
        TextView txtAgility = findViewById(R.id.txtAgility);
        txtAgility.setTextColor(Theming.getFontColor());
        LinearLayout LLAgility = findViewById(R.id.LLAgility);
        Button btnAgility = findViewById(R.id.btnAgility);
        TextView txtFortitude = findViewById(R.id.txtFortitude);
        txtFortitude.setTextColor(Theming.getFontColor());
        LinearLayout LLFortitude = findViewById(R.id.LLFortitude);
        Button btnFortitude = findViewById(R.id.btnFortitude);
        TextView txtMight = findViewById(R.id.txtMight);
        txtMight.setTextColor(Theming.getFontColor());
        LinearLayout LLMight = findViewById(R.id.LLMight);
        Button btnMight = findViewById(R.id.btnMight);
        TextView txtLearning = findViewById(R.id.txtLearning);
        txtLearning.setTextColor(Theming.getFontColor());
        LinearLayout LLLearning = findViewById(R.id.LLLearning);
        Button btnLearning = findViewById(R.id.btnLearning);
        TextView txtLogic = findViewById(R.id.txtLogic);
        txtLogic.setTextColor(Theming.getFontColor());
        LinearLayout LLLogic = findViewById(R.id.LLLogic);
        Button btnLogic = findViewById(R.id.btnLogic);
        TextView txtPerception = findViewById(R.id.txtPerception);
        txtPerception.setTextColor(Theming.getFontColor());
        LinearLayout LLPerception = findViewById(R.id.LLPerception);
        Button btnPerception = findViewById(R.id.btnPerception);
        TextView txtWill = findViewById(R.id.txtWill);
        txtWill.setTextColor(Theming.getFontColor());
        LinearLayout LLWill = findViewById(R.id.LLWill);
        Button btnWill = findViewById(R.id.btnWill);
        TextView txtDeception = findViewById(R.id.txtDeception);
        txtDeception.setTextColor(Theming.getFontColor());
        LinearLayout LLDeception = findViewById(R.id.LLDeception);
        Button btnDeception = findViewById(R.id.btnDeception);
        TextView txtPersuasion = findViewById(R.id.txtPersuasion);
        txtPersuasion.setTextColor(Theming.getFontColor());
        LinearLayout LLPersuasion = findViewById(R.id.LLPersuasion);
        Button btnPersuasion = findViewById(R.id.btnPersuasion);
        TextView txtPresence = findViewById(R.id.txtPresence);
        txtPresence.setTextColor(Theming.getFontColor());
        LinearLayout LLPresence = findViewById(R.id.LLPresence);
        Button btnPresence = findViewById(R.id.btnPresence);
        TextView txtAlteration = findViewById(R.id.txtAlteration);
        txtAlteration.setTextColor(Theming.getFontColor());
        LinearLayout LLAlteration = findViewById(R.id.LLAlteration);
        Button btnAlteration = findViewById(R.id.btnAlteration);
        TextView txtCreation = findViewById(R.id.txtCreation);
        txtCreation.setTextColor(Theming.getFontColor());
        LinearLayout LLCreation = findViewById(R.id.LLCreation);
        Button btnCreation = findViewById(R.id.btnCreation);
        TextView txtEnergy = findViewById(R.id.txtEnergy);
        txtEnergy.setTextColor(Theming.getFontColor());
        LinearLayout LLEnergy = findViewById(R.id.LLEnergy);
        Button btnEnergy = findViewById(R.id.btnEnergy);
        TextView txtEntropy = findViewById(R.id.txtEntropy);
        txtEntropy.setTextColor(Theming.getFontColor());
        LinearLayout LLEntropy = findViewById(R.id.LLEntropy);
        Button btnEntropy = findViewById(R.id.btnEntropy);
        TextView txtInfluence = findViewById(R.id.txtInfluence);
        txtInfluence.setTextColor(Theming.getFontColor());
        LinearLayout LLInfluence = findViewById(R.id.LLInfluence);
        Button btnInfluence = findViewById(R.id.btnInfluence);
        TextView txtMovement = findViewById(R.id.txtMovement);
        txtMovement.setTextColor(Theming.getFontColor());
        LinearLayout LLMovement = findViewById(R.id.LLMovement);
        Button btnMovement = findViewById(R.id.btnMovement);
        TextView txtPrescience = findViewById(R.id.txtPrescience);
        txtPrescience.setTextColor(Theming.getFontColor());
        LinearLayout LLPrescience = findViewById(R.id.LLPrescience);
        Button btnPrescience = findViewById(R.id.btnPrescience);
        TextView txtProtection = findViewById(R.id.txtProtection);
        txtProtection.setTextColor(Theming.getFontColor());
        LinearLayout LLProtection = findViewById(R.id.LLProtection);
        Button btnProtection = findViewById(R.id.btnProtection);

        Button btnInventory = findViewById(R.id.btnInventory);
        Button btnBanes = findViewById(R.id.btnBanes);
        Button btnBoons = findViewById(R.id.btnBoons);
        Button btnFeats = findViewById(R.id.btnFeats);

        /*if (player.getImageUri() != null) {
            Glide.with(this)
                    .load(player.getImageUri())
                    .placeholder(R.drawable.banner_ol)
                    .error(R.drawable.banner_ol)
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .transform(new FitCenter(), new CircleCrop())
                    .into(imgTopSheet);
        }*/

        //Button Clicks
        buttonClicks(btnBanes, btnBoons, btnInventory, btnAgility, btnFortitude, btnMight,
                btnLearning, btnLogic, btnPerception, btnWill, btnDeception, btnPersuasion,
                btnPresence, btnAlteration, btnCreation, btnEnergy, btnEntropy, btnInfluence,
                btnMovement, btnPrescience, btnProtection, btnFeats, imgTopSheet);

        //Element Visibility and Values
        setAttributes(txtAgility, LLAgility, btnAgility, txtFortitude, LLFortitude, btnFortitude,
                txtMight, LLMight, btnMight, txtLearning, LLLearning, btnLearning, txtLogic,
                LLLogic, btnLogic, txtPerception, LLPerception, btnPerception, txtWill, LLWill,
                btnWill, txtDeception, LLDeception, btnDeception, txtPersuasion, LLPersuasion,
                btnPersuasion, txtPresence, LLPresence, btnPresence, txtAlteration, LLAlteration,
                btnAlteration, txtCreation, LLCreation, btnCreation, txtEnergy, LLEnergy, btnEnergy,
                txtEntropy, LLEntropy, btnEntropy, txtInfluence, LLInfluence, btnInfluence, txtMovement,
                LLMovement, btnMovement, txtPrescience, LLPrescience, btnPrescience, txtProtection,
                LLProtection, btnProtection, barHealth, txtHPBar);
    }

    private void navButtons() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent in;
                switch (item.getItemId()) {
                    case R.id.navigation_Sheet:
                        break;
                    case R.id.navigation_Inventory:
                        in = new Intent(getApplicationContext(), OLInventoryActivity.class);
                        //in.putExtra("selected", "Banes");
                        startActivity(in);
                        break;
                    case R.id.navigation_Banes:
                        in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
                        in.putExtra("selected", "Banes");
                        startActivity(in);
                        break;
                    case R.id.navigation_Boons:
                        in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
                        in.putExtra("selected", "Boons");
                        startActivity(in);
                        break;
                    case R.id.navigation_Feats:
                        //Open Feats Menu
                        in = new Intent(getApplicationContext(), OLFeatsActivitiy.class);
                        //in.putExtra("dice", attributeToDice(player.getProtection()));
                        startActivity(in);
                        break;
                }
                return true;
            }
        });
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
    public boolean onOptionsItemSelected(MenuItem item) {
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
                Intent in = new Intent(getApplicationContext(), OLEditSheet.class);
                startActivity(in);
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
            case R.id.LethalDamage:
                lethalDamageDialog();
                break;
            case R.id.LethalHealing:
                lethalHealingDialog();
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
                updateHPInfo();
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

    private void lethalDamageDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Lethal Damage");

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
                player.takeLethalDamage(num);
                updateHPInfo();
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

    private void lethalHealingDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Lethal Healing");

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
                player.healLethalDamage(num);
                updateHPInfo();
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
                updateHPInfo();
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

    private void updateHPInfo() {
        ProgressBar barHealth = findViewById(R.id.barHealth);
        barHealth.setMax(player.getMaxHitpoints());
        TextView txtHPBar = findViewById(R.id.txtHPBar);
        if (player.getLethalDamage() > 0) {
            txtHPBar.setText((player.getDamageTaken()) + "/" + (player.getHitpoints()) + "  (L:" + player.getLethalDamage() + ")");
            barHealth.setProgress(player.getDamageTaken());
        } else {
            txtHPBar.setText((player.getDamageTaken()) + "/" + (player.getHitpoints()));
            barHealth.setProgress(player.getDamageTaken());
        }
    }

    private void showHideBio() {
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

    private void toBanes() {
        Intent in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
        in.putExtra("selected", "Banes");
        startActivity(in);
    }

    private void toBoons() {
        Intent in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
        in.putExtra("selected", "Boons");
        startActivity(in);
    }

    private void setAttributes(TextView txtAgility, LinearLayout LLAgility, Button btnAgility,
                               TextView txtFortitude, LinearLayout LLFortitude, Button btnFortitude,
                               TextView txtMight, LinearLayout LLMight, Button btnMight,
                               TextView txtLearning, LinearLayout LLLearning, Button btnLearning,
                               TextView txtLogic, LinearLayout LLLogic, Button btnLogic, TextView txtPerception,
                               LinearLayout LLPerception, Button btnPerception, TextView txtWill,
                               LinearLayout LLWill, Button btnWill, TextView txtDeception, LinearLayout LLDeception,
                               Button btnDeception, TextView txtPersuasion, LinearLayout LLPersuasion,
                               Button btnPersuasion, TextView txtPresence, LinearLayout LLPresence,
                               Button btnPresence, TextView txtAlteration, LinearLayout LLAlteration,
                               Button btnAlteration, TextView txtCreation, LinearLayout LLCreation,
                               Button btnCreation, TextView txtEnergy, LinearLayout LLEnergy, Button btnEnergy,
                               TextView txtEntropy, LinearLayout LLEntropy, Button btnEntropy, TextView txtInfluence,
                               LinearLayout LLInfluence, Button btnInfluence, TextView txtMovement,
                               LinearLayout LLMovement, Button btnMovement, TextView txtPrescience,
                               LinearLayout LLPrescience, Button btnPrescience, TextView txtProtection,
                               LinearLayout LLProtection, Button btnProtection, ProgressBar barHealth, TextView txtHPBar) {
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

    private void buttonClicks(Button btnBanes, Button btnBoons, Button btnInventory, Button btnAgility,
                              Button btnFortitude, Button btnMight, Button btnLearning, Button btnLogic,
                              Button btnPerception, Button btnWill, Button btnDeception, Button btnPersuasion,
                              Button btnPresence, Button btnAlteration, Button btnCreation, Button btnEnergy,
                              Button btnEntropy, Button btnInfluence, Button btnMovement, Button btnPrescience,
                              Button btnProtection, Button btnFeats, final ImageView imgTopSheet) {

        imgTopSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                popup_large_image(imgTopSheet);
            }
        });

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

        ProgressBar barHealth = findViewById(R.id.barHealth);
        barHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                damageDialog();
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

        btnFeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Feats Menu
                Intent in = new Intent(getApplicationContext(), OLFeatsActivitiy.class);
                //in.putExtra("dice", attributeToDice(player.getProtection()));
                startActivity(in);
            }
        });
    }

    private void popup_large_image(ImageView imgTopSheet) {
        final Dialog imageDialog = new Dialog(imgTopSheet.getContext());
        imageDialog.setContentView(R.layout.popup_large_image);
        CardView popup_image = imageDialog.findViewById(R.id.popup_image);
        popup_image.setCardBackgroundColor(Color.parseColor(Theming.getCardViewBG()));
        ImageView imgCharLarge = imageDialog.findViewById(R.id.imgCharLarge);
        Button btnEditImage = imageDialog.findViewById(R.id.btnEditImage);
        Glide.with(imgTopSheet.getContext())
                .load(imgTopSheet.getDrawable())
                .placeholder(R.drawable.banner_ol)
                .error(R.drawable.banner_ol)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .transform(new FitCenter())
                .into(imgCharLarge);

        btnEditImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setCharacterImage();
                imageDialog.dismiss();
            }
        });

        imageDialog.show();
    }

    @Override
    public void onRestart() {
        // After a pause OR at startup
        super.onRestart();
        //Refresh
        initializationOfElement();
    }
}
