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

public class Findustrial extends AppCompatActivity {

    Button button;
    ListView listpostgradosind;
    ArrayList<String> names;

    String[] urls = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findustrial);


        listpostgradosind = (ListView) findViewById(R.id.listpostgrados);
        names = new ArrayList<String>();

        names.add("Postgrado En Alta Gerencia");
        names.add("Postgrado En Formulación, Evaluación Y Gestión De Proyectos De Inversión");
        names.add("Postgrado En Gerencia Agroindustrial");
        names.add("Postgrado En Logística");
        names.add("Postgrado En Agro Industria");

        names.add("Maestría En Ciencias En Ingeniería De La Cadena De Suministro- Programa Dual Georgia Tech-UTP ");
        names.add("Maestría En Dirección De Negocios Con Especialización En Administración De Sistemas De Información ");
        names.add("Maestría En Dirección De Negocios Con Especialización En Economía De Las Empresas");
        names.add("Maestría En Dirección De Negocios Con Especialización En Estrategia Gerencial");
        names.add("Maestría En Dirección De Negocios Con Especialización En Gerencia De Recursos Humanos");
        names.add("Maestría En Dirección De Negocios Con Especialización En Mercadeo Estratégico ");
        names.add("Maestría En Gestión De Proyectos Con Especialización En Administración ");
        names.add("Maestría En Gestión De Proyectos Con Especialización En Evaluación");
        names.add("Maestría En Sistemas Logísticos Y Operaciones Con Especialización En Centros De Distribución");
        names.add("Maestría En Sistemas Logísticos Y Operaciones Con Especialización En Planificación De La Demanda");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgradosind.setAdapter(adapter);

        urls[0]="http://www.fii.utp.ac.pa/postgrado-en-alta-gerencia";
        urls[1]="http://www.fii.utp.ac.pa/postgrado-en-formulacion-evaluacion-y-gestion-de-proyectos-de-inversion";
        urls[2]="http://www.fii.utp.ac.pa/postgrado-en-gerencia-agroindustrial";
        urls[3]="";
        urls[4]="";

        urls[5]="http://www.fii.utp.ac.pa/dual-master-georgia-tech-utp-admission-process";
        urls[6]="http://www.fii.utp.ac.pa/maestria-en-direccion-de-negocios-con-especializacion-en-administracion-de-sistemas-de-informacion";
        urls[7]="http://www.fii.utp.ac.pa/maestria-en-direccion-de-negocios-con-especializacion-en-economia-de-las-empresas";
        urls[8]="http://www.fii.utp.ac.pa/maestria-en-direccion-de-negocios-con-especializacion-en-estrategia-gerencial";
        urls[9]="http://www.fii.utp.ac.pa/maestria-en-direccion-de-negocios-con-especializacion-en-gerencia-de-recursos-humanos";
        urls[10]="http://www.fii.utp.ac.pa/maestria-en-direccion-de-negocios-con-especializacion-en-mercadeo-estrategico";
        urls[11]="http://www.fii.utp.ac.pa/maestria-en-gestion-de-proyectos-con-especializacion-en-administracion";
        urls[12]="http://www.fii.utp.ac.pa/maestria-en-gestion-de-proyectos-con-especializacion-en-evaluacion";
        urls[13]="http://www.fii.utp.ac.pa/maestria-en-sistemas-logisticos-y-operaciones-con-especializacion-en-centros-de-distribucion";
        urls[14]="http://www.fii.utp.ac.pa/maestria-en-sistemas-logisticos-y-operaciones-con-especializacion-en-planificacion-de-la-demanda";

        listpostgradosind.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                    case 14:
                        Intent intent14 = new Intent(getApplicationContext(),WebMenu.class);
                        intent14.putExtra("links",urls[14]);
                        startActivity(intent14);
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
                        "mailto","postgrado.fii@utp.ac.pa", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Seleccione su cliente de email:"));

            }
        });

    }
}
