package com.juan.antivirus.dominio;

import java.time.LocalDate;

public class Mp3 extends Audio{
    private static final LocalDate TODAY = LocalDate.now();

    public Mp3(String nombre, LocalDate fecha) {
        super(nombre, fecha);
    }

    @Override
    public boolean tieneVirus() {return fecha != TODAY;}
}
