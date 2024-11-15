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
            nodo.izquierdo=insertarRecursivo(nodo.izquierdo,valor); //entonces se vuelve a usar el metodo pero ahora para el nodo que estara en el lado izquierdo
            //esto provoca un que se realize el metodo de nodo en nodo hasta que encuentre que el nodo este vacio y si lo esta entonces crea ahi mismo un nuevo nodo que estara
            //en la izquierda ya que el valor es menor
        }else if(valor > nodo.valor ){ //si la raiz si tiene un valor y este es menor al valor por insertar
            nodo.derecho=insertarRecursivo(nodo.derecho,valor); //entonces se vuelve a usar el metodo pero ahora para el nodo que estara en el lado derecho
            //esto provoca un que se realize el metodo de nodo en nodo hasta que encuentre que el nodo este vacio y si lo esta entonces crea ahi mismo un nuevo nodo que estara
            //en la derecha ya que el valor
        }
        return nodo; //regresa la raiz ahora con el valor insertado
    }
    public void recorridoInorden(NodoBinario nodo){ //un recorrido InOrden es un metodo que recorre el arbol
        /*Este recorrido visita los nodos en un orden creciente si el árbol es un árbol binario de búsqueda (BST).
        Esta primero recorre el subárbol izquierdo(porque son los menores) luego la raiz de la que es hija y luego la derecha(que es la mayor a esa raiz) y asi consecutivamente hasta
        recorrer todo el arbola
        Orden: Izquierda(menor), raiz(medio) y Derecha(mayor)
         */
        if(nodo!=null) { //solo se realiza si el nodo no esta vacio, si lo esta no se hace nada y no se ejecuta
            recorridoInorden(nodo.izquierdo); // Llama recursivamente para recorrer todos los nodos del subárbol izquierdo hasta alcanzar un nodo nulo.
            System.out.print(nodo.valor+" "); //si se llega a ese nulo entonces se lo imprime su valor y un espacio para los siguientes
            recorridoInorden(nodo.derecho); //luego se busca
            /*no se puede pasar de izquierda hija a derecha hija ya que si esta en el nodo izquierdo final y se imprimio su valor este no tendra un nodo derecho(ya que es el ultimo)
            * por lo que el recorrido no se hace y se termina metodo del nodo izquierdo para retroceder a su raiz que ahora impreso el recorrido izquierdo imprime su valor
            * y ahora va a recorrer lo derecho terminando esto termina esa raiz y retrocede a la hora raiz para repetir el proceso*/
        }
    }
    //eliminación invocando a auxiliarrecursiva
    public void eliminar(int valor){
        raiz=eliminarRecursivo(raiz,valor); //al igual que al insertar la que hace el verdadero trabajo es el metodo eliminarRecursivo
    }
    private NodoBinario eliminarRecursivo(NodoBinario nodo, int valor){ //se añade el valor a eliminar
        if(nodo==null) return null; //si la raiz es nula entonces se retorna nulo igual
        if(valor < nodo.valor) //si el valor a eliminar es menor al de la raiz
            nodo.izquierdo=eliminarRecursivo(nodo.izquierdo,valor); //se realiza un recorrido al igual que al insertar, explorando todos los izquierdo si es que son menores
        else if(valor > nodo.valor ) //al derecho si el valor a eliminar es mayor
            nodo.derecho=eliminarRecursivo(nodo.derecho,valor);
        else{ //1. eliminar nodo hoja. Si el valor no es menor o mayor que el valor actual del nodo, entonces es igual a esta, por ende:
            if(nodo.izquierdo==null&&nodo.derecho==null) return null;  //si es que el nodo no tiene hijos(son nulos ambos lados) entonces retorna nulo
            //es nodo sin hijo por lo que simplemente se elimina su valor cambiandolo por nulo

            //2. eliminar nodo con UN SOLO hijo. Si es tiene SOLO un hijo entonces al eliminar esa raiz el hijo de este debe toma su lugar. Esta instrucción pasa cuando no se
            //cumple la anterior(osea que ambos no esten vacios)
            if(nodo.izquierdo==null) return nodo.derecho; //si es que el lado izquierdo esta vacio entonces el lado derecho debe tener un valor
            if(nodo.derecho==null) return nodo.izquierdo; //al contrario si no

            //3. eliminar nodo con AMBOS HIJOS. Si no se cumples las anteriores porque ambas tiene valores entonces sera un caso con raiz con dos hijos.
            //En este caso se ubica el nodoMenor y este sera el que reemplaza el nodo padre a elimianar
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