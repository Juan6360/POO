package com.juan.biblioteca.dominio;

public abstract class Recurso {
    //Atributos
    protected String codigo;
    protected String nombre;
    protected boolean prestado = false;
    protected int nroCopias;

    //Constructor

    public Recurso(String codigo, String nombre, int nroCopias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nroCopias = nroCopias;
    }
}
