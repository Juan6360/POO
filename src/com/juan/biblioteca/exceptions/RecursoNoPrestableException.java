package com.juan.biblioteca.exceptions;

public class RecursoNoPrestableException extends RuntimeException{
    public RecursoNoPrestableException(String nombre){super("El recurso " + nombre + " no es prestable.");}
}
