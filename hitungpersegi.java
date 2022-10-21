package com.berliana.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hitungpersegi extends AppCompatActivity {

    EditText edPanjang, edLebar, edLuas, edKeliling;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitungpersegi);

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        edLuas = findViewById(R.id.edLuas);
        edKeliling = findViewById(R.id.edKeliling);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double panjang = Double.parseDouble(edPanjang.getText().toString());
                double lebar = Double.parseDouble(edLebar.getText().toString());

                double luas = panjang * lebar;
                double keliling = 2 * (panjang + lebar);

                edLuas.setText(""+luas);
                edKeliling.setText(""+keliling);
            }
        });
    }

    public void kembali(View view) {
        startActivity(new Intent(hitungpersegi.this, MainActivity.class));
        finish();
    }
}