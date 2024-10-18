package NodoDoble;

public class Lista {
    Nodos inicio;
    Nodos fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    public void añadir(int codigo, String nombre){
        Nodos ejem=new Nodos(codigo,nombre);
        Nodos actual=inicio;
        Nodos anterior=fin;
        if (inicio==null){
            inicio=ejem;
            fin=ejem;
            return;
        }
        while (actual!=null){
            if (actual.dato.codigo>codigo){
                break;
            }
            anterior=actual;
            actual=actual.siguiente;
        }  if (actual==inicio){
            ejem.siguiente=inicio;
            inicio=ejem;
        } else if (actual==null){
            ejem.anterior=anterior;
            anterior.siguiente=ejem;
            fin=ejem;
        }else if (actual!=null){
            actual.anterior=ejem;
            ejem.siguiente=actual;
            anterior.siguiente=ejem;
        }
    }
    public void mostrar(){
        System.out.println("-------");
        Nodos ejem= inicio;
        while (ejem!=null){
            System.out.println(ejem.dato.codigo+"  "+ejem.dato.Nombre);
            ejem=ejem.siguiente;
        }
    }
    public void eliminar(int codigo){
        Nodos current = inicio;
        Nodos before = null;
        if (inicio==null) System.out.println("Valor no encontrado");
        else if (inicio.dato.codigo==codigo) inicio=inicio.siguiente;
        else{
            while (current != null){
                if (current.dato.codigo==codigo) break;
                before=current;
                current=current.siguiente;
            }
            if (current==null) System.out.println("Valor no encontrado");
            else if (current==fin){
                before.siguiente=null;
                fin=fin.anterior;
            }
            else{
                current=current.siguiente;
                before.siguiente=current;
            }
        }
    }
    public void mescla(Lista lista1, Lista lista2){
        Lista nueva = new Lista();
        Nodos list1=lista1.inicio;
        Nodos list2=lista2.inicio;
        if (list1==null && list2==null){
            System.out.println("nada que mesclar");
        }else {
          while (list1!=null && lista2!=null){
              if (list1!=null){
                  nueva.añadir(list1.dato.codigo,list1.dato.Nombre);
                  list1=list1.siguiente;
              }
              if (list2!=null){
                  nueva.añadir(list2.dato.codigo,list2.dato.Nombre);
                  list2=list2.siguiente;
              }
          }
          nueva.mostrar();
        }
    }
}
