package com.example.thinkpad.eva_1_13_listas_img;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Principal extends AppCompatActivity
        implements ListView.OnItemClickListener{
    ListView lstVw;
    ImageView imgVwMostrar;
    String [] asImagen = {
            "Boo","Box","Burguer","Coin","Heart"
    };
    int [] asImgId = {
            R.drawable.boo,R.drawable.box, R.drawable.burguer, R.drawable.coin, R.drawable.heart
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        imgVwMostrar = (ImageView)findViewById(R.id.imgVwMostrar);
        lstVw = (ListView)findViewById(R.id.lstVw);

        ArrayAdapter<String> aaDatos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, asImagen);
        lstVw.setAdapter(aaDatos);
        lstVw.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    imgVwMostrar.setImageResource(asImgId[i]);
    }
}
