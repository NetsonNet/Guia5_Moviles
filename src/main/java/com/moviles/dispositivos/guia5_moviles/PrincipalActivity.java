package com.moviles.dispositivos.guia5_moviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {
    Button btnEjemplos,btnEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnEjemplos     = (Button) findViewById(R.id.btnEjemplos);
        btnEjercicios   = (Button) findViewById(R.id.btnEjercicios);


        btnEjemplos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        PrincipalActivity.this,
                        EjemploActivity.class
                ));
            }
        });
        btnEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        PrincipalActivity.this,
                        EjercicioActivity.class
                ));
            }
        });

    }
}
