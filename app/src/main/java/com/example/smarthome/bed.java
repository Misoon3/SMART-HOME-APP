package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class bed extends AppCompatActivity {
    TextView textView14;
    ToggleButton toggleButton1;
    TextView textView7;
    ToggleButton toggleButton5;
    TextView textView16;
    ToggleButton toggleButton6;
    TextView textView9;
    ToggleButton toggleButton12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed);
        textView14 = findViewById(R.id.textView14);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton1.setOnClickListener(view -> {
            if (toggleButton1.isChecked()){
                textView14.setText("on");
            }else {
                textView14.setText("off");
            }

        });
        textView7 = findViewById(R.id.textView7);
        toggleButton5 = findViewById(R.id.toggleButton1);
        toggleButton5.setOnClickListener(view -> {
            if (toggleButton5.isChecked()){
                textView7.setText("on");
            }else {
                textView7.setText("off");
            }

        });
        textView16 = findViewById(R.id.textView16);
        toggleButton6 = findViewById(R.id.toggleButton6);
        toggleButton6.setOnClickListener(view -> {
            if (toggleButton6.isChecked()){
                textView16.setText("on");
            }else {
                textView16.setText("off");
            }

        });
        textView9 = findViewById(R.id.textView9);
        toggleButton12 = findViewById(R.id.toggleButton12);
        toggleButton12.setOnClickListener(view -> {
            if (toggleButton12.isChecked()){
                textView9.setText("on");
            }else {
                textView9.setText("off");
            }

        });
    }
}