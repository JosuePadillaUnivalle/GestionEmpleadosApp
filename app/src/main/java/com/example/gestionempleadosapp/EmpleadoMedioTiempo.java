package com.example.gestionempleadosapp;

public class EmpleadoMedioTiempo extends Empleado {
    private int horasSemanales;
    private double tarifaHora;

    public EmpleadoMedioTiempo(String nombre, String id, String departamento, double salarioBase, int aniosExperiencia, int horasSemanales, double tarifaHora) {
        super(nombre, id, departamento, salarioBase, aniosExperiencia);
        this.horasSemanales = horasSemanales;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return horasSemanales * tarifaHora;
    }

    @Override
    public String obtenerInformacion() {
        return "Empleado Medio Tiempo:\n"
                + "Nombre: " + getNombreCompleto() + "\n"
                + "ID: " + getId() + "\n"
                + "Departamento: " + getDepartamento() + "\n"
                + "Años de experiencia: " + getAniosExperiencia() + "\n"
                + "Horas Semanales: " + horasSemanales + "\n"
                + "Tarifa por Hora: " + tarifaHora + "\n"
                + "Salario: " + calcularSalario();
    }

}
