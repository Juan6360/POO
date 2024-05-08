package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIva{

    private double porcDescuento;

    protected FacturaConDescuento(long valor, String cliente, LocalDate fecha, double porcDescuento) {
        super(valor, cliente, fecha);
        this.porcDescuento = porcDescuento;
    }

    public long calcularDescuento(){return (long) (valor * porcDescuento);}

    @Override
    protected long calcularTotal(){
        return valor -= calcularDescuento();
    }

}
