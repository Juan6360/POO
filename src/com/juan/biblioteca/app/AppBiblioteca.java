package com.juan.biblioteca.app;

import com.juan.biblioteca.dominio.*;

public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Recurso libro = new Revista("123", "Hola", 0);

        biblioteca.agregarRecurso(libro);

        //biblioteca.fotocopiar("123");

        biblioteca.prestar("123");

        biblioteca.listarPrestados();

        //biblioteca.devolver("123");

        biblioteca.listarPrestados();

        biblioteca.listarCopiasPorRecurso();
    }
}
