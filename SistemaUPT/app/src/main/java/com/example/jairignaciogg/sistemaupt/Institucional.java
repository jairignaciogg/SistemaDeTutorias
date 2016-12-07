package com.example.jairignaciogg.sistemaupt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Institucional extends AppCompatActivity {

    private Button btnInicio, btnTutorias, btnEstudiantes, btnSalir, btnAsignar, btnAsignar2,btnNuevo,btnCrearNuevo, btnConsultar;
    private LinearLayout contInicio,contTutorias,contAsignar,contNuevo,contEstudiantes, contConsultar;
    private Context activity;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institucional);


        contInicio=(LinearLayout)findViewById(R.id.contInicio);
        contTutorias=(LinearLayout)findViewById(R.id.contTutorias);
        contAsignar=(LinearLayout)findViewById(R.id.contTutoriasAsignar);
        contNuevo=(LinearLayout)findViewById(R.id.contCrear);
        contEstudiantes=(LinearLayout)findViewById(R.id.contEstudiantes);
        contConsultar=(LinearLayout)findViewById(R.id.contConsultar);

        btnInicio=(Button)findViewById(R.id.btnInicio);
        btnTutorias=(Button)findViewById(R.id.btnTutorias);
        btnEstudiantes=(Button)findViewById(R.id.btnEstudiantes);
        btnSalir=(Button)findViewById(R.id.btnSalir);
        btnAsignar=(Button)findViewById(R.id.btnAsignar);
        btnAsignar2=(Button)findViewById(R.id.btnAsignar2);
        btnNuevo=(Button)findViewById(R.id.btnNuevo);
        btnCrearNuevo=(Button)findViewById(R.id.btnCrearNuevo);
        btnConsultar=(Button)findViewById(R.id.btnConsultar);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarContInicio();
            }
        });

        btnTutorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarContTutorias();
            }
        });

        btnAsignar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarContAsignar();
            }
        });

        btnAsignar2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "Asignado correctamente", Toast.LENGTH_SHORT);

                    toast1.show();
                    mostrarContInicio();


            }
        });

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarContNuevo();
            }
        });

        btnCrearNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Creado correctamente", Toast.LENGTH_SHORT);

                toast1.show();
                mostrarContInicio();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Institucional.this, Menu.class);
                startActivity(intent);
            }
        });

        btnEstudiantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarContEstudiantes();
            }
        });

        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarContConsultar();
            }
        });



        Spinner spiner1=(Spinner)findViewById(R.id.spinner1);
        Spinner spiner2=(Spinner)findViewById(R.id.spinner2);
        Spinner spiner3=(Spinner)findViewById(R.id.spinner3);
        Spinner spiner4=(Spinner)findViewById(R.id.spinner4);
        Spinner spiner5=(Spinner)findViewById(R.id.spinner5);
        Spinner spiner6=(Spinner)findViewById(R.id.spinner6);
        Spinner spiner7=(Spinner)findViewById(R.id.spinner7);
        Spinner spiner8=(Spinner)findViewById(R.id.spinner8);
        String[] valoresspiner1={"Sistemas Computacionales","Civil","Robotica"};
        String[] valoresspiner2={"103","203","303"};
        String[] valoresspiner3={"Victor Morales Avila","Jair Ignacio Gonzalez Gayosso","Juan Jacob Basilio Manuel"};
        String[] valoresspiner4={"Enero-Febrero","Febrero-Marzo","Marzo-Abril"};
        String[] valoresspiner5={"UPT"};
        String[] valoresspiner6={"Sistemas","Robotica","Industrial"};
        String[] valoresspiner7={"Elizabeth Garcia Urbina","Carlos Enriquez Ramirez","Juan Carlos Valdiviezo"};
        String[] valoresspiner8={"103","203","303"};

        ArrayAdapter<String>dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner1);
        spiner1.setAdapter(dataAdapter1);

        ArrayAdapter<String>dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner2);
        spiner2.setAdapter(dataAdapter2);

        ArrayAdapter<String>dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner3);
        spiner3.setAdapter(dataAdapter3);

        ArrayAdapter<String>dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner4);
        spiner4.setAdapter(dataAdapter4);

        ArrayAdapter<String>dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner5);
        spiner5.setAdapter(dataAdapter5);

        ArrayAdapter<String>dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner6);
        spiner6.setAdapter(dataAdapter6);

        ArrayAdapter<String>dataAdapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner7);
        spiner7.setAdapter(dataAdapter7);

        ArrayAdapter<String>dataAdapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresspiner8);
        spiner8.setAdapter(dataAdapter8);
    }

    private void mostrarContConsultar() {
        contInicio.setVisibility(View.GONE);
        contTutorias.setVisibility(View.GONE);
        contAsignar.setVisibility(View.GONE);
        contNuevo.setVisibility(View.GONE);
        contEstudiantes.setVisibility(View.GONE);

        contConsultar.setVisibility(View.VISIBLE);
    }

    private void mostrarContEstudiantes() {
        contInicio.setVisibility(View.GONE);
        contTutorias.setVisibility(View.GONE);
        contAsignar.setVisibility(View.GONE);
        contNuevo.setVisibility(View.GONE);
        contConsultar.setVisibility(View.GONE);

        contEstudiantes.setVisibility(View.VISIBLE);
    }

    private void mostrarContNuevo() {
        contInicio.setVisibility(View.GONE);
        contTutorias.setVisibility(View.GONE);
        contAsignar.setVisibility(View.GONE);
        contEstudiantes.setVisibility(View.GONE);
        contConsultar.setVisibility(View.GONE);

        contNuevo.setVisibility(View.VISIBLE);
    }

    private void mostrarContAsignar() {
        contInicio.setVisibility(View.GONE);
        contTutorias.setVisibility(View.GONE);
        contNuevo.setVisibility(View.GONE);
        contEstudiantes.setVisibility(View.GONE);
        contConsultar.setVisibility(View.GONE);

        contAsignar.setVisibility(View.VISIBLE);
    }

    private void mostrarContTutorias() {
        contAsignar.setVisibility(View.GONE);
        contInicio.setVisibility(View.GONE);
        contNuevo.setVisibility(View.GONE);
        contEstudiantes.setVisibility(View.GONE);
        contConsultar.setVisibility(View.GONE);

        contTutorias.setVisibility(View.VISIBLE);
    }

    private void mostrarContInicio() {
        contAsignar.setVisibility(View.GONE);
        contTutorias.setVisibility(View.GONE);
        contNuevo.setVisibility(View.GONE);
        contEstudiantes.setVisibility(View.GONE);
        contConsultar.setVisibility(View.GONE);

        contInicio.setVisibility(View.VISIBLE);
    }






    public Context getActivity() {
        return activity;
    }
}
