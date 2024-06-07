package com.example.practica_registro_uusario;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        //Se crea el Intent
        Intent intent = new Intent(MainActivity.this, activityVisualizar.class);
        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText) findViewById(R.id.txtApellido);
        EditText txtEmpresa = (EditText) findViewById(R.id.txtEmpresa);
        EditText txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        EditText txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        EditText txtFecha = (EditText) findViewById(R.id.txtFecha);

        Button btnMujere = (Button) findViewById(R.id.btnMujer);
        Button btnHombre = (Button) findViewById(R.id.btnHombre);


        //Creamos la información a enviar
        Bundle b = new Bundle();
        b.putString("Nombre", txtNombre.getText().toString());
        b.putString("Apellido", txtApellido.getText().toString());
        b.putString("Empresa", txtEmpresa.getText().toString());
        b.putString("Telefono", txtTelefono.getText().toString());
        b.putString("Correo", txtCorreo.getText().toString());
        b.putString("Fecha", txtFecha.getText().toString());

        if(btnMujere.isPressed()){
            b.putString("Genero", "Mujer");
        }else{
            b.putString("Genero", "Hombre");
        }



        //Se agrega la información al Intent
        intent.putExtras(b);

        //Iniciamos la nueva actividadel Intent
        startActivity(intent);


    }
}