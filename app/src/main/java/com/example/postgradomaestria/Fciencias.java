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

public class Fciencias extends AppCompatActivity {

    Button button;
    ListView listpostgrados;
    ArrayList<String> names;
    String[] urls = new String[7];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fciencias);

        listpostgrados = (ListView) findViewById(R.id.listpostgrados);
        names = new ArrayList<String>();

        names.add("Postgrado en Ciencia de los Materiales");
        names.add("Postgrado en Docencia Superior ");
        names.add("Postgrado en Indagación como Estrategia en la Enseñanza de Ciencias");

        names.add("Maestría en Ciencias Físicas");
        names.add("Maestría en Docencia Superior con Especialización en Tecnología y Didáctica Educativa");
        names.add("Maestría en Ingeniería Matemática");
        names.add("Maestría en Promoción y Desarrollo Cultural");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgrados.setAdapter(adapter);

        urls[0]="http://www.fct.utp.ac.pa/postgrado-en-ciencias-de-los-materiales";
        urls[1]="http://www.fct.utp.ac.pa/postgrado-en-docencia-superior";
        urls[2]="http://www.fct.utp.ac.pa/postgrado-en-indagacion-como-estrategia-en-la-ensenanza-de-ciencias";

        urls[3]="http://www.fct.utp.ac.pa/maestria-en-ciencias-fisicas";
        urls[4]="http://www.fct.utp.ac.pa/maestria-en-docencia-superior-con-especializacion-en-tecnologia-y-didactica-educativa";
        urls[5]="http://www.fct.utp.ac.pa/maestria-en-ingenieria-matematica";
        urls[6]="http://www.fct.utp.ac.pa/maestria-en-promocion-y-desarrollo-cultural";



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
                        "mailto","fct@utp.ac.pa", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Seleccione su cliente de email:"));

            }
        });

    }

}
