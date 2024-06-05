package com.juan.clinica.dominio;

import com.juan.clinica.exceptions.InvalidAgeException;
import com.juan.clinica.exceptions.NoNameException;

import java.util.ArrayList;
import java.util.List;

public class Oftalmologo {
    //Atributos
    private String nombre;
    private static final int MAX_EDAD = 40;

    private List<Paciente> pacientes = new ArrayList<>();

    //Metodos
    public Paciente revisarPaciente(String nombre, int edad){
    /*Un paciente requiere operación si:
    - Su nombre contiene la letra "a" ignoreCase.
    - Y es apto si su edad es menor a 40 años.
    */
        //ERROR HANDLING
        if (nombre == null || nombre.isEmpty()){
            throw new NoNameException();
        }
        if (edad < 0){
            throw new InvalidAgeException(nombre);
        }
        //ERROR HANDLING

        Paciente nuevoPaciente;
        if (nombre.toLowerCase().contains("a")) {
            if(edad < MAX_EDAD){
                nuevoPaciente = new PacienteApto(nombre, edad);
            }else {
                nuevoPaciente = new PacienteNoApto(nombre, edad);
            }
            nuevoPaciente.necesitaCirugia = true;
        }else {
            nuevoPaciente = new PacienteNoApto(nombre, edad);
        }

        this.pacientes.add(nuevoPaciente);
        return nuevoPaciente;
    }

    public void operarPacientes(){
    //Recorrerá la lista de pacientes y llamará el método operar de los pacientes que deban ser intervenidos.
        try{
            getPacientesAOperar().forEach(pacienteApto -> pacienteApto.operar());
        }catch (Exception ex){
            System.err.println("Matamos un paciente... Oops... " + ex.getMessage());
        }

    }

    public List<PacienteApto> getPacientesAOperar(){
    /*Retornará los pacientes que sean aptos para cirugía y que no estén operados (necesitaCirugia = true).
      Para esto, se debe usar Java Streams y Lambdas.
    */
        try{
            return this.pacientes.stream().filter(paciente -> paciente.necesitaCirugia && paciente instanceof PacienteApto)
                    .map(PacienteApto.class::cast).toList();
        }catch (Exception ex){
            System.err.println("Error al obtener la lista de pacientes: " + ex.getMessage());
            return new ArrayList<>();
        }

    }
}
