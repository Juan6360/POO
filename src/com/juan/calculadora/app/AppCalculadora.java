package com.juan.calculadora.app;

import com.juan.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;

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

            double numero1 =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 1:"));
            double numero2 =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 2:"));
            double resultado = 0;

            switch (opcionElegida){

                case SUMAR:
                    resultado = Calculadora.sumar(numero1, numero2);
                    break;

                case RESTAR:
                    resultado = Calculadora.restar(numero1, numero2);
                    break;

                case MULTIPLICAR:
                    resultado = Calculadora.multiplicar(numero1, numero2);
                    break;

                case DIVIDIR:
                    resultado = Calculadora.dividir(numero1, numero2, redondear);
                    break;
            }

            mostrarMensaje("El resultado es: " + resultado);
        }
    }

    private static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "POO - Calculadora", JOptionPane.PLAIN_MESSAGE);
    }
}
