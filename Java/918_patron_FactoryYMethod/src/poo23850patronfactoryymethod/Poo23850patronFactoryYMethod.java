package poo23850patronfactoryymethod;
import misClases.*;
public class Poo23850patronFactoryYMethod {
    public static void main(String[] args) {
    	Creador creadorA=new CreadorConcretoA(); //
    	creadorA.realizarOperacion();
    	Creador creadorB=new CreadorConcretoB();
    	creadorB.realizarOperacion();    	
    }
}
