package com.juan.herencia.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int nroPasajeros;

    public Taxi(String marca, String modelo, String empresa) {
        super(marca, modelo);
        this.empresa = empresa; // Unicamente puede ir despues del super
    }

    public void subirPasajero() {
        this.nroPasajeros++;
    }

    public void bajarPasajero() {
        this.nroPasajeros--;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }
}
