package com.juan.biblioteca.exceptions;

public class RecursoPrestadoException extends RuntimeException{
    public RecursoPrestadoException(String nombre){super("El recurso " + nombre + " no se haya disponible.");}
}
