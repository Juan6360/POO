package com.juan.agencia.dominio;

public class Apartamento extends Inmueble implements Arrendable{

    //Constructor
    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    //Getters


    @Override
    public void arrendar() {
        if (!arrendado){
            arrendado = true;
        }else {
            System.out.println("El Apartamento ya esta rentado.");
        }
    }

    @Override
    public void devolver() {
        if (arrendado){
            arrendado = false;
        }else {
            System.out.println("El apartamento no se encuentra rentado.");
        }
    }
}
