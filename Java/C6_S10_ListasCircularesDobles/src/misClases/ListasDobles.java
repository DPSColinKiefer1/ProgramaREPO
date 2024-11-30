package misClases;

public class ListasDobles {
    Nodos ultimo;
    public ListasDobles(){
        ultimo=null;
    }
    public boolean delete(int valor){
        if (estaVacia()){ //si la lista esta vacia entonces retorna falso porque no hay nada por eliminar
            System.out.println("Nada para eliminar");
            return false;
        }
        Nodos actual=ultimo; //se crea para ir pasando
        Nodos anterior=null;
        boolean encontrado=false;
        do{
            anterior=actual;
            actual=actual.siguiente;
            if (actual.valor==valor){
                encontrado=true;
                break;
            }
        }while (actual!=ultimo);
        if (encontrado) {
            if (actual==ultimo && actual.siguiente==ultimo){
                ultimo=null;
            }
            else {
                anterior.siguiente=actual.siguiente;
                if (actual==ultimo)ultimo=anterior;
            } return true;
        } return false;
    }
    public void insertar(int valor){
        Nodos nuevoNodo=new Nodos(valor);
        if(this.estaVacia()){ //si la lista esta vacia entonces
            ultimo=nuevoNodo;  //el ultimo nodo añadido sera el nuevo
            ultimo.siguiente=ultimo; //de igual forma su valor anterior y sgte seran
            ultimo.anterior=ultimo; //el mismo, para que sea circular ningun extremo debe ser null
        }else{ //si no esta vacia
            nuevoNodo.siguiente=ultimo.siguiente; //el nuevo nodo sera el nuevo nodo ultimo, por ende
            //al ser el nodo ultimo despues de este debe tener el nodo inicial, por se le asigna con "ultimo.siguiente"
            ultimo.siguiente=nuevoNodo; //ahora el sgte del nuevo penultimo sera el nuevo nodo ultimo recien agregado
            ultimo.siguiente.anterior=nuevoNodo; //esto hace que en el nodo primero ahora su anterior sera el nuevo nodo
            nuevoNodo.anterior=ultimo; //y el anterior de este ahora sera el anterior ultimo
            ultimo=nuevoNodo; //y se consagra el nuevo nodo como el nuevo
        }
    }
    public boolean estaVacia(){
        return ultimo==null;
    }
}
