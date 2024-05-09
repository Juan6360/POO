package com.juan.tienda_bicicletas.dominio;

public class Directo extends Empleado{
    // Atributos
    private long salario;

    // Construct
    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    // Getters
    public long getSalario() {
        return salario;
    }

    // Metodos
    public long calcularSalud(){return (long) (this.salario * 0.057);}

    public long calcularPension(){return (long) (this.salario * 0.065);}

    public long calcularAporte(){return calcularSalud() + calcularPension();}

    @Override
    protected long calcularSalario(){return salario -= calcularAporte();}
}
