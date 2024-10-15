package NodoDoble;

public class Nodos {
    Libros dato;
    Nodos siguiente;
    Nodos anterior;
    public Nodos(int codigo, String nombre){
        dato=new Libros(codigo,nombre);
        siguiente=null;
        anterior=null;
    }
}

