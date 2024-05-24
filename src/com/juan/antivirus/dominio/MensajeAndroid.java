package com.juan.antivirus.dominio;

import javax.swing.*;

public class MensajeAndroid implements Mensaje{

    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Android", JOptionPane.INFORMATION_MESSAGE);
    }
}
