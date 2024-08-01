package poo54263demoracional;

import misClases.Racional;

public class POO54263DEMORacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(4,2);
        Racional r2 = new Racional(2,3);
        System.out.println(r1+" + "+r2+" = "+r1.add(r2));
        System.out.println(r1+" - "+r2+" = "+r1.substract(r2));
        System.out.println(r1+" * "+r2+" = "+r1.multiply(r2));
        System.out.println(r1+" / "+r2+" = "+r1.divide(r2));
        System.out.println(r2+" es "+r2.doubleValue());
        
    }
    
}
