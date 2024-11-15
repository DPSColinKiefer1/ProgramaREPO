package misClases;
import java.util.ArrayList;
public class PilaGenerica <E>{//Declara una clase genérica llamada PilaGenerica. El <E> indica que la clase es genérica y que E será el tipo de los elementos
	/*
	 * Resumen de la clase PilaGenerica<E> 
	 * 		PilaGenerica<E>: Es una clase genérica que implementa una pila utilizando un ArrayList interno para almacenar los elementos. 
	 * 		Generics (<E>): Permite que la pila almacene cualquier tipo de dato (como Integer, String, etc.), ofreciendo reutilización y seguridad de tipos
	 */
    private ArrayList<E> lista=new ArrayList<>();
    public int getSize(){ //getSize(): Devuelve el número de elementos en la pila.
        return lista.size();
    }
    public void push(E o){ //push(E o): Añade un elemento de tipo E a la pila.
        lista.add(o);
    }
    public E pop(){ //pop(): Elimina el último elemento de la pila y lo devuelve para saber que se ha eliminado.
        E o=lista.get(getSize()-1); //Devuelve el último elemento de la pila
        lista.remove(getSize()-1); //Elimina el último elemento
        return o; //Devuelve el elemento
    }
    public E peek(){ //peek(): Devuelve el elemento de la pila sin eliminarlo.
        return lista.get(getSize()-1);
    }
    public boolean isEmpty(){ //isEmpty(): Devuelve verdadero si la pila esta vacía y falso en caso contrario.
        return lista.isEmpty();
    }
    public String toString(){ //toString(): Devuelve una cadena con la representación de la pila.
        return "Pila: "+lista.toString();
    }
}
