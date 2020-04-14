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

public class Fcivil extends AppCompatActivity {
    Button button;

    ListView listpostgrados;
    ArrayList<String> names;

    String[] urls = new String[14];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcivil);

        listpostgrados = (ListView) findViewById(R.id.listpostgrados);

        names = new ArrayList<String>();

        names.add("Postgrado en Administración de Proyectos de Construcción");
        names.add("Postgrado en Desarrollo Urbano y Regional");
        names.add("Postgrado en Ingeniería Ambiental");
        names.add("Postgrado en Ingeniería Estructural");
        names.add("Postgrado en Ingeniería Geotécnica");
        names.add("Postgrado en Planificación y Gestión Portuaria");
        names.add("Postgrado en Sistemas de Información Geográfica");

        names.add("Maestría en Administración de Proyectos de Construcción");
        names.add("Maestría en Desarrollo Urbano y Regional");
        names.add("Maestría en Ingeniería Ambiental");
        names.add("Maestría en Ingeniería Estructural");
        names.add("Maestría en Ingeniería Geotécnica");
        names.add("Maestría en Planificación y Gestión Portuaria");
        names.add("Maestría en Sistema de Información Geográfica");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgrados.setAdapter(adapter);

        urls[0]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-administracion-de-proyectos-de-construccion";
        urls[1]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-desarrollo-urbano-y-regional";
        urls[2]="http://www.fic.utp.ac.pa/postgrado-y-maestria-en-ingenieria-ambiental";
        urls[3]="http://www.fic.utp.ac.pa/postgrado-y-maestria-en-ingenieria-estructural";
        urls[4]="http://www.fic.utp.ac.pa/maestria-en-ingenieria-geotecnica";
        urls[5]="http://www.fic.utp.ac.pa/maestria-en-planificacion-y-gestion-portuaria";
        urls[6]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-sistemas-de-informacion-geografica";

        urls[7]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-administracion-de-proyectos-de-construccion";
        urls[8]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-desarrollo-urbano-y-regional";
        urls[9]="http://www.fic.utp.ac.pa/postgrado-y-maestria-en-ingenieria-ambiental";
        urls[10]="http://www.fic.utp.ac.pa/postgrado-y-maestria-en-ingenieria-estructural";
        urls[11]="http://www.fic.utp.ac.pa/maestria-en-ingenieria-geotecnica";
        urls[12]="http://www.fic.utp.ac.pa/maestria-en-planificacion-y-gestion-portuaria";
        urls[13]="http://www.fic.utp.ac.pa/maestria-y-postgrado-en-sistemas-de-informacion-geografica";

        listpostgrados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent intent = new Intent(getApplicationContext(),WebMenu.class);
                        intent.putExtra("links",urls[0]);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),WebMenu.class);
                        intent1.putExtra("links",urls[1]);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(),WebMenu.class);
                        intent2.putExtra("links",urls[2]);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(),WebMenu.class);
                        intent3.putExtra("links",urls[3]);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(),WebMenu.class);
                        intent4.putExtra("links",urls[4]);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(),WebMenu.class);
                        intent5.putExtra("links",urls[5]);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(),WebMenu.class);
                        intent6.putExtra("links",urls[6]);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(),WebMenu.class);
                        intent7.putExtra("links",urls[7]);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(),WebMenu.class);
                        intent8.putExtra("links",urls[8]);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(),WebMenu.class);
                        intent9.putExtra("links",urls[9]);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(),WebMenu.class);
                        intent10.putExtra("links",urls[10]);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(),WebMenu.class);
                        intent11.putExtra("links",urls[11]);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(),WebMenu.class);
                        intent12.putExtra("links",urls[12]);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getApplicationContext(),WebMenu.class);
                        intent13.putExtra("links",urls[13]);
                        startActivity(intent13);
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
                        "mailto","fic@utp.ac.pa", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Seleccione su cliente de email:"));

            }
        });

    }

}
