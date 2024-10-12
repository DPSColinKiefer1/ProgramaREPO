package misClases;
public class ListaDobleEnlazada {
    Nodo inicio,fin;
    public ListaDobleEnlazada() {
        inicio=null;fin=null;
    }
    public void insertaFinal(int valor){
        Nodo nuevoNodo=new Nodo(valor);
         if(inicio==null){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
             fin.siguiente=nuevoNodo;
             nuevoNodo.anterior=fin;
             fin=nuevoNodo;
         }
    }
    public void insertaInicio(int valor){
        Nodo nuevoNodo=new Nodo(valor);
        if(inicio==null){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            inicio.anterior=nuevoNodo;
            nuevoNodo.siguiente=inicio;
            inicio=nuevoNodo;
        }
    }
    public void mostrar(){
        Nodo actual=inicio;
        while(actual != null){
            System.out.print(actual.dato+" ");
            actual=actual.siguiente;
        }
        System.out.println();
    }
}
