package com.example.speechtotext_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if (intent != null) {
            String value = intent.getStringExtra("bruh");
            // Use the value as needed
            TextView displayedTextView = findViewById(R.id.display_text);
            displayedTextView.setText(value);
        }
    }
}