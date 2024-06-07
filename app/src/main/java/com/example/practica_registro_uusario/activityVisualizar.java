package com.example.practica_registro_uusario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activityVisualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_visualizar);

        TextView txtNombre=(TextView) findViewById(R.id.textVNombre);
        TextView txtApellido=(TextView) findViewById(R.id.txtVApellido);
        TextView txtEmpresa=(TextView) findViewById(R.id.txtVEmpresa);
        TextView txtTelefono=(TextView) findViewById(R.id.txtVTelefono);
        TextView txtCorreo=(TextView) findViewById(R.id.txtVCorreo);
        TextView txtFecha=(TextView) findViewById(R.id.txtVFechaN);
        TextView txtGeneroM=(TextView) findViewById(R.id.txtVGenero);



        //recuperamos la informacion
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje
        txtNombre.setText(bundle.getString("Nombre"));
        txtApellido.setText(bundle.getString("Apellido"));
        txtEmpresa.setText(bundle.getString("Empresa"));
        txtTelefono.setText(bundle.getString("Telefono"));
        txtCorreo.setText(bundle.getString("Correo"));
        txtFecha.setText(bundle.getString("Fecha"));
        txtGeneroM.setText(bundle.getString("Genero"));




    }

    public void btnRegresar(View view){
        Intent intent = new Intent(activityVisualizar.this, MainActivity.class);
        startActivity(intent);
    }
}