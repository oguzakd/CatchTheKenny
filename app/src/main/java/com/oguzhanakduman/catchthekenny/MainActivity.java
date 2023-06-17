package com.oguzhanakduman.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playButton;
    Button highScoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        playButton = findViewById(R.id.playButton);
        highScoreButton = findViewById(R.id.highScoreButton);

    }

    public void goHighScoreScreen(View view){
        goScreen(HighScoreScreen.class);
    }

    public void goPlayScreen(View view){
        goScreen(KennySplash.class);
    }

    private void goScreen(Class screenClass){
        Intent intent = new Intent(MainActivity.this, screenClass);
        startActivity(intent);
    }
}