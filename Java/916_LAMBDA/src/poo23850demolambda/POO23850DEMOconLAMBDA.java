package poo23850demolambda;
public class POO23850DEMOconLAMBDA {
    public static void main(String[] args) {
		/*
		 * Este es un método principal que inicializa una variable tam con el valor 20 y usa
		 * una expresión lambda para implementar el método dibuja de una interfaz
		 * funcional IDibujable1, la cual imprime "Dibuja: 20" cuando se llama a
		 * d2.dibuja(), demostrando cómo las expresiones lambda permiten una
		 * implementación concisa de métodos de interfaces funcionales en Java.
		 */        
    	//lambda es una expresión que implementa un método de una interfaz funcional de forma rapida y sencilla
    	//para usarla se debe tener una interfaz funcional implementada con solo un método abstracto que sera el metodo que se quiere llamar de forma
    	//automatica
    	int tam=20;
        IDibujable1 d2=() -> { //aqui se implementa la expresión lambda, todo el contenido entre parentesis es el cuerpo de la lambda o del metodo
            System.out.println("Dibuja: "+tam);
        };
        d2.dibuja(); //se invoca al metodo con la expresión lambda
    }
}
