package misClases;
public class Singleton {
    private static Singleton instancia;
    private Singleton() {
        //constructor privado para evitar la instanciacion
    }
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia=new Singleton();
        }
        return instancia;
    }
    public void mostrarMensaje(){
        System.out.println("!Hola desde Singleton");
    }
}