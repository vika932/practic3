package com.example.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewUniversity;
    private final int REQUEST_CODE = 143;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUniversity = findViewById(R.id.university);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            String university = data.getStringExtra("name");
            setUniversityTextView(university);
        }
    }
    private void setUniversityTextView(String university){
        textViewUniversity.setText(university);
    }
}
