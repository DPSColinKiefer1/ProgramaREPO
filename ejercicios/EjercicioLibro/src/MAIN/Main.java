package MAIN;

import misClases.Listaprueba;
import misClases.Nodo;

public class Main {
    public static void main(String[] args) {
        Listaprueba lista1 = new Listaprueba();
        lista1.insertarOrdenado(123);
        lista1.insertarOrdenado(154);
        lista1.insertarOrdenado(13);
        lista1.insertarOrdenado(7);
        lista1.mostrar();
        Listaprueba lista2 = new Listaprueba();
        lista2.insertarOrdenado(153);
        lista2.insertarOrdenado(14);
        lista2.insertarOrdenado(3);
        lista2.insertarOrdenado(71);
        System.out.println("-------");
        lista2.mostrar();
        System.out.println("-------");
        Listaprueba lista = mezcla(lista1,lista2);
        lista.buscarLibro(153);
        lista.insertarOrdenado(153);
        lista.insertarOrdenado(3);
        lista.insertarOrdenado(71);
        lista.insertarOrdenado(14);
        lista.mostrar();
        lista.encontrarCentro();
        lista.invertirLista();
    }
    public static Listaprueba mezcla(Listaprueba list1, Listaprueba list2){
        Nodo lista1=list1.inicio;
        Nodo lista2=list2.inicio;
        if (lista1==null && lista2==null){
            System.out.println("No existen datos a mezclar");
        }
        Listaprueba listaMezcla = new Listaprueba();
        while (lista1!=null && lista2!=null){
            if (lista1.dato<lista2.dato){
                listaMezcla.insertar(lista1.dato);
                lista1=lista1.siguiente;
            }else {
                listaMezcla.insertar(lista2.dato);
                lista2=lista2.siguiente;
            }
        }
        return listaMezcla;
    }
}