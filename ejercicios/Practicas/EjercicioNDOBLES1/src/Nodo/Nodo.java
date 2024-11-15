package Nodo;

public class Nodo {
    Nodo anterior, siguiente;
    int dato;

    public Nodo(int dato) {
        this.anterior = null;
        this.siguiente = null;
        this.dato = dato;
    }
}
