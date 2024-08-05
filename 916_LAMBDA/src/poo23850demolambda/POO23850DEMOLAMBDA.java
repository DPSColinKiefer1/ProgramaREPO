package poo23850demolambda;
public class POO23850DEMOLAMBDA {
    public static void main(String[] args) {
        int tam=10;
        IDibujable1 d=new IDibujable1(){ //se le asigna una funciona al metodo abstracto de la interfaz IDibujable1, para luego invocarla
            public void dibuja(){ System.out.println("Dibuja: "+tam);}
        };
        d.dibuja();
    }
}
