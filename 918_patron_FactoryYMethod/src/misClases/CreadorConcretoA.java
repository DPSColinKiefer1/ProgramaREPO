package misClases;
public class CreadorConcretoA extends Creador{ //implementa los metodos de la clase padre
    public Producto factoryMethod() { //usa el metodo abstracto que al invocarse crea un objeto de la clase ProductoConcretoA
        return new ProductoConcretoA();
    }
}
