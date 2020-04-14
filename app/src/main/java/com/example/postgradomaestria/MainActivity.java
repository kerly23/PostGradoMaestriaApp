package com.example.postgradomaestria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CardView mButton1;
    CardView mButton2;
    CardView mButton3;

    String[] urls= new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1= findViewById(R.id.oferta);
        mButton2= findViewById(R.id.requisito);
        mButton3= findViewById(R.id.procedimiento);


        urls[0]= "http://www.utp.ac.pa/admision-los-programas-de-postgrado-maestrias-y-doctorado";
        urls[1]= "http://www.utp.ac.pa/procedimientos-de-administracion-de-postgrado";


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),OfertaAcademica.class);
                startActivity(intent);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WebMenu.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WebMenu.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });
    }

}
