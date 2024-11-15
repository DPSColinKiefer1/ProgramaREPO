package poo23850demoarraylistgenerics;
import java.util.ArrayList;
import misClases.Persona;
public class POO23850demoarraylistGENERICS {
    public static void main(String[] args) {
        //Crear un ArrayList de Persona
        ArrayList<Persona> gente=new ArrayList<> ();
        //agregar elementos al ArrayList
        gente.add(new Persona("hUgo",29));
        gente.add(new Persona("paco",28));
        gente.add(new Persona("lUis",39));
        //imprimir los elementos del ArrayList
        System.out.println("Lista de Personas:");
        for(Persona  persona : gente   )
            System.out.println(persona);
        //Accesar a un elememento en particUlar
        Persona primerapersona=gente.get(0);
        System.out.println("Primera persona en la lista: "+
                primerapersona);
        //Modificar un elemento
        gente.set(1, new Persona("Ana",23));
        //imprimir los elementos del ArrayList
        System.out.println("Lista de Personas despUes de modificar:");
        for(Persona  persona : gente   )
            System.out.println(persona);
        //Eliminar un elemento
        gente.remove(2);
        //imprimir los elementos del ArrayList
        System.out.println("Lista de Personas despUes de eliminar:");
        for(Persona  persona : gente   )
            System.out.println(persona);
    }   
}
