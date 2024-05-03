package com.juan.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIva extends Factura {
    protected FacturaSinIva(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    protected long calcularTotal() {
        return valor;
    }
}
