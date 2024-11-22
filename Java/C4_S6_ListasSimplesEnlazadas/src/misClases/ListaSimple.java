package misClases;

public class ListaSimple {
    private Nodo inicio;
    public ListaSimple(){
        inicio=null;
    }
    public void addInOrderASC(int valor){
        Nodo nodoAnadir=new Nodo(valor);
        if (inicio==null) inicio=nodoAnadir;
        else if (inicio.valor>valor){
            nodoAnadir.sgte=inicio;
            inicio=nodoAnadir;
        } else{
            Nodo actual=inicio;
            Nodo anterior=null;
            while(actual!=null){
                if (actual.valor>valor){
                    break;
                }
                anterior=actual;
                actual=actual.sgte;
            }
            if (actual==null){
                anterior.sgte=nodoAnadir;
                return;
            } else {
                nodoAnadir.sgte=actual;
                anterior.sgte=nodoAnadir;
            }
        }
    }
    public void addFIRST(int valor){
        Nodo nodoAGREGAR=new Nodo(valor);
        if (inicio==null){
            inicio=nodoAGREGAR;
        } else if (inicio!=null) {
            nodoAGREGAR.sgte=inicio;
            inicio=nodoAGREGAR;
        }
    }
    public void addLast(int valor){
        Nodo nodoAGREGAR=new Nodo(valor);
        Nodo actual=inicio;
        if (inicio==null) inicio=nodoAGREGAR;
        else {
            while(actual.sgte!=null){
                actual=actual.sgte;
            }
            actual.sgte=nodoAGREGAR;
        }
    }
    public void addInOrdenDESC(int valor){
        Nodo nodoAgregar=new Nodo(valor);
        Nodo actual=inicio;
        Nodo anterior=null;
        if (inicio==null) inicio=nodoAgregar;
        else if (inicio.valor<=valor){
            nodoAgregar.sgte=inicio;
            inicio=nodoAgregar;
        } else {
            while (actual!=null){
                if (actual.valor<valor){
                    break;
                }
                anterior=actual;
                actual=actual.sgte;
            }
            if (actual==null){
                anterior.sgte=nodoAgregar;
            } else {
                nodoAgregar.sgte=actual;
                anterior.sgte=nodoAgregar;
            }
        }
    }
    public void addByPOSITION(int valor, int Position){
        Nodo nodoAGREGAR = new Nodo(valor);
        int contador=0;
        Nodo actual=inicio;
        Nodo anterior=null;
        if (Position==1){
            if (inicio==null){
                inicio=nodoAGREGAR;
            } else{
                nodoAGREGAR.sgte=inicio;
                inicio=nodoAGREGAR;
            }
        } else {
            while(actual!=null){
                if (contador==Position-1){
                    break;
                }
                anterior=actual;
                actual=actual.sgte;
                contador++;
            }
            if (actual==null){
                System.out.println("No se encontro esa posición");
            } else {
                nodoAGREGAR.sgte=actual;
                anterior.sgte=nodoAGREGAR;
            }
        }
    }
    public void removeFirst(){
        if (inicio==null) System.out.println("Nada que eliminar");
        else {
            inicio=inicio.sgte;
        }
    }
    public void removeLast(){
        if (inicio==null) System.out.println("Nada que eliminar");
        else {
            Nodo actual=inicio;
            Nodo anterior=null;
            while(actual.sgte!=null){
                anterior=actual;
                actual=actual.sgte;
            }
            anterior.sgte=null;
        }
    }
    public void removeByPosition(int Position){
        Nodo actual=inicio;
        Nodo anterior=null;
        int contador=0;
        if (inicio==null) System.out.println("Nada que eliminar");
        else {
            if (Position==1){
                inicio=inicio.sgte;
            } else {
                while (actual!=null){
                    if (contador==Position-1){
                        break;
                    }
                    anterior=actual;
                    actual=actual.sgte;
                    contador++;
                }
                if (actual==null) System.out.println("Posición no valida");
                else {
                    actual=actual.sgte;
                    anterior.sgte=actual;
                }
            }
        }
    }
    public void removeByValue(int valor){
        if (inicio==null) System.out.println("Nada que eliminar");
        else {
            if (inicio.valor==valor) inicio=inicio.sgte;
            else {
                Nodo actual=inicio;
                Nodo anterior=null;
                while (actual!=null){
                    if (actual.valor==valor){
                        break;
                    }
                    anterior=actual;
                    actual=actual.sgte;
                }
                actual = actual.sgte;
                anterior.sgte=actual;
            }
        }
    }
    public void cantidad(){
        int contador=0;
        Nodo actual=inicio;
        if (inicio==null) System.out.println("No hay nada");
        else {
            while(actual!=null){
                actual=actual.sgte;
                contador++;
            }
            System.out.println("La cantidad es de: "+contador+" Nodos");
        }

    }
    public boolean isEmpty(){
        if (inicio==null) return true;
        else return false;
    }
    public void clear(){
        inicio=null;
    }
    public void position(int valor){
        if (inicio==null) System.out.println("No hay donde buscar");
        else {
            int contador=1;
            Nodo actual=inicio;
            while (actual!=null){
                if (actual.valor==valor) break;
                actual=actual.sgte;
                contador++;
            }
            if (actual==null) System.out.println("No se encontro valor");
            else {
                System.out.println("Valor encontrado en el nodo: "+contador);
            }
        }
    }
    public void find(int valor){
        if (inicio==null) System.out.println("No existe ese valor");
        else {
            Nodo actual=inicio;
            while (actual!=null){
                if (actual.valor==valor)break;
                actual=actual.sgte;
            }
            if (actual==null) System.out.println("Valor no encontrado");
            else System.out.println("Si existe ese valor");
        }
    }
    public void updateValue(int newValue, int oldValue){
        if (inicio==null) System.out.println("nothing to change");
        else{
            if (inicio.valor==oldValue){
                inicio.valor=newValue;
                mostrar();
                return;
            }
            Nodo actual=inicio;
            Nodo nodoAgregar=new Nodo(newValue);
            Nodo anterior=null;
            while (actual!=null){
                if (actual.valor==oldValue)break;
                anterior=actual;
                actual=actual.sgte;
            }
            if (actual==null) System.out.println("There isn't that value in the list");
            else {
                nodoAgregar.sgte=actual.sgte;
                anterior.sgte=nodoAgregar;
                mostrar();
            }
        }
    }
    public void mostrar(){
        Nodo actual=inicio;
        while (actual!=null){
            System.out.print(actual.valor+" ");
            actual=actual.sgte;
        }
        System.out.println();
    }
}
