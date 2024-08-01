package misClases;
public class CreadorConcretoB extends Creador{
    public Producto factoryMethod() {
        return new ProductoConcretoB();
    }
}