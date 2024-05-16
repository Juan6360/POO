package com.juan.antivirus.dominio;

public class Mp4 extends Video{

    public Mp4(String nombre, int calidad) {
        super(nombre, calidad);
    }

    @Override
    public boolean tieneVirus(){return calidad < 1000;}
}
