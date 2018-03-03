package com.example.thinkpad.eva_1_12_listas_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwLista;
    TextView txtVwMostrar;
    String [] asLista = {
            "Haunter!","Descripcion","Descrip 2","Click aqui","Dale","Macarena"
    };
    String [] asMostrar ={
            "Es muy juguetón y le encanta divertirse con las personas. Se dice que si llega a ver a una persona dentro de su ruina, hábitat o casa embrujada, es capaz de nunca dejarlo ir nada más para quedarse jugando con él toda la vida",
            "Su nombre proviene de las palabras inglesas haunt, que significa embrujar o taunt que significa burla.",
            "Su nombre en japonés viene de la palabra ghost (fantasma).",
            "Haunter es un Pokémon que tiene manos a pesar de no tener brazos. Está compuesto por gas y es por eso que flota. Es de color morado y por su fisiología puede atravesar objetos sólidos.",
            "Pueden separar sus manos muy lejos de su cuerpo para atacar o agarrar objetos y si esto no funciona pueden usar su lengua como un tercer miembro. Tiene las mismas habilidades de su preevolución Gastly, como desaparecer y crear ilusiones",
            "A veces, sus manos están rodeadas de una especie de luz o aura roja."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMostrar = (TextView)findViewById(R.id.txtVwMostrar);
        lstVwLista = (ListView)findViewById(R.id.lstVwLista);
        //Adapter
        ArrayAdapter<String> aaDatos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, asLista);
        lstVwLista.setAdapter(aaDatos);
        lstVwLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtVwMostrar.setText(asMostrar[i]);
        //Alert Dialog
        new AlertDialog.Builder(this)
                .setTitle("Seleccion de la lista")
                .setMessage(asLista[i])
                .setIcon(R.drawable.ic_launcher_foreground)
                //Botones
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Pues Yes", Toast.LENGTH_SHORT).show(); //get aplicationContext da el contexto de la clase principal
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Pues No", Toast.LENGTH_SHORT).show(); //get aplicationContext da el contexto de la clase principal
                    }
                })
                .setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_SHORT).show(); //get aplicationContext da el contexto de la clase principal
                    }
                }).create().show();

    }
}
