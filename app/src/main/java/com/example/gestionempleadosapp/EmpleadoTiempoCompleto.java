package com.example.gestionempleadosapp;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonificacionAnual;

    public EmpleadoTiempoCompleto(String nombre, String id, String departamento, double salarioBase, int aniosExperiencia, double bonificacionAnual) {
        super(nombre, id, departamento, salarioBase, aniosExperiencia);
        this.bonificacionAnual = bonificacionAnual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonificacionAnual;
    }

    @Override
    public String obtenerInformacion() {
        return "Empleado Tiempo Completo:\nNombre: " + getNombreCompleto() +
                "\nID: " + getId() +
                "\nSalario: " + calcularSalario();
    }
}
