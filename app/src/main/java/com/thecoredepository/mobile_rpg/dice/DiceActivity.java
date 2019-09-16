package com.thecoredepository.mobile_rpg.dice;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mobile_rpg.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiceActivity extends AppCompatActivity {

    int numberOfDie = 0;
    int valueOfDie = 0;
    long lastClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        Intent intent = getIntent();
        String diceIn = intent.getExtras().getString("dice");

        numberOfDie = numberOfDie(diceIn);
        valueOfDie = valueOfDie(diceIn);

        Button btnRoll = findViewById(R.id.btnRoll);
        btnRoll.setText("Roll - " + diceIn);
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            //Roll Dice
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - lastClickTime > 1000)
                {
                    TextView txtRolls = findViewById(R.id.txtRolls);
                    TextView txtTotal = findViewById(R.id.txtTotal);
                    EditText editAdv = findViewById(R.id.editAdv);
                    EditText editDis = findViewById(R.id.editDis);
                    txtRolls.setText("");
                    //Roll Dice
                    int roll = 0;
                    int d20 = 0;
                    List<Integer> die = new ArrayList<Integer>();
                    int total = 0;
                    int advantage = 0;
                    int disadvantage = 0;

                    try {
                        advantage = Integer.parseInt(String.valueOf(editAdv.getText()));
                    } catch (Exception e)
                    {
                        advantage = 0;
                    }
                    try {
                        disadvantage = Integer.parseInt(String.valueOf(editDis.getText()));
                    } catch (Exception e)
                    {
                        disadvantage = 0;
                    }

                    //Roll d20
                    d20 = rollD20(txtRolls, d20);

                    //Roll Other Dice
                    rollOtherDice(txtRolls, die, advantage, disadvantage);

                    //Add Total
                    total = getTotalRoll(d20, die, total);

                    //Display Total
                    txtTotal.setText("Total: " + total);

                    //Reset Clock
                    lastClickTime = SystemClock.elapsedRealtime();
                }
            }
        });
    }

    private int getTotalRoll(int d20, List<Integer> die, int total) {
        for (int i = 0; i < die.size(); i++)
        {
            total += die.get(i);
        }
        total += d20;
        return total;
    }

    private void rollOtherDice(TextView txtRolls, List<Integer> die, int advantage, int disadvantage)
    {
        int roll = 0;
        int totalAdvantage = advantage - disadvantage;
        if (totalAdvantage < 0)
        {
            totalAdvantage = totalAdvantage * (-1);
        }

        if (advantage > disadvantage)
        {

            for (int i = 0; i < (numberOfDie + totalAdvantage); i++) {
                roll = getRoll(die);
                txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
            }
            Collections.sort(die);
            Log.i("Rolls", die.toString());
            for (int i = 0; i < totalAdvantage; i++) {
                die.remove(i);
                Log.i("Rolls", die.toString());
            }
            Log.i("Rolls", die.toString());

            for (int i = 0; i < numberOfDie; i++) {
                if (die.get(i) == valueOfDie) {
                    roll = getRoll(die);
                    txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
                }
            }
            Log.i("Rolls", die.toString());
        }
        else if (disadvantage > advantage)
        {
            for (int i = 0; i < (numberOfDie + totalAdvantage); i++) {
                roll = getRoll(die);
                txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
            }
            Collections.sort(die);
            Collections.reverse(die);
            Log.i("Rolls", die.toString());
            for (int i = 0; i < totalAdvantage; i++) {
                die.remove(i);
            }
            Log.i("Rolls", die.toString());

            for (int i = 0; i < numberOfDie; i++) {
                if (die.get(i) == valueOfDie) {
                    roll = getRoll(die);
                    txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
                }
            }
            Log.i("Rolls", die.toString());
        }
        else
        {
            for (int i = 0; i < numberOfDie; i++)
            {
                do
                {
                    roll = getRoll(die);
                    txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
                } while (roll == valueOfDie);
            }
        }
    }

    private int getRoll(List<Integer> die) {
        int roll = 0;
        if (valueOfDie == 2)
        {
            roll = dice.d2();
        }
        else if (valueOfDie == 6)
        {
            roll = dice.d6();
        }
        else if (valueOfDie == 8)
        {
            roll = dice.d8();
        }
        else //d10
        {
            roll = dice.d10();
        }
        die.add(roll);
        return roll;
    }

    private int rollD20(TextView txtRolls, int d20) {
        int roll;
        do
        {
            roll = dice.d20();
            d20 += roll;
            txtRolls.setText(txtRolls.getText() + "Roll d20: " + roll +"\n");
        } while (roll == 20);
        return d20;
    }

    private int numberOfDie(String dice)
    {
        //Log.i("Dice", "" + Character.getNumericValue(dice.charAt(0)));
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
