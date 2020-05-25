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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
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

        final EditText editEmail = findViewById(R.id.editEmail);
        final EditText editPassword = findViewById(R.id.editPassword);
        Button btnSignUp = findViewById(R.id.btnSignUp);

        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean isValid = true;
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();
                if (password.isEmpty()) {
                    editPassword.setError("Please enter a valid password");
                    editPassword.requestFocus();
                    isValid = false;
                }
                if (email.isEmpty()) {
                    editEmail.setError("Please enter a valid email");
                    editEmail.requestFocus();
                    isValid = false;
                }
                if (isValid == true) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(AccountActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()) {
                                Toast.makeText(AccountActivity.this, "Sign Up Unsuccessful, Please Try Again", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(AccountActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(AccountActivity.this, "Error Occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
