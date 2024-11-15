package misClases;
public class ArbolBinario {
    public NodoBinario raiz;//la raiz como tal sera un nodo
    public ArbolBinario() { //al crear un Arbol esta sera vacia
        raiz=null;
    }
    //inserción invocando a auxiliarrecursiva
    public void insertar(int valor){ //metodo para insertar, para ello sera necesario un valor que se insertara
        raiz=insertarRecursivo(raiz,valor);
    }
    private NodoBinario insertarRecursivo(NodoBinario nodo, int valor){ //este devuelve un nodo(raiz) que sera el que reemplazara a la raiz del objeto
        if(nodo==null) return new NodoBinario(valor); //si el nodo(raiz) esta vacio entonces lo reemplaza por un nodo recien creado con el valor del parametro
        if(valor < nodo.valor){ //si la raiz si tiene un valor y este es mayor al valor por insertar
            nodo.izquierdo=insertarRecursivo(nodo.izquierdo,valor); //entonces 
        }else if(valor > nodo.valor ){
            nodo.derecho=insertarRecursivo(nodo.derecho,valor);
        }
        return nodo;
    }
    public void recorridoInorden(NodoBinario nodo){
        if(nodo!=null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor+" ");
            recorridoInorden(nodo.derecho);
        }
    }
    //eliminación invocando a auxiliarrecursiva
    public void eliminar(int valor){
        raiz=eliminarRecursivo(raiz,valor);
    }
    private NodoBinario eliminarRecursivo(
            NodoBinario nodo, int valor){
        if(nodo==null) return null;
        if(valor < nodo.valor)
            nodo.izquierdo=eliminarRecursivo(nodo.izquierdo,valor);
        else if(valor > nodo.valor )
            nodo.derecho=eliminarRecursivo(nodo.derecho,valor);
        else{ //1. eliminar nodo hoja
            if(nodo.izquierdo==null&&nodo.derecho==null) return null;
            //2. eliminar nodo con UN SOLO hijo
            if(nodo.izquierdo==null) return nodo.derecho;
            if(nodo.derecho==null) return nodo.izquierdo;
            //3. eliminar nodo con AMBOS HIJOS
            NodoBinario sucesor=encontrarMenor(nodo.derecho);
            nodo.valor=sucesor.valor;
            nodo.derecho=eliminarRecursivo(nodo.derecho,sucesor.valor);
        }
        return nodo;
    }
    private NodoBinario encontrarMenor(NodoBinario nodo){
        while(nodo.izquierdo!=null)
            nodo=nodo.izquierdo;
        return nodo;
    }
    private NodoBinario encontrarMayor(NodoBinario nodo){
        while(nodo.derecho!=null)
            nodo=nodo.derecho;
        return nodo;
    }
    public void eliminar2(int valor){
        raiz=eliminarRecursivo2(raiz,valor);
    }
    private NodoBinario eliminarRecursivo2(
            NodoBinario nodo, int valor){
        if(nodo==null) return null;
        if(valor < nodo.valor)
            nodo.izquierdo=eliminarRecursivo(nodo.izquierdo,valor);
        else if(valor > nodo.valor )
            nodo.derecho=eliminarRecursivo(nodo.derecho,valor);
        else{ //1. eliminar nodo hoja
            if(nodo.izquierdo==null&&nodo.derecho==null) return null;
            //2. eliminar nodo con UN SOLO hijo
            if(nodo.izquierdo==null) return nodo.derecho;
            if(nodo.derecho==null) return nodo.izquierdo;
            //3. eliminar nodo con AMBOS HIJOS
            NodoBinario sucesor=encontrarMenor(nodo.derecho);
            nodo.valor=sucesor.valor;
            nodo.derecho=eliminarRecursivo(nodo.derecho,sucesor.valor);
        }
        return nodo;
    }
}
