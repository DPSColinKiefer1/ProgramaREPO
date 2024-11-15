package aed22402demolistasdoblelink;
import misClases.ListaDobleEnlazada;
public class AED22402demoLISTASDOBLELINK {
    public static void main(String[] args) {
        ListaDobleEnlazada lista1=new ListaDobleEnlazada();
        lista1.insertaInicio(7);
        lista1.mostrar();
        lista1.insertaInicio(2);
        lista1.mostrar();
        lista1.insertaFinal(8);
        lista1.mostrar();
        lista1.insertaFinal(9);
        lista1.mostrar();
    }
}
