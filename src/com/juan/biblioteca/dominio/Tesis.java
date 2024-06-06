package com.juan.biblioteca.dominio;

public class Tesis extends Recurso implements Copiable{
    public Tesis(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre, nroCopias);
    }

    @Override
    public void fotocopiar() {
        nroCopias++;
    }
}
