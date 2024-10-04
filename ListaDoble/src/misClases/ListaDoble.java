package misClases;

public class ListaDoble {
    Nodo inicio; Nodo finals;
    public ListaDoble(){
        inicio=null;
        finals =null;
    }
    public void insertarInicio(int valor){
        Nodo nodoInsertar = new Nodo(valor);
        if (inicio==null){
            inicio=nodoInsertar;
            finals =nodoInsertar;
        } else {
            inicio.anterior=nodoInsertar;
            nodoInsertar.siguiente=inicio;
            inicio=nodoInsertar;
        }
    }
    public void mostrar(){
        Nodo actual = inicio;
        while (actual!=null){
            System.out.print(actual.dato+"\t");
            actual=actual.siguiente;
        }
        System.out.println();
    }
    public void insertarFinal(int dato){
        Nodo nodInsertar = new Nodo(dato);
        if (inicio==null){
            inicio=nodInsertar;
            finals =nodInsertar;
        } else {
            finals.siguiente=nodInsertar;
            nodInsertar.anterior=finals;
            finals=nodInsertar;
        }
    }
    public void insertarXposicion(int posicion, int valor){
        Nodo nodoInsertar = new Nodo(valor);
        int contador = 0;
        if (inicio==null){
            System.out.println("Error al insertar: Falta valores");
            return;
        }
        if (posicion==0){
            nodoInsertar.siguiente=inicio;
            inicio=nodoInsertar;
            return;
        }
        Nodo actual = inicio;
        Nodo ante = null;
        while (actual!=null && contador<posicion){
            ante = actual;
            actual=actual.siguiente;
            contador++;
        }
        if (actual==null){
            System.out.println("Error al insertar: Falta valores");
        }else {
            nodoInsertar.siguiente=actual;
            nodoInsertar.anterior=ante;
            ante.siguiente=nodoInsertar;
        }
    }
    public void mostrarReversa(){
        ListaDoble prueba =new ListaDoble();
        Nodo actual = inicio;
        int valor;
        if (inicio==null) System.out.println("Nada que revertir");
        else {
            while (actual!=null){
                valor=actual.dato;
                prueba.insertarInicio(valor);
                actual=actual.siguiente;
            }
        }
        prueba.mostrar();
    }
}
