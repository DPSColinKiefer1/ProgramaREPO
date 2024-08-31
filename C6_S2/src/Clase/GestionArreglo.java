package Clase;
public class GestionArreglo {
	private static int[] miArreglo;
	public void cargaInicial () {
		for(int i=0;i<miArreglo.length;i++) {
			miArreglo[i]=2*i+1;
		}
	}
	public void cargaInicialDES () {
		for(int i=0;i<miArreglo.length;i++) {
			miArreglo[i]=2*(9-i)+1;
		}
	}
    public GestionArreglo(int n) {
        miArreglo=new  int [n];
    }
    public void insertaelemxordenDES(int valor) {
        int[] nuevoArreglo=new int[miArreglo.length+1];
        boolean insertado=false;
        for(int i=0;i<miArreglo.length;i++) {
        	if(valor<miArreglo[i] && !insertado) {
        		nuevoArreglo[i]=valor;
        		insertado=true;
        		i--;
        	}else {
        		nuevoArreglo[i+(insertado?1:0)]=miArreglo[i];
        	}
        }
        miArreglo=nuevoArreglo;
    }

    public void insertaelemxorden(int valor) {
        int[] nuevoArreglo=new int[miArreglo.length+1];
        boolean insertado=false;
        for(int i=0;i<miArreglo.length;i++) {
        	if(valor<miArreglo[i] && !insertado) {
        		nuevoArreglo[i]=valor;
        		insertado=true;
        		i--;
        	}else {
        		nuevoArreglo[i+(insertado?1:0)]=miArreglo[i];
        	}
        }
        miArreglo=nuevoArreglo;
    }
    public void insertaelemxindice(int valor,int indice)  
             throws ArrayIndexOutOfBoundsException {
        try{
            if(indice<0 || indice>miArreglo.length)
                  throw new ArrayIndexOutOfBoundsException("error: fuera de rango");
            int[] nuevoArreglo=new int[miArreglo.length+1];
            for(int i=0,j=0;i<nuevoArreglo.length;i++){
                if(indice==i) nuevoArreglo[i]=valor;
                else nuevoArreglo[i]=miArreglo[j++];
            }
            miArreglo=nuevoArreglo;
        }catch(ArrayIndexOutOfBoundsException   e ){
            System.out.println(e.getMessage());
        }
    }
    public void mostrar(){
        for(int i=0;i<miArreglo.length;i++)  {
            System.out.print(miArreglo[i]+" ");
        }
        System.out.println();
    }
}
