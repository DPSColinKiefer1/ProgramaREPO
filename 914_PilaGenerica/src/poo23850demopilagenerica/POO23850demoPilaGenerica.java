package poo23850demopilagenerica;
import misClases.PilaGenerica;
public class POO23850demoPilaGenerica {
    public static void main(String[] args) {
        PilaGenerica<String> pila1=new PilaGenerica<>();
        pila1.push("hUgo");
        pila1.push("Paco");
        pila1.push("lUis");
        
        PilaGenerica<Integer> pila2=new PilaGenerica<>();
        pila2.push(1);
        pila2.push(2);
        pila2.push(3);
        System.out.println(pila1);
         System.out.println(pila2);
         System.out.println("Elimino al de cima de pila1");
         String eliminado=pila1.pop();
         System.out.println(pila1);
    }
}
