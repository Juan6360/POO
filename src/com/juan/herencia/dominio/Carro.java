package com.juan.herencia.dominio;

public class Carro extends Vehiculo {
    private String placa;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
