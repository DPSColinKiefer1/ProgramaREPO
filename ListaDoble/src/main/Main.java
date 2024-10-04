package main;

import misClases.ListaDoble;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ListaDoble lista1 = new ListaDoble();
        lista1.insertarInicio(1);
        lista1.insertarInicio(3);
        lista1.insertarInicio(6);
        lista1.insertarInicio(5);
        lista1.mostrar();
        lista1.insertarFinal(7);
        lista1.insertarFinal(3);
        lista1.mostrar();
        lista1.insertarXposicion(0,4);
        lista1.mostrar();
        lista1.mostrarReversa();
    }
}