package com.juan.ventanas.dominio;

public class MensajeConsola implements Mensaje {

    @Override
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
