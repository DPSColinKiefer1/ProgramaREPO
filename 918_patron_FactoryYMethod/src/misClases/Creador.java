package misClases;
public abstract class Creador { //crea una clase abstracta llamada Creador, se hace abstracta para que las clases hijas puedan 
	//modificar sus metodos a conveniencia
    public abstract Producto factoryMethod();    // Método abstracto que debe ser implementado por las clases hijas. 
    public void realizarOperacion(){  // Método concreto que utiliza el retorno del método abstracto.
        Producto producto=factoryMethod();
        //este crea una variable de la clase Producto que almacenara el retorno de factoryMethod
        producto.usar(); //este llama al metodo "usar" de la clase Producto a la que los objetos de su tipo tienen permiso
    }
}
