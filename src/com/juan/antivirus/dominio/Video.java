package com.juan.antivirus.dominio;

public class Video implements Viruseable {
    private String nombre;
    private int calidad;

    public Video(String nombre, int calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    @Override
    public boolean tieneVirus() {
        return calidad < 1000;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
