package com.berliana.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitungpersegi(View view) {
        Intent intent = new Intent(MainActivity.this, hitungpersegi.class);
        startActivity(intent);
    }

    public void hitungsegitiga(View view) {
        Intent intent = new Intent(MainActivity.this, hitungsegitiga.class);
        startActivity(intent);
    }

    public void hitunglingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, hitunglingkaran.class);
        startActivity(intent);
    }
}