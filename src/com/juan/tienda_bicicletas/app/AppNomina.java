package com.juan.tienda_bicicletas.app;

import com.juan.tienda_bicicletas.dominio.Directo;
import com.juan.tienda_bicicletas.dominio.Empleado;
import com.juan.tienda_bicicletas.dominio.Nomina;
import com.juan.tienda_bicicletas.dominio.Vendedor;

public class AppNomina {
    public static void main(String[] args){
        Nomina nomina = new Nomina();

        Empleado empleado1 = new Directo("Juan", 4840000);
        Empleado empleado2 = new Vendedor("Julian", 2050000, );
    }
}
