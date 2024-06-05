package com.juan.clinica.app;

import com.juan.clinica.dominio.Oftalmologo;

public class Clinica {
    public static void main(String[] args) {
        Oftalmologo oftalmologo = new Oftalmologo();

        oftalmologo.revisarPaciente("Clarita",20);
        oftalmologo.revisarPaciente("Estiben",20);
        oftalmologo.revisarPaciente("Tomas",70);
        oftalmologo.revisarPaciente("Carlos",1);
        System.out.println(oftalmologo.getPacientesAOperar());
        oftalmologo.operarPacientes();
        System.out.println(oftalmologo.getPacientesAOperar());
    }
}
