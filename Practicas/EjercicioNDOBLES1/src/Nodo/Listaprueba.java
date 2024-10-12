package Nodo;

public class Listaprueba {
    Nodo inicio;
    Nodo fin;
    public Listaprueba(){
        inicio=null;
        fin=null;
    }
    public void insertarOrdenado(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else if (dato < inicio.dato) {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        } else if (dato > fin.dato) {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual != null && actual.dato < dato) {
                actual = actual.siguiente;
            }
            nuevo.anterior = actual.anterior;
            nuevo.siguiente = actual;
            actual.anterior.siguiente = nuevo;
            actual.anterior = nuevo;
        }
    }
    public void insertarDespuesDe(int valor, int nuevoDato) {
        Nodo actual = inicio;
        while (actual != null && actual.dato != valor) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            Nodo nuevo = new Nodo(nuevoDato);
            nuevo.siguiente = actual.siguiente;
            nuevo.anterior = actual;
            if (actual.siguiente != null) {
                actual.siguiente.anterior = nuevo;
            }
            actual.siguiente = nuevo;
            if (actual == fin) {
                fin = nuevo;
            }
        }
    }
    public Listaprueba mezclarListas(Listaprueba otraLista) {
        Listaprueba listaMezclada = new Listaprueba();
        Nodo actual1 = this.inicio;
        Nodo actual2 = otraLista.inicio;
        while (actual1 != null && actual2 != null) {
            if (actual1.dato <= actual2.dato) {
                listaMezclada.insertarOrdenado(actual1.dato);
                actual1 = actual1.siguiente;
            } else {
                listaMezclada.insertarOrdenado(actual2.dato);
                actual2 = actual2.siguiente;
            }
        }
        while (actual1 != null) {
            listaMezclada.insertarOrdenado(actual1.dato);
            actual1 = actual1.siguiente;
        }
        while (actual2 != null) {
            listaMezclada.insertarOrdenado(actual2.dato);
            actual2 = actual2.siguiente;
        }
        return listaMezclada;
    }
    public void mostrarAntesYDespues(int dato, boolean ordenado) {
        System.out.println("Lista antes de la inserción:");
        mostrarLista();
        if (ordenado) {
            insertarOrdenado(dato);
        } else {
            insertarDespuesDe(fin.dato, dato);
        }
        System.out.println("Lista después de la inserción:");
        mostrarLista();
    }
    public void mostrarLista() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void eliminarValor(int valor) {
        Nodo actual = inicio;
        while (actual != null && actual.dato != valor) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            if (actual == inicio) {
                inicio = actual.siguiente;
                if (inicio != null) {
                    inicio.anterior = null;
                }
            } else if (actual == fin) {
                fin = actual.anterior;
                fin.siguiente = null;
            } else {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }
        }
    }
    public void invertirLista() {
        Nodo actual = inicio;
        Nodo temporal = null;
        while (actual != null) {
            temporal = actual.anterior;
            actual.anterior = actual.siguiente;
            actual.siguiente = temporal;
            actual = actual.anterior;
        }
        if (temporal != null) {
            inicio = temporal.anterior;
        }
    }
    public void eliminarDuplicados() {
        Nodo actual = inicio;
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            while (siguiente != null && siguiente.dato == actual.dato) {
                eliminarValor(siguiente.dato);
                siguiente = siguiente.siguiente;
            }
            actual = actual.siguiente;
        }
    }
    public Nodo encontrarCentro() {
        if (inicio == null) return null;
        Nodo lento = inicio;
        Nodo rapido = inicio;
        while (rapido != null && rapido.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }
        return lento;
    }
}
