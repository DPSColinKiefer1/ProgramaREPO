package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Crea un algoritmo donde ingreses una cantidad de alumnos y este te dara sus codigos y notas, luego sacar el promedio de esas notas y los alumnos
		//que tengan una nota mayor al promedio.
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de alumnos a ingresar: ");
		int n = sc.nextInt();
		int[] cod=new int[n];
		int[]  notas=new int[n];
		int suma=0;
		for(int i=0;i<n;i++) {
			cod[i]=(int)(Math.random()*8001+1000);
			notas[i]=(int)(Math.random()*21);
			suma+=notas[i];
			System.out.println((i+1)+") "+cod[i]+" "+notas[i]);
		}
		double prome=suma*1.0/n;
		System.out.println("El promedio es de: "+prome);
		for(int i=0;i<n;i++) {
			if(notas[i]>prome) {
				System.out.println(cod[i]+" "+notas[i]);
			}
		}
	}
}
