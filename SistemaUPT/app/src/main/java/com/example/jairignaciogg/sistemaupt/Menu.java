package com.example.jairignaciogg.sistemaupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Menu extends  AppCompatActivity {

    private Button btnInstitucional;
    private Button btnCordinador;
    private Button btnTutor;
    private Button btnAlumnos;
    private Button btnContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        //Cordinador Institucional tipo 1

        btnInstitucional= (Button)findViewById(R.id.btnInstitucional);
        btnCordinador=(Button)findViewById(R.id.btnCoordi);
        btnTutor=(Button)findViewById(R.id.btnTutor);
        btnAlumnos=(Button)findViewById(R.id.btnEstudiante);
        btnContacto=(Button)findViewById(R.id.btnContacto);

        btnInstitucional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipo="1";

                Intent intent = new Intent(Menu.this, login.class);
                intent.putExtra("tipo", tipo);
                startActivity(intent);
            }
        });

        //Cordinador Tutores tipo 2
        btnCordinador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipo="2";

                Intent intent = new Intent(Menu.this, login.class);
                intent.putExtra("tipo", tipo);
                startActivity(intent);
            }
        });

        //Tutor tipo 3
        btnTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipo="3";
                Intent intent = new Intent(Menu.this, login.class);
                intent.putExtra("tipo", tipo);
                startActivity(intent);
            }
        });

        //Estudiante tipo 4
        btnAlumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipo="4";
                Intent intent = new Intent(Menu.this, login.class);
                intent.putExtra("tipo", tipo);
                startActivity(intent);
            }
        });

        //Contacto tipo 5
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this, Contacto.class);
                startActivity(intent);
            }
        });

    }
}
