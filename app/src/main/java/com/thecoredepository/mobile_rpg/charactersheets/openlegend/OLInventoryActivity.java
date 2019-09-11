package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;

import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLInventoryActivity extends AppCompatActivity
{
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
            txtInventory.setText(txtInventory.getText() + player.getItemAt(i) +" : "+ player.getItemInfoAt(i) + "\n");
        }
    }
}
