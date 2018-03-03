package com.example.thinkpad.eva_1_3_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVwHola;//preferible llamarlo igual
    Button btnHola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwHola = (TextView)findViewById(R.id.txtVwHola); //(Widget) encuentra y regresa un objeto de tipo View, hace casting para que se a de tipo TextView
        btnHola = (Button)findViewById(R.id.btnHola);// Accesa al objeto por el findViewById

        txtVwHola.setText("Quiubo Mundo");
        txtVwHola.setText(R.string.mi_cadena);
        btnHola.setText("Don't Touch Me");
    }
}
