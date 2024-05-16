package com.juan.antivirus.dominio;

public class DocumentoPDF extends Documento {
    public DocumentoPDF(String nombre) {
        super(nombre);
    }

    @Override
    public boolean tieneVirus() {
        return !nombre.endsWith(".pdf");
    }
}
