package com.juan.agencia.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Inmueble {
    //Atributos
    protected String direccion;
    protected long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;
    protected List<Inmueble> inmuebles = new ArrayList<>();


}
