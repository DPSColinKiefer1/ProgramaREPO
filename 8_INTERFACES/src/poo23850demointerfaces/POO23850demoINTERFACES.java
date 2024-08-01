package poo23850demointerfaces;
import misClases.*;
public class POO23850demoINTERFACES {
    public static void main(String[] args) {
        Object[] objetos={new Tigre(),new Pollo(),new Naranja()};
        for(int i=0;i<objetos.length;i++){
            if(objetos[i] instanceof Comestible)
                System.out.println(       (       (Comestible)objetos[i]).comoseCome()         );
             if(objetos[i] instanceof Animal)
                System.out.println(       (       (Animal)objetos[i]).sonido()         );
        }
    }
}
