package com.example.gestionempleadosapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button btnVerEmpleados = findViewById(R.id.btnVerEmpleados);
        btnVerEmpleados.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListaActivity.class);
            startActivity(intent);
        });
    }
}
