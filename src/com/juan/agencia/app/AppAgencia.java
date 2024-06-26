package com.juan.agencia.app;

import com.juan.agencia.dominio.*;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        Inmueble inmueble_1 = new Casa("Cra 55 AD #14b84", 150_000_000, 1_700_000,
                                        false);
        Inmueble inmueble_2 = new Lote("Cra 30 #26-20", 150_000_000, 0, false);
        Inmueble inmueble_3 = new Apartamento("Cra 15 #27-28", 150_000_000, 1_700_000,
                                        false);

        agencia.agregarInmueble(inmueble_1);
        agencia.agregarInmueble(inmueble_2);
        agencia.agregarInmueble(inmueble_3);

        try{
            agencia.arrendar((Arrendable) inmueble_1);
            agencia.arrendar((Arrendable) inmueble_3);
            agencia.arrendar((Arrendable) inmueble_2);

        }catch (ClassCastException cc){
            System.out.println("ERROR -> Los lotes no estan disponibles para venta.");
        }

        agencia.arrendar((Arrendable) inmueble_3);

        agencia.vender(inmueble_2);

        System.out.println();
        System.out.println(agencia.getArrendablesDisponibles());
        System.out.println();
        System.out.println(agencia.getArrendados());
        System.out.println();
        agencia.printArrendables();
    }
}
