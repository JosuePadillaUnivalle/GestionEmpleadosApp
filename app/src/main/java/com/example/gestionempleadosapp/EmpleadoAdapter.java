package com.example.gestionempleadosapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EmpleadoAdapter extends ArrayAdapter<Empleado> {

    public EmpleadoAdapter(Context context, List<Empleado> empleados) {
        super(context, 0, empleados);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Empleado empleado = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_empleado, parent, false);
        }

        TextView txtTipo = convertView.findViewById(R.id.txtTipo);
        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtId = convertView.findViewById(R.id.txtId);
        TextView txtSalario = convertView.findViewById(R.id.txtSalario);

        txtTipo.setText(getTipo(empleado));
        txtNombre.setText("Nombre: " + empleado.getNombre());
        txtId.setText("ID: " + empleado.getId());
        txtSalario.setText("Salario: " + empleado.calcularSalario());

        return convertView;
    }

    private String getTipo(Empleado empleado) {
        if (empleado instanceof EmpleadoTiempoCompleto) return "Empleado Tiempo Completo";
        if (empleado instanceof EmpleadoMedioTiempo) return "Empleado Medio Tiempo";
        if (empleado instanceof Contratista) return "Contratista";
        return "Empleado";
    }
}
