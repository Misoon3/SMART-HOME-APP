package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class wel extends AppCompatActivity {

    Button button3;
    Button button5;
    Button button6;
    Button button7;
    Button button9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button3= findViewById(R.id.button3);
        button5 = findViewById(R.id.button5);
        button6= findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button9 = findViewById(R.id.button9);

        button3.setOnClickListener(View ->{
            Intent intent=new Intent(wel.this,Living.class);

        });
        button5.setOnClickListener(View ->{
            Intent intent=new Intent(wel.this,bed.class);
            Button button2;


        });
        button6.setOnClickListener(View ->{
            Intent intent=new Intent(wel.this,Kitchen.class);

        });
        button7.setOnClickListener(View ->{
            Intent intent=new Intent(wel.this,garage.class);
            Button button2;


        });button9.setOnClickListener(View ->{
            Intent intent=new Intent(wel.this,warning.class);

        });

    }
}