package com.juan.taller.punto2.app;

import com.juan.taller.punto2.dominio.MaquinaDispensadora;

public class AppMaquinaDispensadora {

    public static void main(String[] args){
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora(); //Creación de una instancia de la clase MaquinaDispensadora

        maquinaDispensadora.agregarUnSnack("Hershey's", "A001", 1200, 6);
        maquinaDispensadora.agregarUnSnack("M&M", "A002", 1200, 2);

        maquinaDispensadora.imprimirSnacksEnStock();

        maquinaDispensadora.sacarSnackPorNombre("M&M", 1);
        maquinaDispensadora.imprimirSnacksEnStock();

        maquinaDispensadora.sacarSnackPorCodigo("A002", 1);
        maquinaDispensadora.imprimirSnacksEnStock();

        maquinaDispensadora.aumentarSnackPorCodigo("A002", 2);
        maquinaDispensadora.imprimirSnacksEnStock();

    }
}
