package main;

import misClases.Pila;

public class Main {
    public static void main(String[] args) {
        Pila pipa=new Pila();
        pipa.insertar(12);
        pipa.insertar(65);
        pipa.insertar(5);
        pipa.insertar(4);
        pipa.insertar(33);
        pipa.insertar(56);
        pipa.mostrar();
        pipa.eliminar();
        pipa.eliminar();
        pipa.mostrar();
    }
}