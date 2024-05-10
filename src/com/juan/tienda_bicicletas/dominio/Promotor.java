package com.juan.tienda_bicicletas.dominio;

public class Promotor extends Empleado{
    // Atributos
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    // Construct
    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    // Metodos
    public long pagoVolantes(){return volantesRepartidos * valorVolante;}

    public long bonusCompra(){return (long) 12900 * comprasVolante;}

    @Override
    protected long calcularSalario(){return pagoVolantes() + bonusCompra();}
}
