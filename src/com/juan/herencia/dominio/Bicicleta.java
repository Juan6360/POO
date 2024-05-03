package com.juan.herencia.dominio;

public class Bicicleta extends Vehiculo {
    private int cadencia;

    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }
}
