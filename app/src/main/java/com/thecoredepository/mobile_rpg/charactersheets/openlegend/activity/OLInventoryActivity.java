package com.thecoredepository.mobile_rpg.charactersheets.openlegend.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLFeatAdapter;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.adapters.OLInventoryAdapter;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLInventoryActivity extends AppCompatActivity
{
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_inventory);
        Intent intent = getIntent();

        TextView txtWealth = findViewById(R.id.txtWealth);
        RecyclerView recyclerView = findViewById(R.id.item_view);

        txtWealth.setText("Wealth Level: " + player.getWealth());

        Boolean add = false;
        Boolean remove = false;

        generateRecyclerView(add, remove, recyclerView);
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
