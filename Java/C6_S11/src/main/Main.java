package main;

import misClases.Cola;

public class Main {
    public static void main(String[] args) {
        Cola hola=new Cola();
        hola.insertar(12);
        hola.insertar(44);
        hola.insertar(4);
        hola.insertar(33);
        hola.insertar(32);
        hola.mostrar();
        hola.eliminar();
        hola.eliminar();
        hola.mostrar();
    }
}