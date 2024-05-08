package com.juan.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{

    public final int VLOR_DIA_VENCIDO = 10000;

    protected FacturaVencida(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    public int getDiasVencidos(){
        LocalDate diaDeHoy = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(fecha, diaDeHoy);
    }

    public long calcularVencimiento(){
        return (long) VLOR_DIA_VENCIDO * getDiasVencidos();
    }

    @Override
    protected long calcularTotal() {
        return valor += calcularVencimiento();
    }
}
