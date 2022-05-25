package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent it = new Intent(splashActivity.this, MainActivity.class);
                    startActivity(it);
                }
            }
        };
        td.start();
    }

}