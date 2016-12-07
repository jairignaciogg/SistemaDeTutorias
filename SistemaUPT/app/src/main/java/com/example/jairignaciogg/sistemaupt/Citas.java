package com.example.jairignaciogg.sistemaupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Citas extends AppCompatActivity {

    LinearLayout contInicio, contDispononibilidad, contConsultar, conEstudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        contInicio=(LinearLayout)findViewById(R.id.contInicio);
        contDispononibilidad=(LinearLayout)findViewById(R.id.contDisponibilidad);
        contConsultar=(LinearLayout)findViewById(R.id.contConsultarc);
        conEstudiantes=(LinearLayout)findViewById(R.id.contEstudiantesc);


        Button btnInicio=(Button)findViewById(R.id.btnInicio);
        Button btnDisponibilidad=(Button)findViewById(R.id.btnDisponibilidad);
        Button btnTutorias=(Button)findViewById(R.id.btnTutorias2);
        Button btnAlumnos=(Button)findViewById(R.id.btnEstudiantes2);
        Button btnSalir=(Button)findViewById(R.id.btnSalir);


        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInicio();
            }
        });

        btnDisponibilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDisponibilidad();
            }
        });

        btnTutorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTutorias();
            }
        });

        btnAlumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarEstudiantes();

            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Citas.this, Menu.class);
                startActivity(intent);
            }
        });



        Spinner spinnerc1=(Spinner)findViewById(R.id.spinnerc1);
        Spinner spinnerc2=(Spinner)findViewById(R.id.spinnerc2);
        Spinner spinnerc3=(Spinner)findViewById(R.id.spinnerc3);
        Spinner spinnerc4=(Spinner)findViewById(R.id.spinnerc4);
        Spinner spinnerc5=(Spinner)findViewById(R.id.spinnerc5);
        Spinner spinnerc6=(Spinner)findViewById(R.id.spinnerc6);
        Spinner spinnerc7=(Spinner)findViewById(R.id.spinnerc7);


        String[] valoresspiner1={"Enero-Febrero","Febrero-Marzo","Marzo-Abril"};
        String[] valoresspiner2={"UPT"};
        String[] valoresspiner3={"Sistemas","Robotica","Industrial"};
        String[] valoresspiner4={"Elizabeth Garcia Urbina","Carlos Enriquez Ramirez","Juan Carlos Valdiviezo"};

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner1);
        spinnerc1.setAdapter(dataAdapter1);
        spinnerc4.setAdapter(dataAdapter1);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner2);
        spinnerc2.setAdapter(dataAdapter2);
        spinnerc5.setAdapter(dataAdapter2);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner3);
        spinnerc3.setAdapter(dataAdapter3);
        spinnerc6.setAdapter(dataAdapter3);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner4);
        spinnerc7.setAdapter(dataAdapter4);



    }

    private void mostrarEstudiantes() {
        contConsultar.setVisibility(View.GONE);
        conEstudiantes.setVisibility(View.VISIBLE);
        contDispononibilidad.setVisibility(View.GONE);
        contInicio.setVisibility(View.GONE);
    }

    private void mostrarTutorias() {
        contConsultar.setVisibility(View.VISIBLE);
        conEstudiantes.setVisibility(View.GONE);
        contDispononibilidad.setVisibility(View.GONE);
        contInicio.setVisibility(View.GONE);
    }

    private void mostrarDisponibilidad() {
        contConsultar.setVisibility(View.GONE);
        conEstudiantes.setVisibility(View.GONE);
        contDispononibilidad.setVisibility(View.VISIBLE);
        contInicio.setVisibility(View.GONE);
    }

    private void mostrarInicio() {
        contConsultar.setVisibility(View.GONE);
        conEstudiantes.setVisibility(View.GONE);
        contDispononibilidad.setVisibility(View.GONE);
        contInicio.setVisibility(View.VISIBLE);

    }
}
