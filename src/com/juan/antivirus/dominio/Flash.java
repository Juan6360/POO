package com.juan.antivirus.dominio;

import java.time.LocalDate;

public class Flash extends Audio{
    private static final LocalDate VIRUS = LocalDate.of(2020, 1, 12);

    public Flash(String nombre, LocalDate fecha) {
        super(nombre, fecha);
    }

    @Override
    public boolean tieneVirus() {return fecha == VIRUS;}
}
