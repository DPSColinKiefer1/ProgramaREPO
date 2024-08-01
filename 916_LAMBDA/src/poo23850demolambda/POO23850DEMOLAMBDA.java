package poo23850demolambda;
public class POO23850DEMOLAMBDA {
    public static void main(String[] args) {
        int tam=10;
        IDibujable1 d=new IDibujable1(){
            public void dibuja(){ System.out.println("Dibuja: "+tam);}
        };
        d.dibuja();
    }
}
