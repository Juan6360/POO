package com.juan.biblioteca.dominio;

public class Revista extends Recurso implements Prestable{
    public Revista(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre, nroCopias);
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }
}
