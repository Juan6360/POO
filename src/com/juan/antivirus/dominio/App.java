package com.juan.antivirus.dominio;

public abstract class App implements Viruseable{
    protected String nombre;
    protected double size;

    public App(String nombre, double size) {
        this.nombre = nombre;
        this.size = size;
    }

    @Override
    public String getNombre() {return nombre;}
}
