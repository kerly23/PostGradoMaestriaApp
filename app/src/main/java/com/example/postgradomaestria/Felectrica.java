package com.example.postgradomaestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Felectrica extends AppCompatActivity {

    Button button;

    ListView listpostgrados;
    ArrayList<String> names;

    String[] urls = new String[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felectrica);

        listpostgrados = (ListView) findViewById(R.id.listpostgrados);
        names = new ArrayList<String>();
        names.add("Maestría en Ingeniería Eléctrica con Especialización ");

        names.add("Postgrado en Electrónica Digital");
        names.add("Postgrado en Telecomunicaciones");
        names.add("Postgrado en Ingeniería Eléctrica Industrial");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgrados.setAdapter(adapter);

        urls[0] ="http://www.fie.utp.ac.pa/maestria-en-ingenieria-electrica";

        urls[1]="http://www.fie.utp.ac.pa/postgrado-en-ingenieria-electronica-digital";
        urls[2]="http://www.fie.utp.ac.pa/postgrado-en-telecomunicaciones";
        urls[3]="http://www.fie.utp.ac.pa/postgrado-en-ingenieria-electrica-industrial";


        listpostgrados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(getApplicationContext(),WebMenu.class);
                        intent1.putExtra("links",urls[0]);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2  = new Intent(getApplicationContext(),WebMenu.class);
                        intent2.putExtra("links",urls[1]);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(),WebMenu.class);
                        intent3.putExtra("links",urls[2]);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(getApplicationContext(),WebMenu.class);
                        intent4.putExtra("links",urls[3]);
                        startActivity(intent4);
                        break;


                }
            }

        });

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            boolean subject;
            boolean message;
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","maritza.van@utp.ac.pa, danilo.caceres@utp.ac.pa", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Seleccione su cliente de email:"));

            }
        });

    }
}