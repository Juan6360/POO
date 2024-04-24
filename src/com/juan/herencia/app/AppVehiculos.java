package com.juan.herencia.app;

import com.juan.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo = new Vehiculo();
        Vehiculo cc = new Carro();
        Taxi taxi = new Taxi();
        BiciRuta biciRuta = new BiciRuta();
        Vehiculo bici = new Bicicleta();

        vehiculos.add(vehiculo);
        vehiculos.add(cc);
        vehiculos.add(taxi);
        vehiculos.add(biciRuta);
        vehiculos.add(bici);

        acelerarVehiculos(vehiculos);
    }

    private static void acelerarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) {
                System.out.println("Soy un carro");
            } else if (vehiculo instanceof Bicicleta) {
                System.out.println("Soy una bicicleta");
            }

            vehiculo.acelerar(new Random().nextInt(100));
            System.out.println("El " + vehiculo + " va a " + vehiculo.getVelocidad() + " km/h");
        }
    }
}
