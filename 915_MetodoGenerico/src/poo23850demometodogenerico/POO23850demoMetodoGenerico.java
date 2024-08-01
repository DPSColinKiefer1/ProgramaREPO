package poo23850demometodogenerico;
public class POO23850demoMetodoGenerico {
    public static void main(String[] args) {
        Integer[] enteros={1,2,3,4,5};
        String[] cadenas={"hUgo","paco","lUis","jesUs","maria","jose"};
        Character[] caracteres={'U','s','a'};
        imprime(enteros);
        imprime(cadenas);
        imprime(caracteres);
    }
    public static <E> void imprime(E[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println();
    }
}
