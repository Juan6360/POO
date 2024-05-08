package com.juan.facturacion.dominio;

import java.time.LocalDate;
import java.util.*;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha) {
        Factura factura = null;

        if (valor < 100000 & Objects.equals(fecha, LocalDate.now())) {
            factura = new FacturaSinIva(valor, cliente, fecha);
        } else if (valor >= 1000000 & Objects.equals(fecha, LocalDate.now())) {
            factura = new FacturaConIva(valor, cliente, fecha, 0.15);
        }else if (valor >= 300000 & Objects.equals(fecha, LocalDate.now())){
            factura = new FacturaConDescuento(valor, cliente, fecha, 0.5);
        }else if (!Objects.equals(fecha, LocalDate.now())){
            factura = new FacturaVencida(valor, cliente, fecha);
        }

        this.facturas.add(factura);
    }

    public void impresionFactura(Factura factura) {
        System.out.println("Factura de " + factura.cliente);
        System.out.println(factura.valor);
        System.out.println(factura.fecha);
    }

    public long getTotalFacturacion(String cliente){

        for (Factura f : this.facturas){
            if (f.cliente == cliente){
                return f.calcularTotal();
            }
        }
        System.out.println("No existe una factura con el nombre " + cliente);
        return 0;
    }

    public Factura getFacturaMasCara(){
        Optional<Factura> facturaRequerida = this.facturas.stream().max(Comparator.comparing(Factura::getValor));

        return facturaRequerida.orElse(null);
    }

    public List<Factura> getFacturasSinIva(){
        List<Factura> facturasSinIva = new ArrayList<>();

        for (Factura f : this.facturas){
            if (f instanceof FacturaSinIva){
                facturasSinIva.add(f);
            }
        }
        return facturasSinIva;
     }
}
