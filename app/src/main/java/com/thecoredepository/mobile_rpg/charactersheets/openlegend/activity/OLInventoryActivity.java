package com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.thecoredepository.mobile_rpg.AppContext;
import com.thecoredepository.mobile_rpg.MainActivity;
import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.Theming;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLFeatAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLInventoryAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.dialogs.DialogAddItem;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLInventoryActivity extends AppCompatActivity
{
    private Menu menu;
    public Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_inventory);
        Intent intent = getIntent();

        LinearLayout inventoryView = findViewById(R.id.inventoryView);
        inventoryView.setBackgroundResource(Theming.getBackground());

        TextView txtWealth = findViewById(R.id.txtWealth);
        txtWealth.setTextColor(Theming.getColoredFontColor());
        RecyclerView recyclerView = findViewById(R.id.item_view);

        txtWealth.setText("Wealth Level: " + player.getWealth());

        Button btnAdd = findViewById(R.id.btnAdd);

        Boolean add = false;
        Boolean remove = false;

        generateRecyclerView(add, remove, recyclerView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogAddItem AddItem = new DialogAddItem(OLInventoryActivity.this);
                AddItem.show();
            }
        });

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
                        /*in = new Intent(getApplicationContext(), OLInventoryActivity.class);
                        //in.putExtra("selected", "Banes");
                        startActivity(in);
                        finish();*/
                        break;
                    case R.id.navigation_Banes:
                        in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
                        in.putExtra("selected", "Banes");
                        startActivity(in);
                        finish();
                        break;
                    case R.id.navigation_Boons:
                        in = new Intent(getApplicationContext(), OLBanesBoonsActivity.class);
                        in.putExtra("selected", "Boons");
                        startActivity(in);
                        finish();
                        break;
                    case R.id.navigation_Feats:
                        in = new Intent(getApplicationContext(), OLFeatsActivitiy.class);
                        //in.putExtra("selected", "Banes");
                        startActivity(in);
                        finish();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.inventory_menu, menu);
        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast toast = Toast.makeText(this, "This feature is being migrated to a new area...", Toast.LENGTH_SHORT);
        switch(item.getItemId()) {
            case R.id.addItem:
                toast.show();
                break;
            case R.id.removeItem:
                toast.show();
                break;
            case R.id.editItem:
                toast.show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void generateRecyclerView(Boolean add, Boolean remove, RecyclerView recyclerView) {
        for (int i = 0; i < player.getAllItems().size(); i++)
        {
            OLInventoryAdapter adapter = new OLInventoryAdapter(this, player.getAllItems(), add, remove);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}
