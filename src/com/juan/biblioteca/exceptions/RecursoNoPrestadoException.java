package com.juan.biblioteca.exceptions;

public class RecursoNoPrestadoException extends RuntimeException{
    public RecursoNoPrestadoException(String nombre){super("El recurso " + nombre + "se encuentra disponible para prestar.");}
}
