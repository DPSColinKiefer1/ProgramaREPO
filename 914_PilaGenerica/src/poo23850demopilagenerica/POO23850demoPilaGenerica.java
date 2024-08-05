package poo23850demopilagenerica;
import misClases.PilaGenerica;
public class POO23850demoPilaGenerica {
    public static void main(String[] args) {
        PilaGenerica<String> pila1=new PilaGenerica<>(); //crea un objeto de la clase PilaGenerica de tipo String
        pila1.push("hUgo"); //agrega un valor a la pila
        pila1.push("Paco"); //agrega un valor a la pila
        pila1.push("lUis"); //agrega un valor a la pila
        
        PilaGenerica<Integer> pila2=new PilaGenerica<>(); //crea un otro objeto de la clase PilaGenerica de tipo Integer
        pila2.push(1); //agrega un valor a la pila2
        pila2.push(2);
        pila2.push(3);
        System.out.println(pila1); //imprime la pila1
         System.out.println(pila2); //imprime la pila2
         System.out.println("Elimino al de cima de pila1"); 
         String eliminado=pila1.pop(); //elimina el valor de la cima de la pila1 pero el valor eliminado se almacena en la variable eliminado
         System.out.println(pila1); //imprime la pila1 ahora con el valor eliminado
    }
}
