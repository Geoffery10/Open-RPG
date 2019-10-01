package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoredepository.mobile_rpg.R;
import static com.thecoredepository.mobile_rpg.charactersheets.openlegend.openlegend.player;

public class OLFeatsActivitiy extends AppCompatActivity
{
    private Menu menu;
    private Boolean add = false;
    private Boolean remove = false;
    private Boolean showAll = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_feats);
        Intent intent = getIntent();
        //String selected = intent.getExtras().getString("selected");
        RecyclerView recyclerView = findViewById(R.id.feat_view);
        add = false;
        remove = false;
        generateRecyclerView(add, remove, showAll, recyclerView);


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
        }
    }
}