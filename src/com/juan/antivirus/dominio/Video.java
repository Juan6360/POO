package com.juan.antivirus.dominio;

public abstract class Video implements Viruseable {
    protected String nombre;
    protected int calidad;

    public Video(String nombre, int calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
