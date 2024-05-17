package com.juan.antivirus.dominio;

public class Windows extends Ejecutable{

    public Windows(String nombre, double version) {
        super(nombre, version);
    }

    @Override
    public boolean tieneVirus() {
        return version < 1.20;
    }
}
