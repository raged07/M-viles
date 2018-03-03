package com.example.thinkpad.eva_1_6_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity
        implements View.OnClickListener{
    Button btnCambiar;
    ImageView imageView;
    boolean bandera = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnCambiar = (Button)findViewById(R.id.btnCambiar);
        imageView = (ImageView) findViewById(R.id.imgView);
        btnCambiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(bandera){
            imageView.setImageResource(R.drawable.bits); //Si tienes la imagen como recurso
        }else{
            imageView.setImageResource(R.drawable.pac);
        }//else
        bandera = !bandera; //cambiamos el estado de la bandera
    }
}
