package com.juan.ventanas.dominio;

import javax.swing.*;

public class MensajeWindows implements Mensaje {
    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Windows", JOptionPane.INFORMATION_MESSAGE);
    }
}
