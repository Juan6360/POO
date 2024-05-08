package com.juan.facturacion.app;

import com.juan.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFac {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Alfredo", 950000, LocalDate.of(2024, 5, 8));
        facturacion.generarFactura("Roberto", 950000, LocalDate.of(2024, 5, 8));
        facturacion.generarFactura("Alejandro", 3160000, LocalDate.of(2024, 5, 8));
        facturacion.generarFactura("Carlos", 316000, LocalDate.of(2024, 5, 8));
        facturacion.generarFactura("Estiven", 316000, LocalDate.of(2024, 5, 1));

        System.out.println(facturacion.getTotalFacturacion("Alejandro"));
        System.out.println(facturacion.getTotalFacturacion("Alfredo"));
        facturacion.impresionFactura(facturacion.getFacturaMasCara());
        System.out.println(facturacion.getFacturasSinIva());
        System.out.println(facturacion.getTotalFacturacion("Carlos"));
        System.out.println(facturacion.getTotalFacturacion("Estiven"));
    }
}