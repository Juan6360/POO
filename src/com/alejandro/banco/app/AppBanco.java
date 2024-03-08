package com.alejandro.banco.app;

import com.alejandro.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        // Creacion de un objeto
        CuentaBancaria miCuenta = new CuentaBancaria("1234-45");
        CuentaBancaria vanessaCuenta = new CuentaBancaria("12345");

        System.out.println("Numero de cuenta: " + miCuenta.numero);

        /*miCuenta.consignar(1000000);
        miCuenta.mostrarSaldo();
        miCuenta.retirar(10000);
        miCuenta.mostrarSaldo();
        miCuenta.transferir(500000, vanessaCuenta);
        miCuenta.mostrarSaldo();
        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();*/
    }
}
