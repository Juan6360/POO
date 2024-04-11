package com.juan.banco.dominio;

public class CuentaBancaria {
    // Atributos
    public String numero;
    public Persona propietario;
    public double saldo;
    public double tasaInteres;
    public String tipo;
    public Banco banco;

    // Constructores
    public CuentaBancaria(String numero){
        this.numero=numero;
    }

    public CuentaBancaria(String numero, Persona propietario, Banco banco){

    }

    // Metodos
    // void se usa cuando no retorna nada (ver en starUML)
    public void consignar(int valorAConsignar){
        this.saldo = this.saldo + valorAConsignar;
    }

    public boolean retirar(int valorARetirar){
        if(valorARetirar <= this.saldo){
            this.saldo -= valorARetirar;
            // Se consigno bien
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transferir(int valorATransferir, CuentaBancaria otraCuenta){
        if(valorATransferir <= this.saldo){
            this.saldo -= valorATransferir;
            otraCuenta.consignar(valorATransferir);
            return true;
        }
        System.out.println("Saldo insuficiente para la transferencia!");
        return false;
    }

    public void mostrarSaldo(){
        System.out.println("El saldo es $" + this.saldo);
    }
}