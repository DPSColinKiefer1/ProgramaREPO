package misClases;
public class CreadorConcretoA extends Creador{
    public Producto factoryMethod() {
        return new ProductoConcretoA();
    }
}
