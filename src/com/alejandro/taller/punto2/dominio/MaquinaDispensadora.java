package com.alejandro.taller.punto2.dominio;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDispensadora {

    //Atributos
    public static final int CAPACIDAD = 12; //Valor constante de la capacidad de la maquina dispensadora
    private List<Snack> snacks; //Lista de tipo Snack que almacena los snacks

    //Constructor
    public MaquinaDispensadora(){ this.snacks = new ArrayList<>(); } //Inicializa el atributo snacks cuando una nueva instancia de la clase es creada

    //Metodos

    //Funcion encargada de crear snacks
    public void agregarUnSnack(String nombre, String codigo, int precio, int cantidad){
        Snack nuevoSnack = new Snack(nombre, codigo, precio, cantidad); //Creacion de un nuevo snack en la variable nuevoSnack

        //Revisa si la capacida de la maquina esta en su limite
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
