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
        return "Contratista:\n"
                + "Nombre: " + getNombreCompleto() + "\n"
                + "ID: " + getId() + "\n"
                + "Departamento: " + getDepartamento() + "\n"
                + "Años de experiencia: " + getAniosExperiencia() + "\n"
                + "Duración del contrato (meses): " + duracionContrato + "\n"
                + "Tarifa del proyecto: " + tarifaProyecto + "\n"
                + "Salario: " + calcularSalario();
    }


}
