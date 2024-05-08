package com.juan.tienda_bicicletas.dominio;

public class Vendedor extends Directo{
    // Atributos
    private long ventasDelMes;

    // Construct
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    // Metodos
    public long calcularComision(){return 0;}
}
