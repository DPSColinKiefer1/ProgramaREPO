package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese Numero de alumnos!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] cod = new int[n];
		int [] notas  = new int[n];
		int sumas=0;
		int mayor=0;
		int codmayor=0;
		for(int i=0;i<cod.length;i++) {
			cod[i] = (int)(Math.random()*8001+1000);
			notas[i]=(int)(Math.random()*20);
			System.out.println(cod[i]+"\t"+notas[i]);
			sumas+=notas[i];
			if(notas[i]>mayor) {
				mayor=notas[i];
				codmayor=cod[i];
			}
		}
		System.out.println("La nota mayor es de: "+mayor+"y su codigo es"+codmayor);
		
		System.out.println("La suma total de nota es de: "+sumas);
		double prom = sumas*1.0/n;
		System.out.println("El promedio de ellas es de: "+prom);
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>prom) {
				System.out.println(cod[i]+"\t");
			}
		}
	}

}
