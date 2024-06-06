package com.juan.biblioteca.dominio;

public class Libro extends Recurso implements Copiable, Prestable{
    public Libro(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre, nroCopias);
    }

    @Override
    public void fotocopiar() {
        nroCopias++;
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
