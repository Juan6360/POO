package com.juan.clinica.exceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String nombre){super("Debe ingresar una edad valida para el paciente " + nombre + ".");}
}
