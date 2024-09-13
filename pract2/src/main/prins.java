package main;

import Arreglos.GestionArreglos;

public class prins {
		public static void main(String[] args) {
			GestionArreglos g = new GestionArreglos(8);
			g.cargar();
			g.mostrar();
			g.inserxorden(10);
			g.mostrar();
			g.inserxindi(2, 20);
			g.mostrar();
		}
}
