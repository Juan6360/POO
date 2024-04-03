package com.alejandro.taller.punto2.app;

import com.alejandro.taller.punto2.dominio.MaquinaDispensadora;
import com.alejandro.taller.punto2.dominio.Snack;

import java.util.List;

public class AppMaquinaDispensadora {

    public static void main(String[] args){
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora(); //Creación de una instancia de la clase MaquinaDispensadora

        maquinaDispensadora.agregarUnSnack("Hershey's", "A001", 1200, 6);
        maquinaDispensadora.agregarUnSnack("Hershey's", "A001", 1200, 1);

        List<Snack> listaStock = maquinaDispensadora.snacksEnStock();
        listaStock.forEach(snack -> System.out.println(snack.getNombre() + '\n' +
                                                        snack.getCodigo() + '\n' +
                                                        snack.getPrecio() + '\n' +
                                                        snack.getCantidad()));
    }
}
