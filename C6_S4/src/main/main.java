/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class main  {

    /**
     * a)  método que acepte como parámetro una matriz cuadrada y devuelva una matriz triángular inferior.
     * b) método que acepte como parámetro una matriz cuadrada y devuelva la suma de los elementos que están encima de la diagonal 
     * secundaria.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m={{1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2}};
        mostrarMatriz(m);
        System.out.println(m.length); //cuenta la cantidad de matrices dentro de la mariz bidencional, osea, como son 5 entonces
        //esa es la cantidad
        System.out.println("----------------------------");
        int [][] matrizTriINF=convierteTriInf(m);
        mostrarMatriz(matrizTriINF);
        System.out.println("----------------------------");
        int [][] matrizTriSUP=convierteTriSup(m);
        mostrarMatriz(matrizTriSUP);
        System.out.println("----------------------------");
        mostrarMatriz(matrizTriINF);
        int suma = sumaEncimaDiagonalSecundaria(m);
		System.out.println(suma);
        System.out.println("----------------------------");
        
    }
    public static void mostrarMatriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
    public static int[][] convierteTriInf(int[][] m){
        int[][] matResult1 = m; //esta copia el contenido de la matriz del parametro en esta nueva matriz
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                if(i < j) matResult1[i][j]=0;
        }
        return matResult1;
    }
    public static int[][] convierteTriSup(int[][] m){
        int[][] matResult = m; //esta copia el contenido de la matriz del parametro en esta nueva matriz
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                if(i > j) matResult[i][j]=0;
        }
        return matResult;
    }
    public static int[][] convierteTriSupSECUN(int[][] m){
        int[][] matResult = m; //esta copia el contenido de la matriz del parametro en esta nueva matriz
        int suma=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i+j < m.length-1){
                suma+=matResult[i][j];     
            }   
            }   
        }
        return matResult;
    }
    public static int sumaEncimaDiagonalSecundaria(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i + j < m.length - 1) { // Condición para elementos encima de la diagonal secundaria
                    suma += m[i][j];
                }
            }
        }
        return suma;
    }
    
}