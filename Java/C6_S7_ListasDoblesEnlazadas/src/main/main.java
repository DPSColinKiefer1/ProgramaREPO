package main;

import misClases.listasDoble;

public class main {
    public static void main(String[] args) {
        listasDoble goku=new listasDoble();
        goku.addFirst(12);
        goku.addFirst(34);
        goku.addFirst(122);
        goku.addFirst(344);
        goku.addFirst(2);
        goku.addFirst(3);
        goku.addLast(132);
        goku.addLast(324);
        goku.addLast(1252);
        goku.addLast(34);
        goku.addLast(22);
        goku.addLast(31);
        goku.mostrar();
        System.out.println(goku.inicio.valor);
        listasDoble go=new listasDoble();
        go.addInOrderDESC(54);
        go.addInOrderDESC(12);
        go.addInOrderDESC(678);
        go.addInOrderDESC(33);
        go.addInOrderDESC(43);
        go.addByPosition(12,3);
        go.addLast(4);
        go.addFirst(41);
        go.removeDuplicates();
        go.updateAtPosition(2,6);
        go.mostrar();
        go.size();
        go.mostrarReverso();
    }
}
