package com.example.jairignaciogg.sistemaupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {

    private TextView txtAviso;
    private EditText txtUser, txtPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final String tipo1 = getIntent().getExtras().getString("tipo");


        btnLogin = (Button) findViewById(R.id.btnEntrar);
        txtUser = (EditText) findViewById(R.id.txtUsuario);

        txtPass = (EditText) findViewById(R.id.txtPass);



        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String usuario = txtUser.getText().toString();
                final String pass = txtPass.getText().toString();

                if (usuario.equalsIgnoreCase("1234") && pass.equalsIgnoreCase("1234")) {
                    if (tipo1.equalsIgnoreCase("1")) { //Cordinador Institucional
                        Intent intent = new Intent(login.this, Institucional.class);
                        startActivity(intent);
                    } else if (tipo1.equalsIgnoreCase("2")) { //Coordinador Tutores
                        Intent intent = new Intent(login.this, Institucional.class);
                        startActivity(intent);
                    } else if (tipo1.equalsIgnoreCase("3")) { //Tutores
                        Intent intent = new Intent(login.this, Citas.class);
                        startActivity(intent);
                    } else if (tipo1.equalsIgnoreCase("4")) { //Alumnos
                        Intent intent = new Intent(login.this, Alumnos.class);
                        startActivity(intent);
                    }

                } else {
                    txtAviso = (TextView) findViewById(R.id.txtAviso);
                    txtAviso.setVisibility(View.VISIBLE);
                    txtAviso.setText(usuario+" ....."+pass);
                }
            }


        });
    }
}
