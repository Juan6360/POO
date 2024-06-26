package com.juan.herencia.dominio;

public class Vehiculo {
    private String serial;
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(double incremento) {
        System.out.println("Acelerando vehiculo...");

        if (incremento > 0) {
            this.velocidad += incremento;
        }
    }

    public void frenar(double decremento) {
        System.out.println("Frenando vehiculo...");

        if (decremento > 0) {
            this.velocidad -= decremento;
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerial() {
        return serial;
    }
}
