package com.juan.calculadora.dominio;

import java.util.List;

public class Calculadora {

    public static double sumar(List<Double> digitos) {
        double resultado = 0;

        for (double o : digitos) {
            resultado += o;
        }
        return resultado;
    }

    public static double promedio(List<Double> digitos, double resultado){
        return Math.round(resultado/ digitos.size());
    }

    public static double restar(List<Double> digitos) {
        double resultado = digitos.get(0);
        digitos.remove(resultado);

        for (double o : digitos) {
            resultado -= o;
        }
        return resultado;
    }

    public static double multiplicar(List<Double> digitos) {
        double resultado = digitos.get(0);
        digitos.remove(resultado);

        for (double o : digitos) {
            resultado *= o;
        }
        return resultado;
    }

    public static double dividir(List<Double> digitos, boolean redondear) {
        double resultado = digitos.get(0);
        digitos.remove(resultado);

        for (double o : digitos) {
            resultado /= o;
        }

        if (redondear) {
            return Math.round(resultado);
        }
        return resultado;
    }
}