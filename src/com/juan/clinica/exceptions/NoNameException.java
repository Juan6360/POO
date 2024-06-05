package com.juan.clinica.exceptions;

public class NoNameException extends RuntimeException{
    public NoNameException(){super("Debe proporcionar el nombre del paciente.");}
}
