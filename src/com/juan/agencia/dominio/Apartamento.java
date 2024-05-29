package com.juan.agencia.dominio;

public class Apartamento extends Inmueble implements Arrendable{

    //Constructor
    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public String toString(){
        String estado = null;
        if (arrendado){
            estado = "Arrendada";
        }else {
            estado = "Disponible";
        }

        return "Dirección: " + direccion + "\n" +
                "Valor de venta: " + valorVenta + "\n" +
                "Valor de arriendo: " + valorArriendo + "\n" +
                "Estado: " + estado + "\n";
    }

    @Override
    public void arrendar() {
        if (arrendado){
            throw new ArrendadoException("El apartamento ya se encuentra rentado.");
        }else {
            arrendado = true;
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
