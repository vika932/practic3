package com.example.intentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String date = (String) getIntent().getSerializableExtra("date");
        TextView textView = findViewById(R.id.textview_first);
        textView.setText(date);
    }
}