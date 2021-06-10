package com.thecoredepository.mobile_rpg.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.backend.Dice;
import com.thecoredepository.mobile_rpg.ui.Theming;

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
        String diceIn = intent.getExtras().getString("Dice");

        numberOfDie = numberOfDie(diceIn);
        valueOfDie = valueOfDie(diceIn);

        Button btnRoll = findViewById(R.id.btnRoll);

        ConstraintLayout diceView = findViewById(R.id.diceView);
        diceView.setBackgroundResource(Theming.getBackground());
        TextView txtAdv = findViewById(R.id.txtAdv);
        //txtAdv.setTextColor(Theming.getColoredFontColor());
        TextView txtDis = findViewById(R.id.txtDis);
        //txtDis.setTextColor(Theming.getColoredFontColor());
        TextView txtRolls = findViewById(R.id.txtRolls);
        txtRolls.setTextColor(Theming.getColoredFontColor());
        TextView txtTotal = findViewById(R.id.txtTotal);
        txtTotal.setTextColor(Theming.getColoredFontColor());
        EditText editAdv = findViewById(R.id.editAdv);
        editAdv.setTextColor(Theming.getColoredFontColor());
        EditText editDis = findViewById(R.id.editDis);
        editDis.setTextColor(Theming.getColoredFontColor());

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
                    total = rollD20(txtRolls, d20);

                    //Roll Other Dice
                    total  += rollOtherDice(txtRolls, die, advantage, disadvantage);

                    //Display Total
                    txtTotal.setText("Total: " + total);
                    txtRolls.setText(txtRolls.getText().toString().trim());

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

    private int rollOtherDice(TextView txtRolls, List<Integer> die, int advantage, int disadvantage)
    {
        int total = 0;
        int roll = 0;
        int totalAdvantage = advantage - disadvantage;
        List<Integer> dieTemp = new ArrayList<Integer>();

        if (totalAdvantage < 0)
        {
            totalAdvantage = totalAdvantage * (-1);
        }

        if (advantage > disadvantage)
        {

            for (int i = 0; i < (numberOfDie + totalAdvantage); i++) {
                roll = getRoll();
                die.add(roll);
                txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
            }
            Collections.sort(die);
            Collections.reverse(die);
            Log.i("Rolls - Sorted", die.toString());
            for (int i = 0; i < numberOfDie; i++) {
                dieTemp.add(die.get(i));
                Log.i("Rolls - dieTemp", dieTemp.toString());
            }

            for (int i = 0; i < dieTemp.size(); i++) {
                if (dieTemp.get(i) == valueOfDie) {
                    roll = getRoll();
                    dieTemp.add(roll);
                    Log.i("Rolls - Explosions", dieTemp.toString());
                }
            }
            total = dieSum(dieTemp);
            Log.i("Rolls - Total", ""+total);
        }
        else if (disadvantage > advantage)
        {
            for (int i = 0; i < (numberOfDie + totalAdvantage); i++) {
                roll = getRoll();
                die.add(roll);
                txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
            }
            Collections.sort(die);
            Log.i("Rolls - Sorted", die.toString());
            for (int i = 0; i < numberOfDie; i++) {
                dieTemp.add(die.get(i));
                Log.i("Rolls - dieTemp", dieTemp.toString());
            }

            for (int i = 0; i < dieTemp.size(); i++) {
                if (dieTemp.get(i) == valueOfDie) {
                    roll = getRoll();
                    dieTemp.add(roll);
                    txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
                    Log.i("Rolls - Explosions", dieTemp.toString());
                }
            }
            total = dieSum(dieTemp);
            Log.i("Rolls - Total", ""+total);
        }
        else
        {
            for (int i = 0; i < numberOfDie; i++)
            {
                do
                {
                    roll = getRoll();
                    die.add(roll);
                    txtRolls.setText(txtRolls.getText() + "Roll d"+valueOfDie+" : " + roll +"\n");
                } while (roll == valueOfDie);
            }
            total = dieSum(die);
            Log.i("Rolls - Total", ""+total);
        }
        return total;
    }

    public int dieSum(List<Integer> die) {
        int sum = 0;

        for (int i : die)
            sum = sum + i;

        return sum;
    }

    private int getRoll() {
        int roll = 0;
        //Custom Dice Roller
        roll = Dice.custom(valueOfDie);
        return roll;
    }

    private int rollD20(TextView txtRolls, int d20) {
        int roll;
        do
        {
            roll = Dice.custom(20);
            d20 += roll;
            txtRolls.setText(txtRolls.getText() + "Roll d20:" + roll + "\n");
            txtRolls.setVisibility(View.VISIBLE);
        } while (roll == 20);
        return d20;
    }

    private int numberOfDie(String dice)
    {
        //Log.i("Dice", "" + Character.getNumericValue(Dice.charAt(0)));
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
