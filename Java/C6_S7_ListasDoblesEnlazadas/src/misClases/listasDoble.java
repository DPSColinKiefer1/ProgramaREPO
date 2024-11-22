package misClases;

public class listasDoble {
    public nodo inicio;
    public nodo end;
    public listasDoble(){
        inicio=null; end =null;
    }
    public void addFirst(int valor){
        nodo nodoAgregar=new nodo(valor);
        if (inicio==null){
            inicio=nodoAgregar;
            end=nodoAgregar;
        }
        else {
            inicio.anterior=nodoAgregar;
            nodoAgregar.sgte=inicio;
            inicio=nodoAgregar;
        }
    }
    public void addLast(int valor){
        nodo nodoAgregar=new nodo(valor);
        if (inicio==null) inicio=nodoAgregar;
        else {
            nodo current=inicio;
            nodo anterior=null;
            while (current!=null){
                anterior=current;
                current=current.sgte;
            }
            nodoAgregar.anterior=anterior;
            end =nodoAgregar;
            anterior.sgte=nodoAgregar;
        }
    }
    public void addInOrderASC(int valor){
        nodo nodogra=new nodo(valor);
        if (inicio==null){
            inicio=nodogra;
            return;
        }
        if (inicio.valor>valor){
            nodogra.sgte=inicio;
            inicio.anterior=nodogra;
            inicio=nodogra;
            return;
        }
        nodo current=inicio;
        nodo before=null;
        while (current!=null && current.valor<=valor){
            before=current;
            current=current.sgte;
        }
        if (current==null){
            nodogra.anterior=before;
            before.sgte=nodogra;
            end = nodogra;
            return;
        }
        nodogra.sgte=current;
        current.anterior=nodogra;
        before.sgte=nodogra;
    }
    public void addInOrderDESC(int valor){
        nodo agregar=new nodo(valor);
        if (inicio==null){
            inicio=agregar;
            return;
        }
        if (inicio.valor<=valor){
            inicio.anterior=agregar;
            agregar.sgte=inicio;
            inicio=agregar;
            return;
        }
        nodo actual=inicio;
        nodo anterior=null;
        while (actual!=null && actual.valor>=valor){
            anterior=actual;
            actual=actual.sgte;
        }
        if (actual==null){
            agregar.anterior=anterior;
            end=agregar;
            anterior.sgte=end;
        }else {
            agregar.sgte=actual;
            agregar.anterior=anterior;
            actual.anterior=agregar;
            anterior.sgte=agregar;
        }
    }
    public void addByPosition(int value, int position){
        if (inicio==null && position!=1){
            System.out.println("posición no valida, lista vacia");
            return;
        }
        nodo agregar=new nodo(value);
        if (inicio==null && position==1){
            inicio=agregar;
            return;
        }
        if (inicio!=null && position==1){
            inicio.anterior=agregar;
            agregar.sgte=inicio;
            inicio=agregar;
            return;
        }
        nodo actual=inicio;
        nodo anterior=null;
        int contador=1;
        while (actual!=null && contador!=position){
            anterior=actual;
            actual=actual.sgte;
            contador++;
        }
        if (actual==null){
            System.out.println("Posición no encontrada");
            return;
        }
            agregar.anterior=anterior;
            agregar.sgte=actual;
            actual.anterior=agregar;
            anterior.sgte=agregar;
            return;

    }
    public void removeFirst(){
        if (inicio==null) System.out.println("Nada que eliminar");
        else {
            inicio=inicio.sgte;
        }
    }
    public void removeLast(){
        if (inicio==null) System.out.println("Nada que eliminar");
        else if (inicio.valor==end.valor) {
            inicio=end=null;
        } else {
            end=end.anterior;
            end.sgte=null;
        }
    }
//            removeAtPosition(int pos): Elimina el nodo en una posición específica.
    public void removeAtPosition(int pos){
        if (inicio==null) System.out.println("nothing to remove");
        else if (pos==1){
            inicio=inicio.sgte;
        } else {
            int contador=1;
            nodo current=inicio;
            nodo before=null;
            while(current!=null && contador!=pos){
                before=current;
                current=current.sgte;
                contador++;
            }
            if (current==null) System.out.println("No se encontro la posición");
            else if (current== end){
                System.out.println("Se a eliminado el valor final de la lista");
                end=end.anterior;
                end.sgte=null;
            } else {
                current=current.sgte;
                current.anterior=before;
                before.sgte=current;
            }
        }
    }
//            removeByValue(int valor): Busca y elimina el primer nodo con el valor indicado.
    public void removeByValue(int valor){
        if (inicio==null){
            System.out.println("No hay valores donde eleminar");
            return;
        }
        if (inicio.valor==valor){
            inicio=inicio.sgte;
            return;
        }
        nodo current=inicio;
        nodo before=null;
        while (current!=null && current.valor!=valor){
            before=current;
            current=current.sgte;
        }
        if (current==null){
            System.out.println("No se encontro el valor");
            return;
        }
        if (current==end){
            end=end.anterior;
            end.sgte=null;
        }
        current=current.sgte;
        current.anterior=before;
        before.sgte=current;
    }
//    removeDuplicates(): Elimina nodos con valores duplicados.
    public void removeDuplicates(){
        if (inicio==null){
            System.out.println("Lista vacia"); //si la lista esta vacia
            return;
        }
        nodo current=inicio; //crea un nodo que sirve de indice para el primer valor
        while(current!=null){ //se recorre tomando en cuenta ese primer valor
            nodo comparer=current.sgte; //se crea otro nodo pero que servira para como un indice que recorrira los nodos siguientes en busca de un nodo con valor similar
            while (comparer!=null){ //aca comienza a recorrer los valores de los nodos siguientes al actual para comparar valores
                if (current.valor==comparer.valor){ //aca se abra encontrado el nodo duplicado
                    nodo duplicate=comparer; //se crea otro nodo ahora para saber cual duplicado es y almacenarlo, sirve como indice ya que no se puede usar a comparer
                    //ya que es el que recorre
                    comparer=comparer.sgte; // pasa al siguiente valor para comparar
                    if (duplicate==end){ //si es que el duplicado es el nodo final
                        end=duplicate.anterior; //entonces este se elimina usando su valor anterior
                        end.sgte=null; //y lo eliminar poniendolo = a null
                    } else {//si el duplicado es un nodo del medio
                        duplicate.anterior.sgte=duplicate.sgte; //el valor siguiente del anterior del nodo duplicado(osea, donde deberia estar el duplicadoxd) pasa a
                        //ser el nodo siguiente a este, osea, se lo elimina para que el siguiente al anterior del duplicado sea el siguiente de este, desvinculandolo
                        if (duplicate.sgte!=null){ //si es que el nodo siguiente(el valor duplicate" sigue siendo el nodo duplicado solo que fue reemplzado
                            // por el sgte") que sera el que reemplaze el nodo duplicado no es nulo(osea que el duplicado no es ultimo) entonces
                            duplicate.sgte.anterior=duplicate.anterior; //el anterior al nodo a reemplazar sera el nodo anterior al duplicado, interalacionando ambos
                            //vecinos y eliminando el duplicados
                        }
                    }
                } else {
                    comparer=comparer.sgte; //si no se encuentra el duplicado entonces se pasa al siguiente no a seguir comparando
                }
            }
            current=current.sgte; //terminado y revisado los duplicados con el valor actual entonces se pasa al siguiente valor a buscar su duplicado
        }
        System.out.println("Duplicados eliminados");
    }
    //    find(int valor): Busca si un nodo con un valor específico existe en la lista. Devuelve true o false.
    public  boolean fin(int valor){
        if (inicio==null){
            System.out.println("Nada donde buscar");
            return false;
        }
        nodo actual=inicio;
        while (actual!=null && actual.valor!=valor)
        {
            actual=actual.sgte;
        }
        if (actual==null) return false;
        else{
            return true;
        }
    }
//    findPosition(int valor): Devuelve la posición del nodo con el valor especificado, o -1 si no existe.
    public void finPosition(int valor){
        if (inicio==null){
            System.out.println("Nada donde buscar");
            return;
        }
        if (inicio.valor==valor){
            System.out.println("Se encuentra en la posición: 1");
            return;
        }
        nodo actual=inicio;
        int contador=1;
        while (actual!=null && actual.valor!=valor){
            actual=actual.sgte;
            contador++;
        }
        if (actual==null) System.out.println("Valor no encontrado");
        else if (actual==end) {
            System.out.println("Valor en la posición: "+contador+". Es la final.");
        } else {
            System.out.println("Valor encontrado en la posión: "+contador);
        }
    }
//    updateValue(int oldValue, int newValue): Busca el primer nodo con un valor específico y lo actualiza con un nuevo valor.
    public void updateValue(int oldValue, int newValue){
        if (inicio==null){
            System.out.println("nada que actualizar");
            return;
        }
        nodo nodoRem=new nodo(newValue);
        if (inicio.valor==oldValue){
            nodoRem.sgte=inicio.sgte;
            inicio=nodoRem;
            return;
        }
        nodo actual=inicio;
        nodo anterior=null;
        while (actual!=null && actual.valor!=oldValue){
            anterior=actual;
            actual=actual.sgte;
        }
        if (actual==null){
            System.out.println("No se encontro el valor");
        } else if (actual==end) {
            nodoRem.anterior=end.anterior;
            end=nodoRem;
            anterior.sgte=end;
        } else {
            nodoRem.anterior=anterior;
            nodoRem.sgte=actual.sgte;
            anterior.sgte=nodoRem;
        }
    }
//            updateAtPosition(int pos, int valor): Actualiza el valor del nodo en una posición específica.
    public void updateAtPosition(int pos, int valor){
        if (inicio==null){
            System.out.println("Nada que actualizar");
            return;
        }
        nodo nodAgre=new nodo(valor);
        if (pos==1){
            nodAgre.sgte=inicio.sgte;
            inicio=nodAgre;
            return;
        }
        nodo actual=inicio;
        nodo anterior=null;
        int contador=1;
        while (actual!=null && contador!=pos){
            anterior=actual;
            actual=actual.sgte;
            contador++;
        }
        if (actual==null){
            System.out.println("No existe esa posición");
            return;
        }
        if (actual==end){
            nodAgre.anterior=end.anterior;
            end=nodAgre;
            anterior.sgte=end;
            return;
        }
        nodAgre.sgte=actual.sgte;
        nodAgre.anterior=actual.anterior;
        actual.sgte.anterior=nodAgre;
        anterior.sgte=nodAgre;
    }
//    mostrarReverso(): Muestra los valores de los nodos en orden inverso, desde el último al primero.
    public void mostrarReverso(){
        nodo current=end;
        while (current!=null){
            System.out.print(current.valor+" ");
            current=current.anterior;
        }
        System.out.println();
    }
//    size(): Devuelve el número de nodos en la lista.
    public void size(){
        if (inicio==null) System.out.println(0);
        else { int contador=0;
            nodo actual=inicio;
            while (actual!=null){
                actual=actual.sgte;
                contador++;
            }
            System.out.println("Tiene: "+contador+" nodos");
        }
    }
//    isEmpty(): Devuelve true si la lista está vacía.
    public boolean isEmpty(){
        if (inicio==null){
            return true;
        }
        else {
            return false;
        }
    }
//            clear(): Elimina todos los nodos de la lista.
    public void clear(){
        if (inicio!=null){
            inicio=end=null;
        }
    }
//            contains(int valor): Verifica si existe un nodo con el valor especificado.
//7. Avanzados
//    reverseInPlace(): Invierte el orden de los nodos directamente en la lista.
//    merge(DoublyLinkedList otraLista): Combina dos listas doblemente enlazadas en una nueva.
//    split(): Divide la lista en dos mitades.
//    getMiddle(): Devuelve el valor del nodo del medio de la lista.
//    sort(): Ordena los nodos de la lista en orden ascendente o descendente.
//            toArray(): Convierte los valores de los nodos en un arreglo.
    public void mostrar(){
        nodo current=inicio;
        while (current!=null){
            System.out.print(current.valor+" ");
            current=current.sgte;
        }
        System.out.println();
    }
}
