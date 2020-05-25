package com.thecoredepository.mobile_rpg.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.mobile_rpg.R;
import com.thecoredepository.mobile_rpg.backend.Dice;
import com.thecoredepository.mobile_rpg.ui.Theming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        //Intent intent = getIntent();

        EditText editEmail = new EditText(R.id.editEmail);
        EditText editPassword = new EditText(R.id.editPassword);
        Button btnSignUp
    }
}
