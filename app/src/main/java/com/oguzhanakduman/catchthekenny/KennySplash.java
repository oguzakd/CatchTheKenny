package com.oguzhanakduman.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class KennySplash extends AppCompatActivity {

    // 3 saniyelik delay ile ekranda gösterme
    private static final int splashDelayed = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenny_splash);
        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(KennySplash.this,PlayScreen.class);
                startActivity(intent);
                finish();
            }
        },splashDelayed);
    }
}