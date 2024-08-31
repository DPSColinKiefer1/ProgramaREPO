package main;

import Clase.GestionArreglo;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionArreglo garray= new GestionArreglo(10);
		GestionArreglo garray2= new GestionArreglo(10);
		garray.cargaInicial();
		/*
		 * for(int i=0;i<GestionArreglo.miArreglo.length;i++){
		 * GestionArreglo.miArreglo[i]=2*i+1; }
		 */
        garray.mostrar();
		/*
		 * garray.insertaelemxindice(200, 2); System.out.print("\n");
		 */
        garray.insertaelemxorden(6);
        garray.mostrar();
        garray2.cargaInicialDES();
        garray2.mostrar();
    }
}
