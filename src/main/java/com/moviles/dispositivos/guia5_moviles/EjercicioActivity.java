package com.moviles.dispositivos.guia5_moviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity implements View.OnClickListener{

  // Declaración de Variables
    ImageView imgView3;
    ImageView imgView4;
    ImageView imgView5;
    Button btnIZQ,btnCENT,btnDER;
    Animation anim_abajo,anim_abajo2,anim_abajo3,anim_rotar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

    // Inicializando
        btnIZQ    = (Button) findViewById(R.id.IZQ);
        btnCENT   = (Button) findViewById(R.id.CENT);
        btnDER    = (Button) findViewById(R.id.DER);

        imgView3    = (ImageView) findViewById(R.id.imageView3);
        imgView4    = (ImageView) findViewById(R.id.imageView4);
        imgView5    = (ImageView) findViewById(R.id.imageView5);

        btnIZQ.setOnClickListener(this);
        btnCENT.setOnClickListener(this);
        btnDER.setOnClickListener(this);

        //rotar
        anim_rotar = AnimationUtils.loadAnimation(this, R.anim.rotar);

    //vertical
        anim_abajo = AnimationUtils.loadAnimation(this,R.anim.a_abajo);
        anim_abajo.setDuration(1000);
        anim_abajo.setFillAfter(true);

        anim_abajo2 = AnimationUtils.loadAnimation(this,R.anim.a_abajo2);
        anim_abajo2.setDuration(1000);
        anim_abajo2.setFillAfter(true);

        anim_abajo3 = AnimationUtils.loadAnimation(this,R.anim.a_abajo3);
        anim_abajo3.setDuration(1000);
        anim_abajo3.setFillAfter(true);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.IZQ:
                //v.startAnimation(anim_rotar);
                imgView3.startAnimation(anim_abajo);
                break;

            case R.id.CENT:
               // v.startAnimation(anim_rotar);
                imgView4.startAnimation(anim_abajo2);
                break;

            case R.id.DER:
               // v.startAnimation(anim_rotar);
                imgView5.startAnimation(anim_abajo3);
                break;
        }
    }
}
