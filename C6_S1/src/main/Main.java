package main;

import java.util.Scanner;

public class Main {
	/*
	 * caso1: se tienen los códigos[1000-9000] y las notas vigesimales de "n"
	 * estudiantes. Se pide hallar el promedio y los códigos de los estudiantes cuya
	 * nota es mayor que el promedio
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese n");
		int n=sc.nextInt();
		int [] codigos = new int[n]; //crea un arreglo del tamño de la cantidad de alumnos pedido  donde van los codigos
		int [] notas=new int[n]; //crea un arreglo del tamño de la cantidad de alumnos pedido donde van las notas
		int sum=0; //se usara para calcular la suma de todas las notas
		for(int i=0;i<notas.length;i++) { //recorre cada estudiante basado en el tamaño del arreglo notas
			codigos[i]=(int)(Math.random()*8001+1000); //asigna un valor al estudiante que le toca por i
			//este estara en 1000 y 9000
			//primero Math.random() genera un numero aleatorio entre 0 y 1, no 0 ni 1, si no valores entre ellos
			//al multiplicarlo por 8001 se obtiene un valor entre 0 y 8000, osea, un valor mayor a 0 pero menor a 8001, osea, que solo llega a 8000
			//luego al sumar con 1000 el valor generado, se obtiene un valor entre 1000 y 9000, pudiendo tambien ser 1000 o 9000 ya que suma no multiplica
			//al final, al usar (int) el resultado sera solo la parte entera del valor resultante
			notas[i]=(int)(Math.random()*21);
			System.out.println(codigos[i]+"\t"+notas[i]);
			sum+=notas[i];
		}
		double prom=sum*1.0/n;
		System.out.println("promedio: "+prom);
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>prom) {
				System.out.println(codigos[i]+"\t");
			}
			System.out.println();
		}
	}
}