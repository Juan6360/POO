package com.juan.facturacion.app;

import com.alejandro.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFac {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Alfredo", 950000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Alejandro", 3_160_000, LocalDate.of(2024, 5, 1));
    }
}