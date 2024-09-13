package main;

import misClases.GestionArreglo;

public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionArreglo ga1 = new GestionArreglo(10);
		ga1.mostrarArreglo();
		GestionArreglo ga2 = new GestionArreglo(8);
		ga2.mostrarArreglo();
		System.out.println(ga1.compararArreglo(ga2.getArreglo()));
	}
}
