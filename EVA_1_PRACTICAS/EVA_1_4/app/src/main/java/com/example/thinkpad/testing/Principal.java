package com.example.thinkpad.testing;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity
        implements View.OnClickListener { //Se declara los listeners
    Context cntContexto;
    Button btnClickList, btnClickAnonimo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cntContexto = getApplicationContext();
        btnClickList=(Button)findViewById(R.id.btnClickList);
        btnClickAnonimo=(Button)findViewById(R.id.btnClickAnonimo);
        btnClickList.setOnClickListener(this); //Asigna el listener al boton
        btnClickAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cntContexto, "Hola mundo! - Clase Anonima", Toast.LENGTH_SHORT).show();
            }                   //this = new View...
        });
    }
    public void miClick(View v){
        Toast.makeText(this, "Hola mundo!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Hola mundo! - LISTENER", Toast.LENGTH_SHORT).show();
    }                   //this Main Activity
}
