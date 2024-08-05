package poo23850demolambda;
public class POO23850DEMOSINLAMDATRADICIONAL implements IDibujable1 {
    int tam=10;
    public static void main(String[] args) {
		/*
		 * La clase POO23850DEMOSINLAMDATRADICIONAL implementa la interfaz IDibujable1 y
		 * proporciona una implementación concreta del método abstracto dibuja. Esta
		 * implementación imprime el valor de tam cuando se llama al método dibuja.
		 *
		 * IDibujable1 d1=new IDibujable1();
		 */
    }
    public  void dibuja() {
        System.out.println("Dibuja: "+tam);
    }
}
