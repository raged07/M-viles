package com.example.thinkpad.eva_1_5_opciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity
    implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        radioGroup=(RadioGroup)findViewById(R.id.radGroup);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override                   //RadioGroup que genera el evento // boton seleccionado
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton rdBtnSel;
        rdBtnSel = (RadioButton)findViewById(i);
        //Toast.makeText(this, rdBtnSel.getText(), Toast.LENGTH_SHORT).show();

        double dPrecio = 0;
        switch (i){
            case R.id.burrito:
                dPrecio = 20; break;
            case R.id.Alitas:
                dPrecio = 70; break;
            case R.id.torta:
                dPrecio = 40; break;
            case R.id.chilaquiles:
                dPrecio = 50; break;
            case R.id.tacos:
                dPrecio = 60; break;
        }
        Toast.makeText(this, "El precio de "+ rdBtnSel.getText() + " es " + dPrecio, Toast.LENGTH_SHORT).show();
    }
}
