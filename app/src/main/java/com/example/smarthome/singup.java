package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class singup extends AppCompatActivity {
    Button button4;
    Button button8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button4= findViewById(R.id.button4);
        button8 = findViewById(R.id.button8);

        button4.setOnClickListener(View ->{
            Intent intent=new Intent(singup.this,wel.class);

        });
        button8.setOnClickListener(View ->{
            Intent intent=new Intent(singup.this,Login.class);
            Button button2;


        });

    }
}