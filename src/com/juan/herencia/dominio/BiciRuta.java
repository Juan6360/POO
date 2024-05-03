package com.juan.herencia.dominio;

public class BiciRuta extends Bicicleta {
    public BiciRuta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "Bici de ruta";
    }
}
