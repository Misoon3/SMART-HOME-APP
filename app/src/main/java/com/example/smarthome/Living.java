package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Living extends AppCompatActivity {

    TextView textView90;
    ToggleButton toggleButton90;
    TextView textView95;
    ToggleButton toggleButton95;
    TextView textView99;
    ToggleButton toggleButton99;
    TextView textView100;
    ToggleButton toggleButton100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living);

        textView90 = findViewById(R.id.textView90);
        toggleButton90 = findViewById(R.id.toggleButton90);
        toggleButton90.setOnClickListener(view -> {
    if (toggleButton90.isChecked()){
                textView90.setText("on");
            }else {
        textView90.setText("off");
            }
    });
        textView95 = findViewById(R.id.textView95);
        toggleButton95 = findViewById(R.id.toggleButton95);
        toggleButton95.setOnClickListener(view -> {
            if (toggleButton95.isChecked()){
                textView95.setText("on");
            }else {
                textView95.setText("off");
            }
        });
        textView99 = findViewById(R.id.textView99);
        toggleButton99 = findViewById(R.id.toggleButton99);
        toggleButton99.setOnClickListener(view -> {
            if (toggleButton99.isChecked()){
                textView99.setText("on");
            }else {
                textView99.setText("off");
            }
        });
        textView100 = findViewById(R.id.textView100);
        toggleButton100 = findViewById(R.id.toggleButton100);
        toggleButton100.setOnClickListener(view -> {
            if (toggleButton100.isChecked()){
                textView100.setText("on");
            }else {
                textView100.setText("off");
            }
        });
    }
}