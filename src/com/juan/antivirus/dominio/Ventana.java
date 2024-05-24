package com.juan.antivirus.dominio;

public class Ventana {

    public void mostrarMensaje_Movil(App os, String mensaje){

        Mensaje msj = null;

        if (os instanceof Android && os.getNombre().contains("playstore")){
            msj = new MensajeAndroid();
        } else if (os instanceof Ios && os.getNombre().contains("appstore")) {
            msj = new MensajeIos();
        } else {
            throw new NonCompOS();
        }

        msj.mostrar(mensaje);
    }
}
