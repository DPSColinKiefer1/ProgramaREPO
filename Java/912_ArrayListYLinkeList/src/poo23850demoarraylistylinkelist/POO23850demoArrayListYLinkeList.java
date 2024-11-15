package poo23850demoarraylistylinkelist;
import java.util.*;
public class POO23850demoArrayListYLinkeList {
    public static void main(String[] args) {
       List<Integer> arraylist = new ArrayList<>();
       arraylist.add(1);arraylist.add(2);arraylist.add(3);
       arraylist.add(1);arraylist.add(4);
       arraylist.add(0, 88);
       arraylist.add(3, 99);
        System.out.println("lista de elementos en el array");
        System.out.println(arraylist);
        
        LinkedList<Object> listaenlazada=new LinkedList<>(arraylist);
        listaenlazada.add(1, "crema");
        listaenlazada.removeLast();
        listaenlazada.addFirst("gUinda");
       System.out.println("lista de elementos en el linkedlist");
        System.out.println(listaenlazada);
       System.out.println("\nlista de elementos en el linkedlist REVERSA");
       ListIterator<Object> iteradorlista=listaenlazada.listIterator(listaenlazada.size());
       while(iteradorlista.hasPrevious())
            System.out.print(iteradorlista.previous()+" ");
        System.out.println("con forEach");
        for(Object o: listaenlazada){
            System.out.print(o+" ");
        }
        System.out.println("\ncon for clasico");
        for(int i=0;i<listaenlazada.size();i++){
            System.out.print(listaenlazada.get(i)+" - ");
        }
        System.out.println("\nlista de elementos en el linkedlist ADELANTE");
       iteradorlista=listaenlazada.listIterator();
       while(iteradorlista.hasNext())
            System.out.print(iteradorlista.next()+" + ");
    }
}
