package com.juan.antivirus.dominio;

public class Mac extends Ejecutable{

    public Mac(String nombre, double version) {
        super(nombre, version);
    }

    @Override
    public boolean tieneVirus() {
        return version < 17;
    }
}
