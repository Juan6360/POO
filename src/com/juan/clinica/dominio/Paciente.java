package com.juan.clinica.dominio;

public abstract class Paciente {
    //Atributos
    private String nombre;
    private int edad;
    protected boolean necesitaCirugia;

    //Constructor
    public Paciente(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
