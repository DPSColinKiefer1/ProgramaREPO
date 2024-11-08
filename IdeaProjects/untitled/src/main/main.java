package main;

import misClases.ArbolBinario;
import misClases.NodoBinario;

public class main {
    public static void main(String[] args) {
        ArbolBinario nodoDePreuba = new ArbolBinario();
        nodoDePreuba.insertar(12);
        nodoDePreuba.insertar(65);
        nodoDePreuba.insertar(323);
        nodoDePreuba.insertar(564);
        nodoDePreuba.insertar(10);
        nodoDePreuba.insertar(11);
        nodoDePreuba.insertar(2);
        recorridoInoden(nodoDePreuba.raiz);
        System.out.println();
        recorridoPreOrden(nodoDePreuba.raiz);
        System.out.println();
        recorridoPostOrden(nodoDePreuba.raiz);
    }
    public static void recorridoInoden(NodoBinario nodo){
        if (nodo!=null){
            recorridoInoden(nodo.izquierdo);
            System.out.printf(nodo.valor+" ");
            recorridoInoden(nodo.derecho);
        }
    }
    public static void recorridoPostOrden(NodoBinario nodo){
        if (nodo!=null){
            recorridoPostOrden(nodo.izquierdo);
            recorridoPostOrden(nodo.derecho);
            System.out.print(nodo.valor+" ");
        }
    }
    public static void recorridoPreOrden(NodoBinario nodo){
        if (nodo!=null){
            System.out.print(nodo.valor+" ");
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);
        }
    }
}
