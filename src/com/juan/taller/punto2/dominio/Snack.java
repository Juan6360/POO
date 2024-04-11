package com.juan.taller.punto2.dominio;

public class Snack {
    //Atributos
    private String nombre;
    private String codigo;
    private int precio;
    private int cantidad;

    //Constructor
    public Snack(String nombre, String codigo, int precio, int cantidad){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {return nombre;}

    public String getCodigo() {return codigo;}

    public int getPrecio() {return precio;}

    public int getCantidad(){return cantidad;}

    public void setCantidad(int cantidad){this.cantidad = cantidad;}
}
