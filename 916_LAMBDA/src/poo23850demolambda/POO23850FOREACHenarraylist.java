package poo23850demolambda;
import java.util.*;
public class POO23850FOREACHenarraylist {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("hUgo");lista.add("paco");
        lista.add("lUis");lista.add("jesUs");
        lista.add("maria");lista.add("jose");
        lista.forEach(
           (n) -> System.out.println(n)
        );
    }
}
