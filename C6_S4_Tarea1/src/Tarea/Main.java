package Tarea;

public class Main {
	public static void main(String[] args) {
		/*
		 * Se tiene una matriz de 12 filas por 19 columnas y se desea encontrar todos sus elementos negativos y 
		 * para que les cambie ese valor negativo por un cero.
		 */
		int columna=19;
		int fila=12;
		int [][] m1= new int[fila][columna];
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				m1[i][j]=(int)(Math.random()*100)-50;
			}
		}
		imp(m1);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		int[][] cero=m1;
		imp(retornZero(cero));
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		NegaPosi(m1);
	}
	public static int[][] retornZero(int[][] m){
		int zero[][]=new int[m.length][m[0].length];
		for(int i=0; i < zero.length;i++) {
			for(int j =0; j<zero[0].length;j++) {
				zero[i][j]=m[i][j] < 0 ? 0: m[i][j];
			}
		}
		return zero;
	}
	public static void NegaPosi(int[][] m) {
		int cont = 0;
		for(int i=0; i < m.length;i++) {
			for(int j =0; j<m[0].length;j++) {
				if(m[i][j]<0) {
					System.out.print("Negativo ");
					cont+=1;
				}
				else {
					System.out.print("Positivo ");
				}
			} System.out.println(" ");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("El numer total de negativos es: "+cont);

	}
	public static void imp(int[][] m) {
		//Imprime los valores de la tabla
				for(int i=0; i < m.length;i++) {
					for(int j =0; j<m[0].length;j++) {
						System.out.print(m[i][j]+"\t"+ "|");
					}
					System.out.println( );
				}
	}
}
