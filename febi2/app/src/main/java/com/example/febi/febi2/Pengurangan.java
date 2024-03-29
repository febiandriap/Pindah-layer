package com.example.febi.febi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pengurangan extends AppCompatActivity {

    private Button btnHasil;
    private TextView tvHasil;
    private EditText etAngka1, etAngka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);

        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);
        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);

        btnHasil.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                try {
                    String sAngka1 = etAngka1.getText().toString();
                    String sAngka2 = etAngka2.getText().toString();
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());
                    double hasil = angka1 - angka2 ;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
