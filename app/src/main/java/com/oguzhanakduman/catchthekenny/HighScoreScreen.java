package com.oguzhanakduman.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HighScoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score_screen);
        getSupportActionBar().hide();

    }
}