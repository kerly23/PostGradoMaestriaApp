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

public class Fsistemas extends AppCompatActivity {

    Button button;

    ListView listpostgrados;
    ArrayList<String> names;

    String[] urls = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsistemas);

        listpostgrados = (ListView) findViewById(R.id.listpostgrados);
        names = new ArrayList<String>();
        names.add("Postgrado en Auditoria de Sistemas y Evaluacion de Control Informatico");
        names.add("Postgrado en Informatica Educativa");
        names.add("Postgrado en Ingenieria de Software");
        names.add("Postgrado en Redes de Comunicacion de Datos");

        names.add("Maestría en Auditoria de Sistemas y Evaluacion de Control Informatico");
        names.add("Maestría en Informatica Educativa");
        names.add("Maestría en Ingenieria de Software");
        names.add("Maestría en Redes de Comunicacion de Datos");
        names.add("Maestría en Seguridad Informatica");
        names.add("Maestría en Ciencias de Tecnologia de Informacion y Comunicacion");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgrados.setAdapter(adapter);

        urls[0] ="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-auditoria-de-sistemas-y-evaluacion-de-control-informatico";
        urls[1]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-informatica-educativa";
        urls[2]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-ingenieria-de-software";
        urls[3]="http://www.fisc.utp.ac.pa/ofertas-academicas/maestrias-y-postgrados/maestria-y-postgrado-en-redes-de-comunicacion-de-datos";

        urls[4]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-auditoria-de-sistemas-y-evaluacion-de-control-informatico";
        urls[5]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-informatica-educativa";
        urls[6]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-ingenieria-de-software";
        urls[7]="http://www.fisc.utp.ac.pa/ofertas-academicas/maestrias-y-postgrados/maestria-y-postgrado-en-redes-de-comunicacion-de-datos";
        urls[8]="http://www.fisc.utp.ac.pa/maestria-en-seguridad-informatica";
        urls[9]="http://www.fisc.utp.ac.pa/maestria-en-ciencias-de-tecnologia-de-la-informacion-y-comunicacion";

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
                    case 4:
                        Intent intent5 = new Intent(getApplicationContext(),WebMenu.class);
                        intent5.putExtra("links",urls[4]);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(getApplicationContext(),WebMenu.class);
                        intent6.putExtra("links",urls[5]);
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7 = new Intent(getApplicationContext(),WebMenu.class);
                        intent7.putExtra("links",urls[6]);
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8 = new Intent(getApplicationContext(),WebMenu.class);
                        intent8.putExtra("links",urls[7]);
                        startActivity(intent8);
                        break;
                    case 8:
                        Intent intent9 = new Intent(getApplicationContext(),WebMenu.class);
                        intent9.putExtra("links",urls[8]);
                        startActivity(intent9);
                        break;
                    case 9:
                        Intent intent10 = new Intent(getApplicationContext(),WebMenu.class);
                        intent10.putExtra("links",urls[9]);
                        startActivity(intent10);
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
                        "mailto","postgrado.fisc@utp.ac.pa", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Seleccione su cliente de email:"));

            }
        });



    }

}
