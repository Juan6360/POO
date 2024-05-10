package com.juan.tienda_bicicletas.app;

import com.juan.tienda_bicicletas.dominio.*;

public class AppNomina {
    public static void main(String[] args){
        Nomina nomina = new Nomina();

        Empleado empleado1 = new Directo("Juan", 4840000);
        Empleado empleado2 = new Vendedor("Julian", 2050000, 45510000);
        Empleado empleado3 = new Freelancer("Johanna", 71000, 89);
        Empleado empleado4 = new Vendedor("Claudia", 1380000, 35989000);
        Empleado empleado5 = new Directo("David", 3975000);
        Empleado empleado6 = new Freelancer("Gustavo", 42500, 65);
        Empleado empleado7 = new Promotor("Gustavo", 2350, 190, 85);

        // Adición de los empleados a la lista
        nomina.agregarEmpleado(empleado1);
        nomina.agregarEmpleado(empleado2);
        nomina.agregarEmpleado(empleado3);
        nomina.agregarEmpleado(empleado4);
        nomina.agregarEmpleado(empleado5);
        nomina.agregarEmpleado(empleado6);
        nomina.agregarEmpleado(empleado7);

        // Listado de empleados Directos
        System.out.println(nomina.listarDirectos());

        // Listado de empleados Freelance
        System.out.println(nomina.listarFreelancer());

        // Total Nomina
        System.out.println(nomina.calcularNomina());

        // Comisiones de los empleaddo
        nomina.comisiones();

        // Listado Promotores
        System.out.println(nomina.listarPromotores());
    }
}
