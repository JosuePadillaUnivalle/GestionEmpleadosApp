package com.example.gestionempleadosapp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Empleado> empleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        // Toolbar elegante
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Lista
        listView = findViewById(R.id.listViewEmpleados);
        empleados = new ArrayList<>();

        empleados.add(new EmpleadoTiempoCompleto("Ana Morales", "001", "Administración", 1000, 5, 500));
        empleados.add(new EmpleadoMedioTiempo("Luis Pérez", "002", "Diseño", 0, 4, 20, 40));
        empleados.add(new Contratista("Carlos Ruiz", "003", "Logística", 0, 2, 6, 3600));

        EmpleadoAdapter adapter = new EmpleadoAdapter(this, empleados);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Animation anim = AnimationUtils.loadAnimation(this, R.anim.item_click_anim);
            view.startAnimation(anim);

            view.postDelayed(() -> {
                Empleado emp = empleados.get(position);
                new AlertDialog.Builder(this)
                        .setTitle("Detalle del Empleado")
                        .setMessage(emp.obtenerInformacion())
                        .setPositiveButton("Cerrar", null)
                        .show();
            }, 200);
        });
    }
}
