package com.juan.antivirus.dominio;

public class DocumentoWord extends Documento {
    public DocumentoWord(String nombre) {
        super(nombre);
    }

    @Override
    public boolean tieneVirus() {
        return nombre.contains("🦠");
    }
}
