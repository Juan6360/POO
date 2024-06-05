package com.juan.clinica.dominio;

public class PacienteApto extends Paciente implements Operable{
    public PacienteApto(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void operar() {this.necesitaCirugia = false;}
}
