package com.juan.tienda_bicicletas.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nomina {
    // Atributos
    private List<Empleado> empleados = new ArrayList<>();

    // Metodos
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public long calcularNomina(){
        long totalNomina = 0;
        for (Empleado e : this.empleados){
            totalNomina += e.calcularSalario();
        }
        return totalNomina;
    }

    public List<Empleado> listarDirectos(){
        return this.empleados.stream().filter(e -> e instanceof Directo).collect(Collectors.toList());
    }

    public List<Empleado> listarFreelancer(){
        return this.empleados.stream().filter(e -> e instanceof Freelancer).collect(Collectors.toList());
    }

    public List<Empleado> empleadosQueComisionan(){
        return this.empleados.stream().filter(e -> e instanceof Vendedor).collect(Collectors.toList());
    }

    public void comisiones(){
        List<Empleado> empleados = empleadosQueComisionan();
        for (Empleado e : empleados){
            System.out.println(e.getNombre());
            System.out.println("Comision: " + ((Vendedor) e).calcularComision());
        }
    }
}
