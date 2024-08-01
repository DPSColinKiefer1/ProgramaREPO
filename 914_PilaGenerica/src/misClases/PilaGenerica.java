package misClases;
import java.util.ArrayList;
public class PilaGenerica <E>{
    private ArrayList<E> lista=new ArrayList<>();
    public int getSize(){
        return lista.size();
    }
    public void push(E o){
        lista.add(o);
    }
    public E pop(){
        E o=lista.get(getSize()-1);
        lista.remove(getSize()-1);
        return o;
    }
    public E peek(){
        return lista.get(getSize()-1);
    }
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    public String toString(){
        return "Pila: "+lista.toString();
    }
}
