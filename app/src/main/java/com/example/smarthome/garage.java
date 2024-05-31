package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class garage extends AppCompatActivity {
    TextView textView4;
    ToggleButton toggleButton15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        textView4 = findViewById(R.id.textView4);
        toggleButton15 = findViewById(R.id.toggleButton15);
        toggleButton15.setOnClickListener(view -> {
            if (toggleButton15.isChecked()){
                textView4.setText("on");
            }else {
                textView4.setText("off");
            }

        });
    }
}