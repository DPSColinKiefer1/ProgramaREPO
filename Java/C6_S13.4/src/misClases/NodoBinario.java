package misClases;
public class NodoBinario { //se crea un Nodo que sera el valor que vinculado a otro nodos para darle esa idea de interelación
    //un ArbolBinario son basicamente nodos o listas enlazadas cuya unica particularidad es el hecho de que en vez de ir de inicio a fin o siguiente, van di izquierda
    //a derechar sin tener atributos de retorno como una lista enlazada
    public int valor; //los nodos de este arbol tendra de datos de enteros
    NodoBinario izquierdo; //el que se usara para vincular a otros nodos
    NodoBinario derecho; //el que se usara para vincular a otros nodos
    public NodoBinario(int valor) { //constructor
        this.valor = valor;
        izquierdo = null; //el valor sera igual al introducido y si es recien creado pues no tendra nodos vinculados en ningun lado
        derecho = null;
    }
}