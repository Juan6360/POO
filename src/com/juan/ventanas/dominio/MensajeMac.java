package com.juan.ventanas.dominio;

import javax.swing.*;

public class MensajeMac implements Mensaje {
    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mac", JOptionPane.INFORMATION_MESSAGE);
    }
}
