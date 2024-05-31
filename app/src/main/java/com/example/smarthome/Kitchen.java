package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Kitchen extends AppCompatActivity {
    TextView textView2;
    ToggleButton toggleButton1;
    TextView textView3;
    ToggleButton toggleButton12;
    TextView textView4;
    ToggleButton toggleButton5;
    TextView textView6;
    ToggleButton toggleButton6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living);

        textView2 = findViewById(R.id.textView2);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton1.setOnClickListener(view -> {
            if (toggleButton1.isChecked()){
                textView2.setText("on");
            }else {
                textView2.setText("off");
            }

        });
        textView3 = findViewById(R.id.textView3);
        toggleButton12 = findViewById(R.id.toggleButton12);
        toggleButton12.setOnClickListener(view -> {
            if (toggleButton12.isChecked()){
                textView3.setText("on");
            }else {
                textView3.setText("off");
            }

        });
        textView4 = findViewById(R.id.textView4);
        toggleButton5 = findViewById(R.id.toggleButton5);
        toggleButton5.setOnClickListener(view -> {
            if (toggleButton5.isChecked()){
                textView4.setText("on");
            }else {
                textView4.setText("off");
            }

        });
        textView6 = findViewById(R.id.textView6);
        toggleButton6 = findViewById(R.id.toggleButton6);
        toggleButton6.setOnClickListener(view -> {
            if (toggleButton6.isChecked()){
                textView6.setText("on");
            }else {
                textView6.setText("off");
            }

        });
    }
}