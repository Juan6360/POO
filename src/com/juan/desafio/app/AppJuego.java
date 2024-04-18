package com.juan.desafio.app;

import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    public static final String TITULO = "Piedra Papel Tijera";
    public static final int JUGAR = 1;
    public static final int INSTRUCCIONES = 0;
    public static final int HISTORIAL = 2;
    public static final ImageIcon CONFETTI = new ImageIcon("confetti.png");
    public static final ImageIcon MENU = new ImageIcon("menu.png");

    public static void main(String[] args) {
        mostrarMensaje("Bienvenido");
        while (true) {
            int opcion = menu();

            switch (opcion) {
                case JUGAR:
                    mostrarMensaje("Eligio jugar");
                    break;

                case INSTRUCCIONES:
                    mostrarMensaje("Eligio instrucciones");
                    break;

                case HISTORIAL:
                    mostrarMensaje("Eligio historial");
                    break;

                case JOptionPane.CLOSED_OPTION:
                    System.exit(0);
            }
        }
    }

    //Metodos

    private static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, TITULO, 0, CONFETTI);
    }

    private static int menu(){
        return JOptionPane.showOptionDialog(null, "Selecciona una opción", TITULO
                                                    , 0, 0, MENU
                                                    , Arrays.asList("Instrucciones", "Jugar", "Historial").toArray()
                                                    , null);
    }
}
