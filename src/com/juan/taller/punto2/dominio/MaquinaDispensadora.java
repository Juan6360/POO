package com.juan.taller.punto2.dominio;

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
            System.out.println(" ");
        }
    }

    public Snack buscarSnackPorNombre(String nombre){
        Snack snackBuscado=null;

        for(int i=0; i<this.snacks.size(); i++){
            if(this.snacks.get(i).getNombre().equals(nombre)){
                snackBuscado = this.snacks.get(i);
                break;
            }
        }

        return snackBuscado;
    }

    public Snack buscarSnackPorCodigo(String codigo){
        Snack snackBuscado=null;

        for(int i=0; i<this.snacks.size(); i++){
            if(this.snacks.get(i).getCodigo().equals(codigo)){
                snackBuscado = this.snacks.get(i);
                break;
            }
        }

        return snackBuscado;
    }

    public void sacarSnackPorNombre(String nombre, int cantidadDeseada){
        Snack snackElegido=buscarSnackPorNombre(nombre);

        int viejaCantidad=snackElegido.getCantidad();

        snackElegido.setCantidad(viejaCantidad-cantidadDeseada);
    }

    public void sacarSnackPorCodigo(String codigo, int cantidadDeseada){
        Snack snackElegido = buscarSnackPorCodigo(codigo);

        int viejaCantidad=snackElegido.getCantidad();

        snackElegido.setCantidad(viejaCantidad-cantidadDeseada);
    }

    public void aumentarSnackPorCodigo(String codigo, int cantidadAAumentar){
        Snack snackElegido = buscarSnackPorCodigo(codigo);

        int viejaCantidad=snackElegido.getCantidad();

        snackElegido.setCantidad(viejaCantidad+cantidadAAumentar);
    }

    public Snack unidadesDeSnack(String nombre, String codigo){
        return null;
    }

    public List<Snack> snacksAgotados(){
        return null;
    }

    public List<Snack> snacksEnStock(){

        return snacks.stream().filter(snack -> snack.getCantidad() > 0).toList();
    }

    public void imprimirSnacksEnStock(){
        List<Snack> listaStock=snacksEnStock();
        listaStock.forEach(snack -> System.out.println(snack.getNombre() + '\n' +
                                                        snack.getCodigo() + '\n' +
                                                        snack.getPrecio() + '\n' +
                                                        snack.getCantidad() + '\n'));
    }

    public List<Snack> ordenarSnacksDescend(){
        return null;
    }

    public List<Snack> ordenarSnacksAscend(){
        return null;
    }
}
