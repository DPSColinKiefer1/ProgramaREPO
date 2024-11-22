package main;
import misClases.ArbolBinario;
public class main {
    public static void main(String[] args) {
        ArbolBinario arbol=new ArbolBinario();
        arbol.insertar(50);arbol.insertar(30);
        arbol.insertar(70);arbol.insertar(20);
        arbol.insertar(40);arbol.insertar(60);
        arbol.insertar(80);arbol.insertar(10);
        arbol.insertar(29);
        arbol.eliminar(50);
        arbol.recorridoInorden(arbol.raiz);
        System.out.println();
        System.out.println(arbol.contarNodos());
        System.out.println(arbol.sumarValores());
        System.out.println(arbol.calcularProfundidad());
        System.out.println(arbol.contarHojas());
        arbol.recorridoPorAmplitud();
    }
}