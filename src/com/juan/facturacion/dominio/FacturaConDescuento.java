package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIva{

    private double porcDescuento;

    protected FacturaConDescuento(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    public long calcularDescuento(){return 0;}
}
