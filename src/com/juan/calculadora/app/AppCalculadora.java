package com.juan.calculadora.app;

import com.juan.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {

    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;

    public static void main(String[] args) {

        while(true){

            JCheckBox checkBox = new JCheckBox("Redondear");

            Object[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir", checkBox};

            int opcionElegida = JOptionPane.showOptionDialog(null, "Selecciona una operación", "POO - Calculadora", 0, JOptionPane.PLAIN_MESSAGE,
                                                    null, opciones, null);

            boolean redondear = checkBox.isSelected();


            if (opcionElegida == JOptionPane.CLOSED_OPTION){
                System.exit(0);
            }

            String usuario =JOptionPane.showInputDialog("Ingrese su operación: ");

            double resultado = 0;

            switch (opcionElegida){

                case SUMAR:
                    resultado = Calculadora.sumar(listarDigitos(separacionInput(usuario,"\\+")));
                    break;

                case RESTAR:
                    resultado = Calculadora.restar(listarDigitos(separacionInput(usuario,"\\-")));
                    break;

                case MULTIPLICAR:
                    resultado = Calculadora.multiplicar(listarDigitos(separacionInput(usuario,"\\*")));
                    break;

                case DIVIDIR:
                    resultado = Calculadora.dividir(listarDigitos(separacionInput(usuario,"\\/")), redondear);
                    break;
            }

            mostrarMensaje("El resultado es: " + resultado);
        }
    }

    private static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "POO - Calculadora", JOptionPane.PLAIN_MESSAGE);
    }

    private static List<Double> listarDigitos(String[] separacionInput){
        List<Double> digitos = new ArrayList<>();

        for (String s: separacionInput){
            double d = Double.parseDouble(s);
            digitos.add(d);
        }return digitos;
    }

    private static String[] separacionInput(String operacion, String operador){
        return operacion.split(operador);
    }
}