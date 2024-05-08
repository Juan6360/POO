package com.juan.tienda_bicicletas.dominio;

public class Directo extends Empleado{
    // Atributos
    private long salario;

    // Construct
    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    // Metodos
    public long calcularSalud(){return 0;}

    public long calcularPension(){return 0;}

    public long calcularAporte(){return 0;}

    @Override
    protected long calcularSalario(){return 0;}
}
