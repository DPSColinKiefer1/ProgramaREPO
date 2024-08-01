package poo23850demolambda;
public class POO23850LAMBDAdosPARAMETROS {
    public static void main(String[] args) {
        ISumable sum1=(a,b) -> (a+b);
        System.out.println(sum1.suma(10,20));
        
        ISumable sum2=(int a,int b) -> (a+b);
        System.out.println(sum2.suma(100,200));
        
        ISumable sum3=(int a,int b) -> {
             return (a+b);
        };
        System.out.println(sum3.suma(1000,2000));
    }
}
