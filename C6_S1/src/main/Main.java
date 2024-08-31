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
		int [] codigos = new int[n];
		int [] notas=new int[n];
		int sum=0;
		for(int i=0;i<notas.length;i++) {
			codigos[i]=(int)(Math.random()*8001+1000);
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
