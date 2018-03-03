package com.example.thinkpad.eva_1_examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    TextView txtVwCalif, txtVwPun, txtVwFin;
    SeekBar seek1, seek2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwCalif = (TextView)findViewById(R.id.txtVwCalif);
        txtVwPun = (TextView)findViewById(R.id.txtVwPun);
        txtVwFin = (TextView)findViewById(R.id.txtVwFin);
        seek1 = (SeekBar)findViewById(R.id.seek1);
        seek2 = (SeekBar)findViewById(R.id.seek2);

        seek1.setOnSeekBarChangeListener(seekBarOnChangeListenerPun);
        seek1.setMax(100);
        seek1.setProgress(0);
        seek2.setOnSeekBarChangeListener(seekBarOnChangeListenerCalif);
        seek2.setMax(100);
        seek2.setProgress(0);
    }
        int puntaje;
    public SeekBar.OnSeekBarChangeListener seekBarOnChangeListenerPun = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            puntaje = i;
            txtVwPun.setText("Puntaje: "+String.valueOf(puntaje));
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };
    public SeekBar.OnSeekBarChangeListener seekBarOnChangeListenerCalif = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            txtVwCalif.setText(String.valueOf(i));
            //getText()
            if(i >= puntaje){txtVwFin.setText("Acreditado");}
            else{txtVwFin.setText("No acreditado");}
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };
}

