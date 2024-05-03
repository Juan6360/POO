package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaVencida extends Factura{
    protected FacturaVencida(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    protected long calcularTotal() {
        return 0;
    }
}
