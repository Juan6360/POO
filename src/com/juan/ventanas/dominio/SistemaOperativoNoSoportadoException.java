package com.juan.ventanas.dominio;

public class SistemaOperativoNoSoportadoException extends RuntimeException {
    SistemaOperativoNoSoportadoException(String os) {
        super("El sistema operativo " + os + " no es soportado.");
    }
}
