package com.thecoredepository.mobile_rpg.charactersheets.openlegend.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend.Theming;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.ui.adapters.OLFeatAdapter;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.backend.openlegend.player;

public class FeatsActivitiy extends AppCompatActivity
{
    private Menu menu;
    private Boolean add = false;
    private Boolean remove = false;
    private Boolean showAll = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_feats);
        updateFeatsHeader();
        Intent intent = getIntent();
        //String selected = intent.getExtras().getString("selected");
        RecyclerView recyclerView = findViewById(R.id.feat_view);
        ConstraintLayout featsView = findViewById(R.id.featsView);
        featsView.setBackgroundResource(Theming.getBackground());
        TextView txtFeatHeader = findViewById(R.id.txtFeatsHeader);
        txtFeatHeader.setTextColor(Theming.getColoredFontColor());
        add = false;
        remove = false;
        generateRecyclerView(add, remove, showAll, recyclerView);
        navButtons();

    }

    private void navButtons() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent in;
                switch (item.getItemId()) {
                    case R.id.navigation_Sheet:
                        finish();
                        break;
                    case R.id.navigation_Inventory:
                        in = new Intent(getApplicationContext(), InventoryActivity.class);
                        //in.putExtra("selected", "Banes");
                        startActivity(in);
                        finish();
                        break;
                    case R.id.navigation_Banes:
                        in = new Intent(getApplicationContext(), BanesBoonsActivity.class);
                        in.putExtra("selected", "Banes");
                        startActivity(in);
                        finish();
                        break;
                    case R.id.navigation_Boons:
                        in = new Intent(getApplicationContext(), BanesBoonsActivity.class);
                        in.putExtra("selected", "Boons");
                        startActivity(in);
                        finish();
                        break;
                    case R.id.navigation_Feats:
                        break;
                }
                return true;
            }
        });
    }


    public void updateFeatsHeader() {
        player.setFeatPointsAvailable();
        player.setFeatPointsUsed();
        TextView txtFeatHeader = findViewById(R.id.txtFeatsHeader);
        txtFeatHeader.setText("Feats: " + player.getFeatPointsUsed() + "/" + player.getFeatPointsAvailable());
    }

    public void updateFeatsHeader(Context context) {
        player.setFeatPointsAvailable();
        player.setFeatPointsUsed();
        TextView txtFeatHeader = ((Activity)context).findViewById(R.id.txtFeatsHeader);
        txtFeatHeader.setText("Feats: " + player.getFeatPointsUsed() + "/" + player.getFeatPointsAvailable());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.feats_menu, menu);
        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RecyclerView recyclerView = findViewById(R.id.feat_view);
        switch(item.getItemId()) {
            case R.id.yourFeats:
                add = false;
                remove = false;
                showAll = false;
                generateRecyclerView(add, remove, showAll, recyclerView);
                break;
            case R.id.addFeats:
                add = true;
                remove = false;
                showAll = false;
                generateRecyclerView(add, remove, showAll, recyclerView);
                break;
            case R.id.removeFeats:
                add = false;
                remove = true;
                showAll = false;
                generateRecyclerView(add, remove, showAll, recyclerView);
                break;
            case R.id.showAllFeats:
                add = false;
                remove = false;
                showAll = true;
                generateRecyclerView(add, remove, showAll, recyclerView);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void generateRecyclerView(Boolean add, Boolean remove, Boolean showAll, RecyclerView recyclerView) {
        for (int i = 0; i < player.getFeatCount(); i++)
        {
            OLFeatAdapter adapter = new OLFeatAdapter(this, player.getFeats(), add, remove, showAll);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            TextView txtFeatHeader = findViewById(R.id.txtFeatsHeader);
            txtFeatHeader.setText("Feats: " + player.getFeatPointsUsed() + "/" + player.getFeatPointsAvailable());
        }
    }
}