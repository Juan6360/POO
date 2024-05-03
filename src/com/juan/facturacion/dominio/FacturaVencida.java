package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaVencida extends Factura{

    public final int VLOR_DIA_VENCIDO = 10000;

    protected FacturaVencida(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    public int getDiasVencidos(){return 0;}

    public long calcularVencimiento(){return 0;}

    @Override
    protected long calcularTotal() {
        return 0;
    }
}
