package poo23850demolambda;
public class POO23850LAMBDAconUNparametro {
    public static void main(String[] args) {
        IMensajero2 s2=(nombre) -> {
            return "Eres Crema, "+nombre;
        };
        System.out.println(s2.mensaje(" Javier"));
    }
}
