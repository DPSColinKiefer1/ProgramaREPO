package poo23850demometodogenerico;
public class POO23850demoMetodoGenerico {
    public static void main(String[] args) {
    	/* Cuando defines Integer[], String[] o Character[], estás creando
		 * arrays cuyos elementos son de esos tipos específicos. Esto significa
		 * que los arrays solo pueden contener valores del tipo especificado.
		 */
		Integer[] enteros = { 1, 2, 3, 4, 5 }; 
        String[] cadenas={"hUgo","paco","lUis","jesUs","maria","jose"};
        Character[] caracteres={'U','s','a'};
        imprime(enteros); //imprime(enteros);: Llama al método para imprimir el array de enteros.
        imprime(cadenas); //imprime(cadenas);: Llama al método para imprimir el array de cadenas.
        imprime(caracteres); //imprime(caracteres);: Llama al método para imprimir el array de caracteres.
    }
    public static <E> void imprime(E[] lista){ //Declara el método como genérico. E es un parámetro de tipo genérico que puede representar cualquier tipo de dato
    	//En este caso, cual array que se le pase como parámetro, se imprime, no importa su tipo.
    	//"void imprime(E[] lista)": Define el método imprime que toma un array de tipo genérico E y no devuelve ningún valor (void).
        for(int i=0;i<lista.length;i++){ // Itera sobre cada elemento del array
            System.out.print(lista[i]+" "); // Imprime el elemento actual separado por un espacio
        }
        System.out.println(); // Imprime un salto de línea despues de imprimir todos los elementos
    }
}
