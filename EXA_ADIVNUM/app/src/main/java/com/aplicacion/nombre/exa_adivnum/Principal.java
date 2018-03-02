package com.aplicacion.nombre.exa_adivnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;

public class Principal extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {
    //Variables globales
    int intento=0,v1=0,v2=0,v3=0,v4=0,v5=0,posocul=0,a1=0,d=0,oculgeom=0,ptg=0,rg=0,v1geom=0,v2geom=0,v3geom=0,v4geom=0,v5geom=0;
    //Componentes
    EditText eTxt_1,eTxt_2,eTxt_3,eTxt_4,eTxt_5,eTxt_res;
    RadioButton rb_arit,rb_geom;
    Button btn_ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        eTxt_1=(EditText)findViewById(R.id.eTxt_1);
        eTxt_2=(EditText)findViewById(R.id.eTxt_2);
        eTxt_3=(EditText)findViewById(R.id.eTxt_3);
        eTxt_4=(EditText)findViewById(R.id.eTxt_4);
        eTxt_5=(EditText)findViewById(R.id.eTxt_5);
        eTxt_res=(EditText)findViewById(R.id.edTxt_res);
        rb_arit=(RadioButton)findViewById(R.id.rb_arit);
        rb_geom=(RadioButton)findViewById(R.id.rb_geom);
        btn_ver=(Button)findViewById(R.id.btn_ver);
        rb_arit.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //Al cambiar de RadioButton se ejecutara el procedimiento correspondiente
        if(rb_arit.isChecked()){
            ponerArit();
        }else if(rb_geom.isChecked()){
            ponerGeom();
        }
    }

    public void ponerArit(){
        //Variables para operaciones
        int res,inicial,pos=1,dist,ocult;
        String cad;
        /*Numeros random para calcular:
        a)Numero inicial [1-20]
        b)Distancia entre los numeros [1-10]
        c)La posicion que se le ocultara al usuario
         */
        Random r=new Random();
        inicial=(r.nextInt(20-1)+1);
        a1=inicial;
        dist=(r.nextInt(10-1)+1);
        d=dist;
        ocult=(r.nextInt(5-1)+1);
        for (int i=1;i<6;i++) {
            //El ciclo for es para poner en cada editText un numero perteneciente a la serie
            res=inicial+((i-1)*dist);
            cad=String.valueOf(res);
            switch (i){
                case 1:
                    //Si la posicion "i" es diferente a la posicion a ocultar "ocult" se pone el numero en el editText
                    if (i!=ocult){
                        eTxt_1.setText(cad);
                        v1=res;
                    }else{
                        //Si la posicion es igual al numero a ocultar se pone una cadena vacia en ese lugar
                        eTxt_1.setText("");
                        v1=res;
                        posocul=1;
                    }
                    break;
                case 2:
                    if (i!=ocult){
                        eTxt_2.setText(cad);
                        v2=res;
                    }else{
                        eTxt_2.setText("");
                        v2=res;
                        posocul=2;
                    }
                    break;
                case 3:
                    if (i!=ocult){
                        eTxt_3.setText(cad);
                        v3=res;
                    }else{
                        eTxt_3.setText("");
                        v3=res;
                        posocul=3;
                    }
                    break;
                case 4:
                    if (i!=ocult){
                        eTxt_4.setText(cad);
                        v4=res;
                    }else{
                        eTxt_4.setText("");
                        v4=res;
                        posocul=4;
                    }
                    break;
                case 5:
                    if (i!=ocult){
                        eTxt_5.setText(cad);
                        v5=res;
                    }else{
                        eTxt_5.setText("");
                        v5=res;
                        posocul=5;
                    }
                    break;
            }
        }
        /*Toast.makeText(this,"a1= "+inicial+" dist= "+dist,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v1,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v2,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v3,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v4,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v5,Toast.LENGTH_SHORT).show();*/

    }

    public void ponerGeom(){
        //Variables para las operaciones
        int ptergrom,resgeom,rgeom,pote;
        String valor="";
        Random r=new Random();
        /*
        Se calcularon numeros random para:
        a)Primer numero de la serie [1-10]
        b)El valor de r [2-6]
        c)La posicion que se ocultara al usuario
         */
        ptergrom=(r.nextInt(10-1)+1);
        ptg=ptergrom;
        rgeom=(r.nextInt(6-2)+2);
        rg=rgeom;
        oculgeom=(r.nextInt(5-1)+1);
        for (int i=1;i<6;i++){
            //Se realiza las operaciones para calcular los valores de la serie y asi ponerlos en los editText
            double potenciad=Math.pow(rgeom,(i-1));
            pote=(int)potenciad;
            resgeom=ptergrom*pote;
            valor=String.valueOf(resgeom);
            switch (i){
                //Al igual que en el aritmetico si la posicion es diferente a la posicion a ocultar se coloca el numero y si no
                //se coloca una cadena vacia
                case 1:
                    if(i!=oculgeom){
                       eTxt_1.setText(valor);
                       v1geom=resgeom;
                    }else{
                        eTxt_1.setText("");
                        v1geom=resgeom;
                    }
                    break;
                case 2:
                    if(i!=oculgeom){
                        eTxt_2.setText(valor);
                        v2geom=resgeom;
                    }else{
                        eTxt_2.setText("");
                        v2geom=resgeom;
                    }
                    break;
                case 3:
                    if(i!=oculgeom){
                        eTxt_3.setText(valor);
                        v3geom=resgeom;
                    }else{
                        eTxt_3.setText("");
                        v3geom=resgeom;
                    }
                    break;
                case 4:
                    if(i!=oculgeom){
                        eTxt_4.setText(valor);
                        v4geom=resgeom;
                    }else{
                        eTxt_4.setText("");
                        v4geom=resgeom;
                    }
                    break;
                case 5:
                    if(i!=oculgeom){
                        eTxt_5.setText(valor);
                        v5geom=resgeom;
                    }else{
                        eTxt_5.setText("");
                        v5geom=resgeom;
                    }
                    break;
            }
        }
        /*Toast.makeText(this,"a1= "+ptergrom+" r= "+rgeom,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v1geom,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v2geom,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v3geom,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v4geom,Toast.LENGTH_SHORT).show();
        Toast.makeText(this," "+v5geom,Toast.LENGTH_SHORT).show();*/
    }

    public void verificar(View v){
        /*
        Primero verifica que haya una entrada en el editText
        Despues checa cual RadioButton esta seleccionado para llamar al metodo de verificacion correspondiente
         */
        if(TextUtils.isEmpty(eTxt_res.getText().toString())){
            Toast.makeText(this,"Introduzca un número",Toast.LENGTH_SHORT).show();
        }else{
            if (rb_arit.isChecked()){
                int res=Integer.parseInt(eTxt_1.getText().toString());
                verArit(res);
            }else{
                verGeom();
            }
        }

    }

    public void verArit(int num){
        /*
        Con las variables globales se hace la operacion para calcular el numero que falta en la serie y
        se obtiene el valor que tecleo el usuario para hacer una comparacion
         */
        int result=a1+((posocul-1)*d);
        int n=Integer.parseInt(eTxt_res.getText().toString());
        if(result==n){
            Toast.makeText(this,"¡Respuesta Correcta!",Toast.LENGTH_SHORT).show();
            //Si la respuesta es correcta se ejecuta el metodo reinicio
            reinicio();
        }else{
            //Si la respuesta es erronea se limpia el campo para que el usuario ponga otra respuesta
            //se hace un incremento en la variable global "intento"
            eTxt_res.setText("");
            intento++;
        }
        //Cuando se junten 3 intentos erroneos se notifica y se reinicia el juego
        if(intento==3){
            Toast.makeText(this,"¡Haz perdido! :(",Toast.LENGTH_SHORT).show();
            reinicio();
        }
    }

    public void verGeom(){
        //Se hace lo mismo que en el meotodo verArit para checar la respuesta
        int n=Integer.parseInt(eTxt_res.getText().toString());
        double potencia=Math.pow(rg,(oculgeom-1));
        int pote=(int)potencia;
        int rs=ptg*pote;
        if(rs==n){
            Toast.makeText(this,"¡Respuesta Correcta!",Toast.LENGTH_SHORT).show();
            reinicio();
        }else{
            eTxt_res.setText("");
            intento++;
        }
        if(intento==3){
            Toast.makeText(this,"¡Haz perdido! :(",Toast.LENGTH_SHORT).show();
            reinicio();
        }
    }

    public void reinicio(){
        //Se las limpian las entradas y se pone en 0 el contador de intentos
        eTxt_1.setText("");
        eTxt_2.setText("");
        eTxt_3.setText("");
        eTxt_4.setText("");
        eTxt_5.setText("");
        eTxt_res.setText("");
        intento=0;
        //Verifica que RadioButton esta seleccionado para poner una nueva serie en pantalla
        if (rb_arit.isChecked()){
            ponerArit();
        }else if (rb_geom.isChecked()){
            ponerGeom();
        }
    }
}
