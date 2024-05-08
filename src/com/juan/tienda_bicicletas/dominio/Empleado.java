package com.juan.tienda_bicicletas.dominio;

public abstract class Empleado{
    // Aributos
    private String nombre;

    // Construct
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Metodo
    protected long calcularSalario(){return 0;}
}
