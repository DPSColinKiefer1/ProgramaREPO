package misClases;
public class Singleton {
//singleton es un patron de diseño
	/*
	 * Un patron de diseño es una herramienta generica que es capaz de solucionar problemas genericos. Es como una guia que se puede implementar en un
	 * programa para solucionar un problema particular y que sirve en muchos casos.
	 */
	/*
	 * Singleton es un patron de diseño que se basa en la creacion de una clase que solo puede existir una vez. La idea de este patron es que solo exista 
	 * una instancia 
	 */
    private static Singleton instancia; //Este variable mantiene la única instancia de la clase Singleton, es una variable de clase Singleton.
    //se crea este atributo para usarlo luego, tiene que ser de tipo Singleton y tiene que ser Static para que sea accesible para todos los objetos.(o al unico, mejor
    //dicho)
    private Singleton() { //Constructor de la clase. Esta clase solo puede existir una vez y tiene un constructor privado para que no se pueda instanciar.
//    	Si omites el constructor en una clase en Java, el compilador automáticamente proporcionará un constructor público predeterminado.
    }
    public static Singleton getInstancia(){ //Este metodo devuelve la instancia de la clase Singleton, al ser invocado realiza la creacion de una nueva instancia.
        if(instancia == null){ //Si la instancia no ha sido creada, crea una nueva instancia. Esto se hace al verificar que la variable instancia sea nula, osea,
        	//que no haya sido creada con anterioridad, si lo esta, no crea una nueva instancia y si no la crea.
            instancia=new Singleton(); //vuelve al atributo instancia un nuevo objeto de la clase Singleton, es un instancia de la clase Singleton.
        }
        return instancia; //la retorna, permitienda solo un tipo de instanciacion de una clase
    }
    public void mostrarMensaje(){ //Este metodo muestra el mensaje de hola mundo. Es de prueba.
        System.out.println("!Hola desde Singleton");
    }
}