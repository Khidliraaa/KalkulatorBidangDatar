package com.berliana.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hitunglingkaran extends AppCompatActivity {

    EditText edJari, edLuas, edKeliling;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitunglingkaran);

        edJari = findViewById(R.id.edJari);
        edLuas = findViewById(R.id.edLuas);
        edKeliling = findViewById(R.id.edKeliling);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jari = Integer.parseInt(edJari.getText().toString());

                double luas = Math.PI * jari * jari;
                double keliling = 2 * Math.PI * jari;

                edLuas.setText(""+luas);
                edKeliling.setText(""+keliling);
            }
        });
    }

    public void kembali(View view) {
        startActivity(new Intent(hitunglingkaran.this, MainActivity.class));
        finish();
    }
}