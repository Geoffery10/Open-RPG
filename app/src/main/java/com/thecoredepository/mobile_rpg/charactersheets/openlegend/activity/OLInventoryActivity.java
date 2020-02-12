package com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.OLSavingSheets;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLFeatAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLInventoryAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.dialogs.DialogAddItem;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLInventoryActivity extends AppCompatActivity
{
    private Menu menu;
    public Context mContext = this;
    public static OLInventoryAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_inventory);
        Intent intent = getIntent();

        LinearLayout inventoryView = findViewById(R.id.inventoryView);
        inventoryView.setBackgroundResource(Theming.getBackground());

        ImageView btnSaveWealth = findViewById(R.id.btnSaveWealth);
        TextView txtWealth = findViewById(R.id.txtWealth);
        EditText editWealth = findViewById(R.id.editWealth);
        txtWealth.setTextColor(Theming.getColoredFontColor());
        editWealth.setTextColor(Theming.getColoredFontColor());
        RecyclerView recyclerView = findViewById(R.id.item_view);

        txtWealth.setText("Wealth Level: " + player.getWealth());
        editWealth.setText(player.getWealth() + "");

        Button btnAddItem = findViewById(R.id.btnAdd);
        btnAddItem.setVisibility(View.VISIBLE);

        txtWealth.setVisibility(View.VISIBLE);
        editWealth.setVisibility(View.INVISIBLE);
        btnSaveWealth.setVisibility(View.GONE);

        Button btnAdd = findViewById(R.id.btnAdd);

        Boolean add = false;
        Boolean remove = false;

        generateRecyclerView(add, remove, recyclerView);

        txtWealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editWealth();
            }
        });

        btnSaveWealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView btnSaveWealth = findViewById(R.id.btnSaveWealth);
                TextView txtWealth = findViewById(R.id.txtWealth);
                EditText editWealth = findViewById(R.id.editWealth);
                Button btnAddItem = findViewById(R.id.btnAdd);
                btnAddItem.setVisibility(View.VISIBLE);
                txtWealth.setVisibility(View.VISIBLE);
                editWealth.setVisibility(View.INVISIBLE);
                btnSaveWealth.setVisibility(View.GONE);
                try {
                    player.setWealth(Integer.parseInt(editWealth.getText() + ""));
                } catch (NumberFormatException e) {
                    Log.i("NumberFormatException", e + "");
                }
                txtWealth.setText("Wealth Level: " + player.getWealth());
                editWealth.setText(player.getWealth() + "");
                //Save
                Log.i("Saving", "Started Saving...");
                OLSavingSheets saveData = new OLSavingSheets();
                saveData.saveData(mContext);
                Log.i("Saving", "Saved");
                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogAddItem AddItem = new DialogAddItem(OLInventoryActivity.this);
                AddItem.show();
            }
            });

        navButtons();
    }

    private void editWealth() {
        ImageView btnSaveWealth = findViewById(R.id.btnSaveWealth);
        TextView txtWealth = findViewById(R.id.txtWealth);
        EditText editWealth = findViewById(R.id.editWealth);
        Button btnAddItem = findViewById(R.id.btnAdd);
        btnAddItem.setVisibility(View.GONE);
        txtWealth.setVisibility(View.GONE);
        editWealth.setVisibility(View.VISIBLE);
        btnSaveWealth.setVisibility(View.VISIBLE);
        editWealth.setText(player.getWealth() + "");
        editWealth.setSelected(true);
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
            case R.id.setWealth:
                editWealth();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private void generateRecyclerView(Boolean add, Boolean remove, RecyclerView recyclerView) {
        for (int i = 0; i < player.getAllItems().size(); i++)
        {
            itemAdapter = new OLInventoryAdapter(this, player.getAllItems(), add, remove);
            recyclerView.setAdapter(itemAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}
