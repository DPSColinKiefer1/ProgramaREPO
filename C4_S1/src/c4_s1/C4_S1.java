/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4_s1;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class C4_S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m={{1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2},
                {1,2,3,1,2}};
        mostrarMatriz(m);
        int [][] matrizTriSup=convierteTriSup(m);
        System.out.println("-------------------");
        mostrarMatriz(convierteTriSup(matrizTriSup));

    }
    public static void mostrarMatriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
    public static int[][] convierteTriSup(int[][] m){
        int[][] matResult = m; //esta copia el contenido de la matriz del parametro en esta nueva matriz
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                if(i > j) matResult[i][j]=0;
        }
        return matResult;
    }
}
