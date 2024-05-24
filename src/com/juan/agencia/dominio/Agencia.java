package com.juan.agencia.dominio;

import java.util.List;

public class Agencia {
    //Atributos
    private String nombre;

    //Metodos
    public void agregarInmueble(Inmueble i){}

    public boolean arrendar(Arrendable inmueble){return false;}

    public boolean devolver(Arrendable inmueble){return false;}

    public boolean vender(Arrendable inmueble){return false;}

    public List<Inmueble> getArrendablesDisponibles(){return null;}

    public List<Inmueble> getArrendados(){return null;}
}