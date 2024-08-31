package misClases;
public class CreadorConcretoB extends Creador{
    public Producto factoryMethod() { //lo mismo que A
    	//usa el metodo abstracto que al invocarse crea un objeto de la clase ProductoConcretoB
    	//lo define para que este metodo retorne el objeto de la clase ProductoConcretoB
        return new ProductoConcretoB();
    }
}