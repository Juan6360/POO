package com.juan.biblioteca.dominio;

import com.juan.biblioteca.exceptions.RecursoNoFotocopiableException;
import com.juan.biblioteca.exceptions.RecursoNoPrestableException;
import com.juan.biblioteca.exceptions.RecursoNoPrestadoException;
import com.juan.biblioteca.exceptions.RecursoPrestadoException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //Atributos
    private List<Recurso> recursos = new ArrayList<>();

    //Metodos
    public void agregarRecurso(Recurso r){
        /*
        - Incluye un nuevo recurso en la lista de recursos.
        - Se debe validar que no exista el recurso en la biblioteca.
         */

        if (!this.recursos.contains(r.nombre.toLowerCase())){
            this.recursos.add(r);
        }
    }

    private Recurso buscarRecurso(String codigo){
        for (Recurso r : this.recursos){
            if (r.codigo.equalsIgnoreCase(codigo)){
                return r;
            }
        }
        return null;
    }


    public boolean prestar(String codigo){
        /*
        - Retornará true si se pudo prestar
        - Lanzará una excepción si el recurso ya está prestado (RecursoPrestadoException)
        - O no es Prestable (RecursoNoPrestableException).
         */

        Recurso recurso = buscarRecurso(codigo);

        if (!recurso.prestado && recurso instanceof Libro){
            ((Libro) recurso).prestar();
        }else if (!recurso.prestado && recurso instanceof Revista){
            ((Revista) recurso).prestar();
        }else if (recurso instanceof Tesis){
            throw new RecursoNoPrestableException(recurso.nombre);
        }else{
            throw new RecursoPrestadoException(recurso.nombre);
        }


        return true;
    }

    public boolean devolver(String codigo){
        /*
        - Retornará true si se pudo devolver
        - O lanzará una excepción si el recurso no se encuentra prestado
        - O no es Prestable.
         */

        Recurso recurso = buscarRecurso(codigo);

        if (recurso.prestado && recurso instanceof Libro){
            ((Libro) recurso).devolver();
        }else if (recurso.prestado && recurso instanceof Revista){
            ((Revista) recurso).devolver();
        }else if (recurso instanceof Tesis){
            throw new RecursoNoPrestableException(recurso.nombre);
        }else{
            throw new RecursoPrestadoException(recurso.nombre);
        }


        return true;
    }

    public boolean fotocopiar(String codigo){
        /*
        - Lanzará una excepción (RecursoNoFotocopiableException) sí el recurso no es Copiable.
        - En otro caso retornará true.
        - Se debe validar además que no esté prestado antes de fotocopiarlo.
         */

        Recurso recurso = buscarRecurso(codigo);

        if (!recurso.prestado){
            if (recurso instanceof Tesis){
                ((Tesis) recurso).fotocopiar();
                return true;
            }else if (recurso instanceof Libro){
                ((Libro) recurso).fotocopiar();
                return true;
            }else if (recurso instanceof Revista){
                throw new RecursoNoFotocopiableException(recurso.nombre);
            }
        }else {
            throw new RecursoPrestadoException(recurso.nombre);
        }

        return false;
    }

    public void listarPrestados(){
        /*
        - Muestra en pantalla todos los recursos prestados que tiene la biblioteca.
         */

        List<Recurso> recursosPrestados = new ArrayList<>();
        for (Recurso r : this.recursos){
            if (r.prestado){
                recursosPrestados.add(r);
            }
        }

        recursosPrestados.forEach(r -> System.out.println(r.nombre + " se encuentra prestado."));
    }

    public void listarCopiasPorRecurso(){
        /*
        - No retornará nada. Solo permitirá imprimir el número de veces que se ha fotocopiado cada uno de los recursos
          que permiten hacerlo. Protip: Con cada caso debería imprimir algo como:
          “{nombre} se ha fotocopiado {copias} veces.” (“Ensayo sobre la ceguera se ha fotocopiado 6 veces”).
         */

        this.recursos.forEach(r -> System.out.println(r.nombre + " se ha fotocopiado " + r.nroCopias + " veces."));
    }
}
