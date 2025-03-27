package com.example.gestionempleadosapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    private Button btnVerEmpleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnVerEmpleados = findViewById(R.id.btnVerEmpleados);

        btnVerEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioActivity.this, ListaActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, android.R.anim.fade_out); // Animación al pasar
                finish(); // Evita que regrese a esta pantalla al retroceder
            }
        });
    }
}
