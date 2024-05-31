package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class Login extends AppCompatActivity {
    Button button;
    Button button2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button= findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(View ->{
            Intent intent=new Intent(Login.this,wel.class);

        });
        button2.setOnClickListener(View ->{
            Intent intent=new Intent(Login.this,singup.class);
        Button button2;


            });

        }
    }
