package com.juan.tienda_bicicletas.dominio;

public abstract class Empleado{
    // Aributos
    private String nombre;

    // Construct
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Metodo
    abstract long calcularSalario();
}
