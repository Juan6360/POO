package com.juan.facturacion.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha) {
        Factura factura = null;

        if (valor < 1000000) {
            factura = new FacturaSinIva(valor, cliente, fecha);
        } else if (valor >= 1000000) {
            factura = new FacturaConIva(valor, cliente, fecha, 0.15);
        }

        this.facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public long getTotalFacturacion(){return 0;}

    public Factura getFacturaMasCara(){return null;}

    public List<Factura> getFacturasSinIva(){return null;}
}
