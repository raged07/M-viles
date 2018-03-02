package com.example.thinkpad.eva_1_examen_4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements Button.OnClickListener{
    TextView txtRad, txtVwAng;
    SeekBar seek1;
    Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtRad = (TextView)findViewById(R.id.txtRad);
        txtVwAng = (TextView)findViewById(R.id.txtVwAng);
        seek1 = (SeekBar) findViewById(R.id.seek1);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(this);

        seek1.setOnSeekBarChangeListener(seekBarOnChangeListener);
        seek1.setMax(360);
        seek1.setProgress(0);
    }
    int angulo;
    public SeekBar.OnSeekBarChangeListener seekBarOnChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            angulo = i;
            txtVwAng.setText(String.valueOf(i)+" °");}
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };
    @Override
    public void onClick(View view) {
        if(txtRad.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo de radio VACIO!!!", Toast.LENGTH_SHORT).show();
        }else{
        String radioNum = txtRad.getText().toString();
        int radio = Integer.parseInt(radioNum);
        double volumen = ((0.6666)*(angulo*Math.pow(radio,3)));
        Toast.makeText(this, "El volumen es = "+volumen, Toast.LENGTH_SHORT).show();
        }
    }
    public void closeKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(txtRad.getWindowToken(), 0);
    }
}
