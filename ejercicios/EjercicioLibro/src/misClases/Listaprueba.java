package misClases;

public class Listaprueba {
    public Nodo inicio;
    public Nodo fin;
    public Listaprueba(){
        this.inicio=null;
        this.fin=null;
    }
    public void insertar(int codigoLibro){
        Nodo libroInsertar = new Nodo(codigoLibro);
        if (inicio==null){
            inicio = libroInsertar;
            fin = libroInsertar;
            return;
        }
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual!=null){
            anterior = actual;
            actual=actual.siguiente;
        }
        libroInsertar.anterior=anterior;
        actual=libroInsertar;
        fin=actual;
        anterior.siguiente=actual;
    }
    public void insertarOrdenado(int codigoLibro){
        Nodo LibroInsertar = new Nodo(codigoLibro);
        if (inicio==null){
            inicio=LibroInsertar;
            fin=LibroInsertar;
            return;
        }
        if (inicio.dato>LibroInsertar.dato){
            LibroInsertar.siguiente=inicio;
            inicio.anterior=LibroInsertar;
            inicio=LibroInsertar;
            return;
        }
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual!=null){
            if (actual.dato>codigoLibro){
                break;
            }
            anterior=actual;
            actual=actual.siguiente;
        }
        if (actual==null){
            LibroInsertar.anterior=fin;
            fin.siguiente=LibroInsertar;
            fin=LibroInsertar;
            return;
        }
        LibroInsertar.anterior=anterior;
        LibroInsertar.siguiente=actual;
        actual.anterior=LibroInsertar;
        anterior.siguiente=LibroInsertar;
    }
    public void mostrar (){
        Nodo actual = inicio;
        while (actual!=null){
            System.out.print(actual.dato+ " ");
            actual=actual.siguiente;
        }
        System.out.println();
    }
    public void EliminarValor(int codigoAeliminar){
        if (inicio.dato==codigoAeliminar){
            inicio=inicio.siguiente;
            return;
        }
        Nodo actual = inicio;
        if (fin.dato == codigoAeliminar){
            fin = fin.anterior;
            if (fin!=null){
                fin.siguiente=null;
            }
            return;
        }
        Nodo anterior = null;
        while(actual!=null){
            if (actual.dato==codigoAeliminar){
                break;
            }
            anterior=actual;
            actual = actual.siguiente;
        }
        if (actual==null) System.out.println("Codigo no encontrado");
        else {
            actual=actual.siguiente;
            actual.anterior=anterior;
            anterior.siguiente=actual;
        }
    }
    public boolean buscarLibro(int valor){
        if (inicio == null){
            System.out.println("Nada que buscar");
            return false;
        }
        if (inicio.dato==valor){
            System.out.println("Se encuentra en la ubicación: 1");
            return true;
        }
        Nodo actual = inicio;
        int count = 1;
        while (actual!=null){
            if (actual.dato==valor){
                break;
            }
            actual=actual.siguiente;
            count++;
        }
        if (actual==null) {
            System.out.println("Nada encontrado!");
            return false;
        } else {
            System.out.print("Se encuentra en la ubicación: ");
            System.out.println(count);
            return true;
        }
    }
    public void mostrarAntesYDespuesDeInsercion(int dato, boolean ordenado){

    }
    public void eliminarDuplicados(){
        if (inicio.dato==inicio.siguiente.dato){
            inicio=inicio.siguiente;
        }
        Nodo actual = inicio;
        Nodo anterior =null;
        if (fin.dato==fin.anterior.dato){
            fin=fin.anterior;
            fin.siguiente=null;
        }
        while (actual!=null){
            if (actual.dato==actual.siguiente.dato){
                break;
            }
            anterior=actual;
            actual=actual.siguiente;
        }
        if (actual==null){
            return;
        }else {
            actual=actual.siguiente;
            actual.anterior=anterior;
            anterior.siguiente=actual;
        }
    }
    public Nodo encontrarCentro(){
        if (inicio==null){
            System.out.println("No hay datos");
            return null;
        }
        if (inicio==fin){
            System.out.println("Centro inexistente");
            return inicio;
        }
        Nodo medio = inicio;
        Nodo actual = inicio;
        while (actual!=null && actual.siguiente != null){
            medio=medio.siguiente;
            actual=actual.siguiente.siguiente;
        }
        System.out.println(medio.dato);
        return medio;
    }
    public void invertirLista(){
        Listaprueba listaInvertida = new Listaprueba();
        if (inicio==null){
            System.out.println("nada que invertir");
            return;
        }
        Nodo actual = fin;
        while (actual!=null){
            listaInvertida.insertar(actual.dato);
            actual=actual.anterior;
        }
        listaInvertida.mostrar();
    }
}
