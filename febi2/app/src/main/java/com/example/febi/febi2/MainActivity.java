package com.example.febi.febi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPindahtambah, btnPindahkurang, btnPindahkali, btnPindahbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahtambah = findViewById(R.id.btn_pindahtambah);
        btnPindahkurang = findViewById(R.id.btn_pindahkurang);
        btnPindahkali = findViewById(R.id.btn_pindahkali);
        btnPindahbagi = findViewById(R.id.btn_pindahbagi);



        btnPindahtambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this ,
                        Penjumlahan.class);
                startActivity(moveIntent);
            }
        });

        btnPindahkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this ,
                        Pengurangan.class);
                startActivity(moveIntent);
            }
        });

        btnPindahkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this ,
                        Perkalian.class);
                startActivity(moveIntent);
            }
        });

        btnPindahbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this ,
                        Pembagian.class);
                startActivity(moveIntent);
            }
        });

    }
}
