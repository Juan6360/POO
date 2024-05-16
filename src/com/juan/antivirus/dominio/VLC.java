package com.juan.antivirus.dominio;

public class VLC extends Video{
    public VLC(String nombre, int calidad) {
        super(nombre, calidad);
    }

    @Override
    public boolean tieneVirus() {
        return !nombre.endsWith(".vlc");
    }
}
