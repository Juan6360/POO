package com.alejandro.taller.punto2.dominio;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDispensadora {

    public static final int CAPACIDAD = 12;
    private List<Snack> snacks;

    public MaquinaDispensadora(){ this.snacks = new ArrayList<>(); }

    public void agregarUnSnack(String nombre, String codigo, int precio, int cantidad){
        Snack nuevoSnack = new Snack(nombre, codigo, precio, cantidad);

        if(this.snacks.size() < CAPACIDAD){
            this.snacks.add(nuevoSnack);
        } else {
            System.out.println("Maquina llena.");
        }
    }

    public Snack sacarSnackPorNombre(String nombre, int cantidad){
        return null;
    }

    public Snack agregarSnackPorCodigo(String codigo, int cantidad){
        return null;
    }

    public Snack unidadesDeSnack(String nombre, String codigo){
        return null;
    }

    public List<Snack> snacksAgotados(){
        return null;
    }

    public List<Snack> snacksEnStock(){
        return null;
    }

    public List<Snack> ordenarSnacksDescend(){
        return null;
    }

    public List<Snack> ordenarSnacksAscend(){
        return null;
    }
}
