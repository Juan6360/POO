package com.juan.antivirus.dominio;

import javax.swing.*;

public class MensajeIos implements Mensaje{

    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Ios", JOptionPane.INFORMATION_MESSAGE);
    }
}
