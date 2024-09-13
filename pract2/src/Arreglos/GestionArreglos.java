package Arreglos;

public class GestionArreglos {
	//crea un programa que permite crear arreglos con metodos que carguen valores en el, lo muestre, que inserte valores por el orden de valores y por el
	//indice.
	public int[] arreglos;
    public GestionArreglos(int t){
        arreglos = new int[t];
    }
    public void carga(){
        for(int i=0; i<arreglos.length; i++){
            arreglos[i]=(int)(Math.random()*21);
        }
    }
    public void most(){
        for(int i=0;i<arreglos.length;i++){
            System.out.print(arreglos[i]+"\t")
        }
    }
    public void inserxord(int valor){
        int[] nuevo=new int[arreglos.length+1];
        boolean insertado=false;
        for(int i=0;i<arreglos.length;i++){
            if(valor<arreglos[i] && !insertado){
                insertado=true;
                nuevo[i]=valor;
            }else {
                nuevo[i+(insertado?1:0)]=arreglos[i];
            }
        } arreglos=nuevo;
    }
    public void insertxindice(int valor, int indice) throws ArrayIndexOutOfBoundsException{
        try{
            if(indice<0 || indice>arreglos.length) throw new ArrayIndexOutOfBoundsException("error: fuera de rango");
            int[] nuevo=new int[arreglos.length+1];
            for(int i=0,j=0;i<nuevo.length;i++){
                if(valor == i) nuevo[i]=valor;
                else nuevo[i] =arreglos[j++];
            } arreglos = nuevo;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
