package com.aplicacion.nombre.exa_21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Principal extends AppCompatActivity {
    int posicion=1,tre=0,diam=0,cora=0,eso=0,contuser=0,contpc=0;
    EditText eTxt_userc1,eTxt_userc2,eTxt_userc3,eTxt_userc4,eTxt_userc5,eTxt_pcc1,eTxt_pcc2,eTxt_pcc3,eTxt_pcc4,eTxt_pcc5;
    TextView txtV_userc1,txtV_userc2,txtV_userc3,txtV_userc4,txtV_userc5,txtV_pcc1,txtV_pcc2,txtV_pcc3,txtV_pcc4,txtV_pcc5,txtV_ganador;
    Button btn_carta,btn_reiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        eTxt_userc1=(EditText)findViewById(R.id.eTxt_c1user);
        eTxt_userc2=(EditText)findViewById(R.id.eTxt_c2user);
        eTxt_userc3=(EditText)findViewById(R.id.eTxt_c3user);
        eTxt_userc4=(EditText)findViewById(R.id.eTxt_c4user);
        eTxt_userc5=(EditText)findViewById(R.id.eTxt_c5user);
        eTxt_pcc1=(EditText)findViewById(R.id.eTxt_c1pc);
        eTxt_pcc2=(EditText)findViewById(R.id.eTxt_c2pc);
        eTxt_pcc3=(EditText)findViewById(R.id.eTxt_c3pc);
        eTxt_pcc4=(EditText)findViewById(R.id.eTxt_c4pc);
        eTxt_pcc5=(EditText)findViewById(R.id.eTxt_c5pc);
        txtV_userc1=(TextView)findViewById(R.id.txtV_user1);
        txtV_userc2=(TextView)findViewById(R.id.txtV_user2);
        txtV_userc3=(TextView)findViewById(R.id.txtV_user3);
        txtV_userc4=(TextView)findViewById(R.id.txtV_user4);
        txtV_userc5=(TextView)findViewById(R.id.txtV_user5);
        txtV_ganador=(TextView)findViewById(R.id.txtV_ganador);
        txtV_pcc1=(TextView)findViewById(R.id.txtV_pc1);
        txtV_pcc2=(TextView)findViewById(R.id.txtV_pc2);
        txtV_pcc3=(TextView)findViewById(R.id.txtV_pc3);
        txtV_pcc4=(TextView)findViewById(R.id.txtV_pc4);
        txtV_pcc5=(TextView)findViewById(R.id.txtV_pc5);
        btn_carta=(Button)findViewById(R.id.btn_carta);
        btn_reiniciar=(Button)findViewById(R.id.btn_reiniciar);
    }

    public void mandarCarta(View v){
      if(contuser<21 || contpc<21){
          ponerUser();
          ponerPc();
          comprobar();
      }else{
          Toast.makeText(this,"Debes reiniciar el juego :3",Toast.LENGTH_SHORT).show();
      }

    }

    public void reiniciarJ(View vv){
        posicion=1;
        contpc=0;
        contuser=0;
        tre=0;
        cora=0;
        eso=0;
        diam=0;
        eTxt_userc1.setText("");
        eTxt_userc2.setText("");
        eTxt_userc3.setText("");
        eTxt_userc4.setText("");
        eTxt_userc5.setText("");
        eTxt_pcc1.setText("");
        eTxt_pcc2.setText("");
        eTxt_pcc3.setText("");
        eTxt_pcc4.setText("");
        eTxt_pcc5.setText("");
        txtV_userc1.setText("");
        txtV_userc2.setText("");
        txtV_userc3.setText("");
        txtV_userc4.setText("");
        txtV_userc5.setText("");
        txtV_pcc1.setText("");
        txtV_pcc2.setText("");
        txtV_pcc3.setText("");
        txtV_pcc4.setText("");
        txtV_pcc5.setText("");
        txtV_ganador.setText("");
        btn_carta.setEnabled(true);
    }

    public void ponerUser(){
        int carta=0,tipo=0;
        Random r=new Random();
        carta=(r.nextInt(13-1)+1);
        tipo=(r.nextInt(4-1)+1);
        contuser=contuser+carta;
        Toast.makeText(this,"User="+contuser,Toast.LENGTH_SHORT).show();
        switch (posicion){
            case 1:
                eTxt_userc1.setText(String.valueOf(carta));
                if(tipo==1){
                    if(tre<=4){
                        txtV_userc1.setText("T");
                        tre++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==2){
                    if(diam<=4){
                        txtV_userc1.setText("D");
                        diam++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==3){
                    if(cora<=4){
                        txtV_userc1.setText("C");
                        cora++;
                    }else{
                        ponerUser();
                    }
                }else{
                    if(eso<=4){
                        txtV_userc1.setText("E");
                        eso++;
                    }else{
                        ponerUser();
                    }
                }
                break;
            case 2:
                eTxt_userc2.setText(String.valueOf(carta));
                if(tipo==1){
                    if(tre<=4){
                        txtV_userc2.setText("T");
                        tre++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==2){
                    if(diam<=4){
                        txtV_userc2.setText("D");
                        diam++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==3){
                    if(cora<=4){
                        txtV_userc2.setText("C");
                        cora++;
                    }else{
                        ponerUser();
                    }
                }else{
                    if(eso<=4){
                        txtV_userc2.setText("E");
                        eso++;
                    }else{
                        ponerUser();
                    }
                }
                break;
            case 3:
                eTxt_userc3.setText(String.valueOf(carta));
                if(tipo==1){
                    if(tre<=4){
                        txtV_userc3.setText("T");
                        tre++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==2){
                    if(diam<=4){
                        txtV_userc3.setText("D");
                        diam++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==3){
                    if(cora<=4){
                        txtV_userc3.setText("C");
                        cora++;
                    }else{
                        ponerUser();
                    }
                }else{
                    if(eso<=4){
                        txtV_userc3.setText("E");
                        eso++;
                    }else{
                        ponerUser();
                    }
                }
                break;
            case 4:
                eTxt_userc4.setText(String.valueOf(carta));
                if(tipo==1){
                    if(tre<=4){
                        txtV_userc4.setText("T");
                        tre++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==2){
                    if(diam<=4){
                        txtV_userc4.setText("D");
                        diam++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==3){
                    if(cora<=4){
                        txtV_userc4.setText("C");
                        cora++;
                    }else{
                        ponerUser();
                    }
                }else{
                    if(eso<=4){
                        txtV_userc4.setText("E");
                        eso++;
                    }else{
                        ponerUser();
                    }
                }
                break;
            case 5:
                eTxt_userc5.setText(String.valueOf(carta));
                if(tipo==1){
                    if(tre<=4){
                        txtV_userc5.setText("T");
                        tre++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==2){
                    if(diam<=4){
                        txtV_userc5.setText("D");
                        diam++;
                    }else{
                        ponerUser();
                    }
                }else if(tipo==3){
                    if(cora<=4){
                        txtV_userc5.setText("C");
                        cora++;
                    }else{
                        ponerUser();
                    }
                }else{
                    if(eso<=4){
                        txtV_userc5.setText("E");
                        eso++;
                    }else{
                        ponerUser();
                    }
                }
                break;
        }
    }


    public void ponerPc(){
        int cartapc=0,tipopc=0;
        Random r=new Random();
        cartapc=(r.nextInt(14-1)+1);
        tipopc=(r.nextInt(5-1)+1);
        contpc=contpc+cartapc;
        Toast.makeText(this,"Pc="+contpc,Toast.LENGTH_SHORT).show();
        switch (posicion){
            case 1:
                eTxt_pcc1.setText(String.valueOf(cartapc));
                if(tipopc==1){
                    if(tre<=4){
                        txtV_pcc1.setText("T");
                        tre++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==2){
                    if(diam<=4){
                        txtV_pcc1.setText("D");
                        diam++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==3){
                    if(cora<=4){
                        txtV_pcc1.setText("C");
                        cora++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==4){
                    if(eso<=4){
                        txtV_pcc1.setText("E");
                        eso++;
                    }else{
                        ponerPc();
                    }
                }
                if (posicion<6){
                    posicion++;
                }else{
                    posicion=1;
                }
                break;
            case 2:
                eTxt_pcc2.setText(String.valueOf(cartapc));
                if(tipopc==1){
                    if(tre<=4){
                        txtV_pcc2.setText("T");
                        tre++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==2){
                    if(diam<=4){
                        txtV_pcc2.setText("D");
                        diam++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==3){
                    if(cora<=4){
                        txtV_pcc2.setText("C");
                        cora++;
                    }else if(tipopc==4){
                        ponerPc();
                    }
                }else{
                    if(eso<=4){
                        txtV_pcc2.setText("E");
                        eso++;
                    }else{
                        ponerPc();
                    }
                }
                if (posicion<6){
                    posicion++;
                }else{
                    posicion=1;
                }
                break;
            case 3:
                eTxt_pcc3.setText(String.valueOf(cartapc));
                if(tipopc==1){
                    if(tre<=4){
                        txtV_pcc3.setText("T");
                        tre++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==2){
                    if(diam<=4){
                        txtV_pcc3.setText("D");
                        diam++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==3){
                    if(cora<=4){
                        txtV_pcc3.setText("C");
                        cora++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==4){
                    if(eso<=4){
                        txtV_pcc3.setText("E");
                        eso++;
                    }else{
                        ponerPc();
                    }
                }
                if (posicion<6){
                    posicion++;
                }else{
                    posicion=1;
                }
                break;
            case 4:
                eTxt_pcc4.setText(String.valueOf(cartapc));
                if(tipopc==1){
                    if(tre<=4){
                        txtV_pcc4.setText("T");
                        tre++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==2){
                    if(diam<=4){
                        txtV_pcc4.setText("D");
                        diam++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==3){
                    if(cora<=4){
                        txtV_pcc4.setText("C");
                        cora++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==4){
                    if(eso<=4){
                        txtV_pcc4.setText("E");
                        eso++;
                    }else{
                        ponerPc();
                    }
                }
                if (posicion<6){
                    posicion++;
                }else{
                    posicion=1;
                }
                break;
            case 5:
                eTxt_pcc5.setText(String.valueOf(cartapc));
                if(tipopc==1){
                    if(tre<=4){
                        txtV_pcc5.setText("T");
                        tre++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==2){
                    if(diam<=4){
                        txtV_pcc5.setText("D");
                        diam++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==3){
                    if(cora<=4){
                        txtV_pcc5.setText("C");
                        cora++;
                    }else{
                        ponerPc();
                    }
                }else if(tipopc==4){
                    if(eso<=4){
                        txtV_pcc5.setText("E");
                        eso++;
                    }else{
                        ponerPc();
                    }
                }
                if (posicion<6){
                    posicion++;
                }else{
                    posicion=1;
                }
                break;
        }
    }

    public void comprobar(){
        if(contuser<21 && contpc<21){

        }else if(contuser>21 && contpc<=21){
            btn_carta.setEnabled(false);
            Toast.makeText(this,"La computadora gana!",Toast.LENGTH_SHORT).show();
            txtV_ganador.setText("PC GANA");
        }else if(contpc>21 && contuser<=21){
            btn_carta.setEnabled(false);
            Toast.makeText(this,"El usuario gana!",Toast.LENGTH_SHORT).show();
            txtV_ganador.setText("USUARIO GANA");
        }else if(contuser>21 && contpc>21){
            btn_carta.setEnabled(false);
            if(contuser<contpc){
                Toast.makeText(this,"El usuario gana!",Toast.LENGTH_SHORT).show();
                txtV_ganador.setText("USUARIO GANA");
            }else if(contpc<contuser){
                Toast.makeText(this,"La computadora gana",Toast.LENGTH_SHORT).show();
                txtV_ganador.setText("PC GANA");
            }
        }
    }
}
