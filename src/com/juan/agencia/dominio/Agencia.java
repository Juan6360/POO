package com.juan.agencia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    //Atributos
    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia(){this.inmuebles = new ArrayList<>();}

    //Metodos
    public void agregarInmueble(Inmueble i){
        this.inmuebles.add(i);
    }

    public boolean arrendar(Arrendable inmueble){
        if (inmueble instanceof Casa inmuebleActual){
            inmuebleActual.arrendar();
            return true;
        }else if (inmueble instanceof Apartamento inmubleActual){
            inmubleActual.arrendar();
        }
        return false;
    }

    public boolean devolver(Arrendable inmueble){return false;}

    public boolean vender(Arrendable inmueble){return false;}

    public List<Inmueble> getArrendablesDisponibles(){return null;}

    public List<Inmueble> getArrendados(){return null;}
}