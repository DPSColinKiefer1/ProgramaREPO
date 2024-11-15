package misClases;
public class Pollo extends Animal 
        implements Comestible{
    public  String sonido(){
        return "pollo: COCOROCOO";
    }
    public String comoseCome() {
        return "pollo: a la braza";
    }
}
