package poo23850demohashmap;
import java.util.HashMap;
import java.util.Map;
public class POO23850DEMOhashmap {
    public static void main(String[] args) {
        //crear un HashMap
        HashMap<String,Integer> mihashmap = new HashMap<>();
        //insertar nuevos elementos
        mihashmap.put("Uno",1);
        mihashmap.put("Dos",2);
        mihashmap.put("Tres",3);
        mihashmap.put("Cuatro",4);
        //mostrar el HashMap completo
        System.out.println("HashMap: "+mihashmap);
        //acceder a un valor especifico
        int valor=mihashmap.get("Dos");
        System.out.println("El valor asociado a la clave 'Dos' es: "+valor);
        //verificar la existencia de una clave y un valor
        boolean existeClave = mihashmap.containsKey("Tres");
        boolean existeValor=mihashmap.containsValue(18);
        System.out.println("Existe la clave 'Tres'? "+existeClave);
        System.out.println("Extiste el valor 18 ? "+existeValor);
        //eliminar un elemento
        mihashmap.remove("Uno");
        System.out.println("HashMap despues eliminar clave Uno: \n"+mihashmap);
        //recorrer el HashMap
        System.out.println("Recorriendo el HashMap");
        for(Map.Entry<String,Integer>  entrada : mihashmap.entrySet()    ){
            System.out.println("Clave: "+entrada.getKey()+
                    "   Valor: "+entrada.getValue());
        }
    }
}
