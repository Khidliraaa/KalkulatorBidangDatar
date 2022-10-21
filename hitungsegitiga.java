package com.berliana.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hitungsegitiga extends AppCompatActivity {

    EditText edAlas, edTinggi, edLuas, edKeliling;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitungsegitiga);

        edAlas = findViewById(R.id.edAlas);
        edTinggi = findViewById(R.id.edTinggi);
        edLuas = findViewById(R.id.edLuas);
        edKeliling = findViewById(R.id.edKeliling);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alas = Double.parseDouble(edAlas.getText().toString());
                double tinggi = Double.parseDouble(edTinggi.getText().toString());

                double luas = 0.5 * alas * tinggi;
                double keliling = alas + alas + alas;

                edLuas.setText(""+luas);
                edKeliling.setText(""+keliling);
            }
        });
    }

    public void kembali(View view) {
        startActivity(new Intent(hitungsegitiga.this, MainActivity.class));
        finish();
    }
}