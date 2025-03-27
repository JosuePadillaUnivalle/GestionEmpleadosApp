package com.example.gestionempleadosapp;

public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected String departamento;
    protected double salarioBase;
    protected int aniosExperiencia;

    public Empleado(String nombre, String id, String departamento, double salarioBase, int aniosExperiencia) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter estándar
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // NUEVO: Devuelve nombre completo (si tuvieras nombre + apellido en una sola propiedad)
    public String getNombreCompleto() {
        return nombre; // Si tienes nombre + apellido junto, aquí basta
    }

    public abstract double calcularSalario();

    public abstract String obtenerInformacion();
}
