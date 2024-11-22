package misClases;

public class Cola {
    Nodos frente;
    Nodos fin;
    public Cola(){
        fin=frente=null;
    }
    public void insertar(int valor){
        Nodos agregar=new Nodos(valor);
        if (estaVacio()){ //si la cola esta vacia
            fin=frente=agregar; //entonces el nuevo ingresante sera el
            return; //primero y el ultimo
        }
        fin.sgte=agregar; //ahora este sera el nuevo elemento que viene despues del final anterior
        fin=agregar; //se le asigna como nuevo nodo fin
    }
    public boolean estaVacio(){
        return frente==null;
    }
    public void eliminar(){
        if (estaVacio()){
            System.out.println("Nada que eliminar");
            return;
        }
        if (frente==fin){ //si es que el primero y el ultimo son igual
            frente=fin=null; //significa que solo hay un valor en la cola
            return; //solo se debe poner ambos null para vaciarla
        }
        frente=frente.sgte; //recuerda que el primero en entrar es el primero en salir
    } //entonces debe ser eliminado primero el
    public void mostrar(){
        if (estaVacio()){
            System.out.println("nada que mostrar");
            return;
        }
        Nodos actual=frente;
        while (actual!=null){
            System.out.print(actual.valor+" ");
            actual=actual.sgte;
        }
        System.out.println();
    }
}
