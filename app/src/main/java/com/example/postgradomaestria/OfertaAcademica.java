package com.example.postgradomaestria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OfertaAcademica extends AppCompatActivity {
    CardView btnsistemas;
    CardView btnmecanica;
    CardView btnindustrial;
    CardView btnelectrica;
    CardView btncivil;
    CardView btnciencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta_academica);


        btnsistemas = (CardView)findViewById(R.id.sistemas);
        btnmecanica= (CardView)findViewById(R.id.mecanica);
        btnindustrial= (CardView)findViewById(R.id.industrial);
        btnelectrica= (CardView)findViewById(R.id.electrica);
        btncivil= (CardView)findViewById(R.id.civil);
        btnciencias= (CardView)findViewById(R.id.ciencias);

        btnsistemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Fsistemas.class);
                startActivity(intent);
            }
        });

        btnmecanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Fmecanica.class);
                startActivity(intent);
            }
        });

        btnindustrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Findustrial.class);
                startActivity(intent);
            }
        });
        btncivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Fcivil.class);

                startActivity(intent);
            }
        });
        btnciencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Fciencias.class);
                startActivity(intent);
            }
        });
        btnelectrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Felectrica.class);
                startActivity(intent);
            }
        });
    }


}
