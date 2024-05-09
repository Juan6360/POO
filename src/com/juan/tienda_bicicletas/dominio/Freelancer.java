package com.juan.tienda_bicicletas.dominio;

public class Freelancer extends Empleado{
    // Atributos
    private long valorHora;
    private int horasTrabajadas;

    // Construct
    public Freelancer(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected long calcularSalario(){return valorHora * horasTrabajadas;}
}
