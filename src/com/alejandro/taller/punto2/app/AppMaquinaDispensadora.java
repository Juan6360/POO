package com.alejandro.taller.punto2.app;

import com.alejandro.taller.punto2.dominio.MaquinaDispensadora;

public class AppMaquinaDispensadora {

    public static void main(String[] args){
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora();

        maquinaDispensadora.agregarUnSnack("Hershey's", "A001", 1200, 6);
    }
}
