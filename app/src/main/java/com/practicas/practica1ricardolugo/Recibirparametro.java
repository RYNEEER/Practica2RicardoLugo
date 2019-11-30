package com.practicas.practica1ricardolugo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recibirparametro extends AppCompatActivity {

    TextView ParametroRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibirparametro);

        ParametroRecibido = (TextView) findViewById(R.id.textView_parametro);
        Bundle bundle = this.getIntent().getExtras();
        ParametroRecibido.setText(bundle.getString("dato"));
    }
}

