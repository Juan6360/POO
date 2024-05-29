package com.juan.agencia.dominio;

public class Casa extends Inmueble implements Arrendable{
    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {
        if (!arrendado){
            arrendado = true;
        }else {
            System.out.println("El Apartamento ya esta rentado");
        }
    }

    @Override
    public void devolver() {

    }
}
