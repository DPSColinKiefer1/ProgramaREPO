package Main;

import NodoDoble.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.añadir(12,"Juan");
        lista.añadir(13,"Luis");
        lista.añadir(11,"JUJA");
        lista.añadir(8,"Red");
        lista.añadir(5,"Dead");
        lista.eliminar(13);
        lista.mostrar();
        Lista lista2 = new Lista();
        lista2.añadir(11,"Juan");
        lista2.añadir(3,"Luis");
        lista2.añadir(1,"JUJA");
        lista2.añadir(65,"Red");
        lista2.añadir(3,"Dead");
        lista2.mostrar();
        lista.mescla(lista,lista2);
    }
}