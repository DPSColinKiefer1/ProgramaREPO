package misClases;

public class ArbolBinario {
    public NodoBinario raiz;
    public ArbolBinario(){
        raiz=null;
    }
    public void insertar(int valor){
        raiz=insertarRecursivo(raiz,valor);
    }
    private NodoBinario insertarRecursivo(NodoBinario nodo, int valor){
        if (nodo==null) return new NodoBinario(valor);
        if (valor<nodo.valor){
            nodo.izquierdo=insertarRecursivo(nodo.izquierdo,valor);
        }
        else if (valor>nodo.valor){
            nodo.derecho=insertarRecursivo(nodo.derecho,valor);
        }
        return nodo;
    }

}
