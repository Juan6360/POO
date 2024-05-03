package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIva extends Factura {
    private double porcIva;

    protected FacturaConIva(long valor, String cliente, LocalDate fecha, double porcIva) {
        super(valor, cliente, fecha);
        this.porcIva = porcIva;
    }

    public long calcularIva() {
        return (long) (valor * porcIva);
    }

    @Override
    protected long calcularTotal() {
        return valor + calcularIva();
    }
}
