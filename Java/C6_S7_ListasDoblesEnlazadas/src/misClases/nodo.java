package misClases;

public class nodo {
    public int valor;
    nodo sgte;
    nodo anterior;
    public nodo(int valor){
        sgte=null;anterior=null;
        this.valor=valor;
    }
}
