package com.juan.antivirus.dominio;

public abstract class Ejecutable implements Viruseable{
    protected String nombre;
    protected double version;

    public Ejecutable(String nombre, double version) {
        this.nombre = nombre;
        this.version = version;
    }

    @Override
    public String getNombre() {return this.nombre;}
}
