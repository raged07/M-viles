package com.example.thinkpad.eva_1_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements Button.OnClickListener{
    TextView txtVwDesc, TextVwCant;
    RadioButton radBtnAme, radBtnCap, radBtnExp;
    Button btnTotal;
    CheckBox chkAzu,chkCre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwDesc = (TextView)findViewById(R.id.txtVwDesc);
        radBtnAme = (RadioButton)findViewById(R.id.radBtnAme);
        radBtnCap = (RadioButton)findViewById(R.id.radBtnCap);
        radBtnExp = (RadioButton)findViewById(R.id.radBtnExp);
        TextVwCant = (TextView)findViewById(R.id.TextVwCant);
        btnTotal = (Button)findViewById(R.id.btnTotal);
        chkAzu = (CheckBox)findViewById(R.id.chkAzu);
        chkCre = (CheckBox)findViewById(R.id.chkCre);
        btnTotal.setOnClickListener(this);

    }//onCreate

    @Override
    public void onClick(View view) {
        String cafe = null;
        String cantidad = TextVwCant.getText().toString();
        int cantfin = Integer.parseInt(cantidad);
        int cant = 0, preAme = 0, preCap = 0, preExp = 0, preCre = 0, preAzu = 0, preFin = 0;
        String crema = "", azucar = "";

        if(radBtnAme.isChecked()==true) {
            cafe="Americano";
            preAme=20;
            cant=cantfin*preAme;
        if(chkCre.isChecked()==true) {
            crema="crema";
            preCre=1;
            }
         if (chkAzu.isChecked()==true){
            azucar="azucar";
            preAzu=1;
         }
            preFin = preAzu+cant+preCre;
        }
        if(radBtnCap.isChecked()==true) {
            cafe="Capuccino";
            preCap=48;
            cant=cantfin*preCap;
            if(chkCre.isChecked()==true) {
                crema="crema";
                preCre=1;
            }
            if (chkAzu.isChecked()==true){
                azucar="azucar";
                preAzu=1;
            }
            preFin = preAzu+cant+preCre;
        }
        if(radBtnExp.isChecked()==true) {
            cafe="Expresso";
            preExp=30;
            cant=cantfin*preExp;
            if(chkCre.isChecked()==true) {
                crema="crema";
                preCre=1;
            }
            if (chkAzu.isChecked()==true){
                azucar="azucar";
                preAzu=1;
            }
            preFin = preAzu+cant+preCre;
        }
        txtVwDesc.setText(cafe +" "+azucar+" "+crema);
        Toast.makeText(this ,"Precio Final es "+ preFin, Toast.LENGTH_SHORT).show();
    }
}
