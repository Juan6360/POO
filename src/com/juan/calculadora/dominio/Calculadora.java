package com.juan.calculadora.dominio;

public class Calculadora {

    public static double sumar(double a, double b){return a+b;}

    public static double restar(double a, double b){return a-b;}

    public static double multiplicar(double a, double b){return a*b;}

    public static double dividir(double a, double b, boolean redondear) {
        if (redondear) {
            return Math.round(a / b);
        }
        return a/b;
    }
}