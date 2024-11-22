package misClases;

public class Pila {
    Nodos frente;
    Nodos fin;
    public Pila(){
        frente=null;
        fin=null;
    }
    public void insertar(int valor){
        Nodos add=new Nodos(valor);
        if (fin==null){
            frente=fin=add;
            return;
        }
        add.sgte=frente;
        frente=add;
    }
    public boolean estavacia(){
        return fin==null;
    }
    public void eliminar(){
        if (estavacia()){
            System.out.println("No hay donde eliminar");
            return;
        }
        if (frente==fin){
            frente=fin=null;
            return;
        }
        frente=frente.sgte;
    }
    public void mostrar(){
        if (estavacia()){
            System.out.println("Nada que mostrar");
            return;
        }
        Nodos actual=frente;
        while (actual!=null){
            System.out.print(actual.dato+" ");
            actual=actual.sgte;
        }
        System.out.println();
    }
}
