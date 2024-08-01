package poo23850demolambda;
public class POO23550demoNOPARMETROS {
    public static void main(String[] args) {
        IMensajero s=() -> {
            return "No te digo nada";
        };
        System.out.println(s.mensaje());
    }
    
}
