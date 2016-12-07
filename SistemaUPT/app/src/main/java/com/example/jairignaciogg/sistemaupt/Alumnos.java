package com.example.jairignaciogg.sistemaupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Alumnos extends AppCompatActivity {

    Button btnInicio,btnCR,btnCP,btnSalir;
    LinearLayout contIncio,contCR,contCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        btnInicio=(Button)findViewById(R.id.btnInicio);
        btnCR=(Button)findViewById(R.id.btnCR);
        btnCP=(Button)findViewById(R.id.btnCP);
        btnSalir=(Button)findViewById(R.id.btnSalir);

        contIncio=(LinearLayout)findViewById(R.id.contInicioA);
        contCR=(LinearLayout)findViewById(R.id.contCR);
        contCP=(LinearLayout)findViewById(R.id.contCP);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInicio();
            }
        });
        btnCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCR();
            }
        });
        btnCP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCP();
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alumnos.this, Menu.class);
                startActivity(intent);
            }
        });
    }

    private void mostrarCP() {
        contIncio.setVisibility(View.GONE);
        contCR.setVisibility(View.GONE);
        contCP.setVisibility(View.VISIBLE);
    }

    private void mostrarCR() {
        contIncio.setVisibility(View.GONE);
        contCR.setVisibility(View.VISIBLE);
        contCP.setVisibility(View.GONE);
    }

    private void mostrarInicio() {
        contIncio.setVisibility(View.VISIBLE);
        contCR.setVisibility(View.GONE);
        contCP.setVisibility(View.GONE);
    }
}
