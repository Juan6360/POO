package com.juan.agencia.dominio;

public class Casa extends Inmueble implements Arrendable{
    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
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
        if (!arrendado){
            arrendado = true;
        }else {
            System.out.println("La casa ya esta rentada.");
        }
    }

    @Override
    public void devolver() {
        if (arrendado){
            arrendado = false;
        }else {
            System.out.println("La casa no se encuentra rentada.");
        }
    }
}
