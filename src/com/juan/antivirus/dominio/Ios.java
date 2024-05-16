package com.juan.antivirus.dominio;

public class Ios extends App{
    private static final double VIRUS = 16.5;

    public Ios(String nombre, double size) {
        super(nombre, size);
    }

    @Override
    public boolean tieneVirus() {
        return size == VIRUS;
    }
}
