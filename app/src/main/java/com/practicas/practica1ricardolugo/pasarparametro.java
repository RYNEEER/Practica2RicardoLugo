package com.practicas.practica1ricardolugo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pasarparametro extends AppCompatActivity {

    EditText cajadedatos;
    Button buttonPasarParametro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarparametro);
        buttonPasarParametro1 = (Button)findViewById(R.id.button_PasarParametro);
        cajadedatos = (EditText) findViewById(R.id.editTextPasar);

        buttonPasarParametro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pasarparametro.this, Recibirparametro.class);
                Bundle bundle = new Bundle();

                bundle.putString("dato", cajadedatos.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}