package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class warning extends AppCompatActivity {

    TextView textView7;
    ToggleButton toggleButton10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        textView7 = findViewById(R.id.textView7);
        toggleButton10 = findViewById(R.id.toggleButton10);
        toggleButton10.setOnClickListener(view -> {
            if (toggleButton10.isChecked()) {
                textView7.setText("on");
            } else {
                textView7.setText("off");
            }

        });
    }
}