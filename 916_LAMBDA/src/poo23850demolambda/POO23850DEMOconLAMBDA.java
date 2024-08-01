package poo23850demolambda;
public class POO23850DEMOconLAMBDA {
    public static void main(String[] args) {
        int tam=20;
        IDibujable1 d2=() -> { 
            System.out.println("Dibuja: "+tam);
        };
        d2.dibuja();
    }
}
