package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;

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
        TextView txtInventory = findViewById(R.id.txtInventory);

        txtWealth.setText("Wealth Level: " + player.getWealth());
        txtInventory.setText("");

        for (int i = 0; i < player.getInventorySize(); i++)
        {
            txtInventory.setText(txtInventory.getText() + "\u2022 " + player.getItemAt(i) +" : "+ player.getItemInfoAt(i) + "\n");
        }
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
        Toast toast = Toast.makeText(this, "Feature Not Avaliable Yet", Toast.LENGTH_SHORT);
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
}
