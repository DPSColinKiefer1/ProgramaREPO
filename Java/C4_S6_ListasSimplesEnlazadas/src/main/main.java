package main;

import misClases.ListaSimple;

public class main {
    public static void main(String[] args) {
        ListaSimple ejem=new ListaSimple();
        ejem.addInOrderASC(12);
        ejem.addInOrderASC(11);
        ejem.addInOrderASC(15);
        ejem.addInOrderASC(122);
        ejem.addInOrderASC(151);
        ejem.addInOrderASC(16);
        ejem.mostrar();
        ejem.addLast(10);
        ejem.addFIRST(15);
        ejem.mostrar();
        ListaSimple ejem2=new ListaSimple();
        ejem2.addInOrdenDESC(12);
        ejem2.addInOrdenDESC(11);
        ejem2.addInOrdenDESC(15);
        ejem2.addInOrdenDESC(122);
        ejem2.addInOrdenDESC(151);
        ejem2.addInOrdenDESC(16);
        ejem2.mostrar();
        ejem2.addByPOSITION(5,5);
        ejem2.removeLast();
        ejem2.removeByValue(122);
        ejem2.mostrar();
        ejem2.cantidad();
        ejem2.position(5);
        ejem2.updateValue(95,151);
    }
}
