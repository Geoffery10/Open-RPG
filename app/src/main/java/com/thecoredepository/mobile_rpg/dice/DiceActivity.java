package com.thecoredepository.mobile_rpg.dice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.dice.dice;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        Intent intent = getIntent();
        String diceIn = intent.getExtras().getString("dice");

        int numberOfDie = numberOfDie(diceIn);
        int valueOfDie = valueOfDie(diceIn);

        Button btnRoll = findViewById(R.id.btnRoll);
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtRolls = findViewById(R.id.txtRolls);
                //Roll Dice
                int roll = 0;
                int d20 = 0;
                do
                {
                    roll = dice.d20();
                    d20 += roll;
                    txtRolls.setText(txtRolls.getText() + "Roll d20: " + roll +"\n");
                } while (roll == 20);
            }
        });
    }

    private int numberOfDie(String dice)
    {
        Log.i("Dice", "" + Character.getNumericValue(dice.charAt(0)));
        return Character.getNumericValue(dice.charAt(0));
    }

    private int valueOfDie(String dice)
    {
        Log.i("Dice", "" + Character.getNumericValue(dice.charAt(2)));
        int value = Character.getNumericValue(dice.charAt(2));
        if (value == 1)
        {
            value = 10;
        }
        return value;
    }
}
