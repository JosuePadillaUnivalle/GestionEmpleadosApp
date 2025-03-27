package com.example.gestionempleadosapp;

public class Contratista extends Empleado {
    private int duracionContrato;
    private double tarifaProyecto;

    public Contratista(String nombre, String id, String departamento, double salarioBase, int aniosExperiencia, int duracionContrato, double tarifaProyecto) {
        super(nombre, id, departamento, salarioBase, aniosExperiencia);
        this.duracionContrato = duracionContrato;
        this.tarifaProyecto = tarifaProyecto;
    }

    @Override
    public double calcularSalario() {
        return tarifaProyecto / duracionContrato;
    }

    @Override
    public String obtenerInformacion() {
        return "Contratista:\nNombre: " + getNombreCompleto() +
                "\nID: " + id +
                "\nSalario: " + calcularSalario();
    }

}
