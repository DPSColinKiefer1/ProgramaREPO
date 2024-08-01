package misClases;
public abstract class Creador {
    public abstract Producto factoryMethod();
    public void realizarOperacion(){
        Producto producto=factoryMethod();
        producto.usar();
    }
}
