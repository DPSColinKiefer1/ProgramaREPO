package poo23850patronsingleton;
import misClases.Singleton;
public class POO23850PATRONSINGLETON {
    public static void main(String[] args) {
        Singleton misingleton=Singleton.getInstancia(); //no se crea por medio del contructor, si no que por medio del metodo getInstancia, que crea la instancia
        //usando la variable de "instancia"
        misingleton.mostrarMensaje(); //muestra !Hola desde Singleton, como si fuera un objeto normal de la clase.
        //Eso si, ya que es un singleton de la clase Singleton, no se podra crear mas objetos de esta clase, solo este
    }
}