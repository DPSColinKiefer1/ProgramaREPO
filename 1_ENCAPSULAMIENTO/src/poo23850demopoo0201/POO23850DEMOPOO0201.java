package poo23850demopoo0201;
public class POO23850DEMOPOO0201 {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnon();
        tv1.setCanal(30);
        tv1.setNivelvolumen(3);
        TV tv2=new TV();
        tv2.turnon();
        tv2.subirCanal();
        tv2.subirCanal();
        tv2.subirNivelvolumen();
        System.out.println(tv1+"\n"+tv2);
        System.out.println("--toString() del Object-----");
        Object o=new Object();
        System.out.println(o);
//        System.out.println("TV { canal="+tv1.getCanal()+
//                " ,volumen="+tv1.getNivelvolumen()+
//                " ,encendido="+tv1.isOn()+" }");
//        System.out.println("TV { canal="+tv2.getCanal()+
//                " ,volumen="+tv2.getNivelvolumen()+
//                " ,encendido="+tv2.isOn()+" }");
    } 
}
