package com.juan.agencia.dominio;

public abstract class Inmueble {
    //Atributos
    protected String direccion;
    protected long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;

    //Constructor
    public Inmueble(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendado;
    }

    //Getters
    public boolean isArrendado() {return arrendado;}
}
