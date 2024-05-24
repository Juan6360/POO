package com.juan.ventanas.app;

import com.juan.ventanas.dominio.SistemaOperativoNoSoportadoException;
import com.juan.ventanas.dominio.Ventana;

public class AppVentana {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();

        try {
            ventana.mostrarMensaje("Hola mundo! 🐰");
        } catch (SistemaOperativoNoSoportadoException ex) {
            System.out.println("ERROR-> " + ex.getMessage());
        } finally {
            System.out.println("Pasó el huracán...");
        }
    }
}
