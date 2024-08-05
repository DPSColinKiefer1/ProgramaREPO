package poo23850demolambda;
import java.util.*;
public class POO23850FOREACHenarraylist {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>(); //se crea una lista de tipo String
        lista.add("hUgo");lista.add("paco"); //se agregan elementos
        lista.add("lUis");lista.add("jesUs");
        lista.add("maria");lista.add("jose");
        lista.forEach( (n) -> System.out.println(n));
        /*
         * de forma sencilla para un novato, lo que entendi es que foreach itera cada uno de los elementos dentro de la lista, estos elementos son separados y 
         * se usa "n" como el que toma el valor del elemento separado actual, pero durante el proceso de separacion puede realizar un accion o algo parecido, 
         * como si fuera un for convencional, la accion a realizar seria " System.out.println(n))"
         */
        
        //.forEach es un método de la interfaz Iterable, como los arraylist. Se usa para recorrer cada elemento de la lista
		/*
		 * (n) -> System.out.println(n):
		 * 		Tipo: Lambda expression 
		 * 		Descripción: Esta es una expresión lambda que define una implementación del método accept de la interfaz Consumer.
		 * 		Partes:
		 * 			* (n): Define el parámetro de la lambda. En este caso, n representa cada elemento individual de la lista mientras se itera sobre ella.
		 *			* ->: Es el operador lambda que separa los parámetros de la expresión (a la izquierda) del cuerpo de la expresión (a la derecha).
		 * 			* System.out.println(n): Es el cuerpo de la lambda, que se ejecuta para cada elemento n de la lista. Esta línea imprime el valor de n en la consola.
		 */
    }
}
