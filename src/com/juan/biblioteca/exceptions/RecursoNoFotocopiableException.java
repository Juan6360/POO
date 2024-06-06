package com.juan.biblioteca.exceptions;

public class RecursoNoFotocopiableException extends RuntimeException{
    public RecursoNoFotocopiableException(String nombre){super("El recurso " + nombre + " no es fotocopiable.");}
}
