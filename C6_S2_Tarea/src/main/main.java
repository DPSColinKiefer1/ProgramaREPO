package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[(i + 1) % n] = arr[i];
        }
        System.out.println("Nuevo arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
