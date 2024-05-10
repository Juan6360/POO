package com.juan.tienda_bicicletas.dominio;

public class Vendedor extends Directo{
    // Atributos
    private long ventasDelMes;

    // Construct
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    long salario = getSalario();

    // Metodos
    public long calcularComision(){
        if (getSalario() < 1500000){
            return (long) (this.ventasDelMes * 0.045);
        }
        return (long) (this.ventasDelMes * 0.035);
    }

    @Override
    protected long calcularSalario(){return super.calcularSalario() + calcularComision();}
}
