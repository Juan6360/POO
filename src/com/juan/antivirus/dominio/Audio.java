package com.juan.antivirus.dominio;

import java.time.LocalDate;

public abstract class Audio implements Viruseable{
    protected String nombre;
    protected LocalDate fecha;

    public Audio(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String getNombre(){return this.nombre;}
}
