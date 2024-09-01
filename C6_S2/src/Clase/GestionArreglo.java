package Clase;
public class GestionArreglo {
	private static int[] miArreglo; //se hace un arreglo privado(osea que no se puede acceder a el sin getters o setter) y de tipo statica, osea, que este arreglo se
	//comparte con todos los objetos de la clase
	public void cargaInicial () { //se crea un funcion que no retorna nada
		for(int i=0;i<miArreglo.length;i++) { //este recorre todos los bloques dependiendo el tamaño de miArreglo
			miArreglo[i]=2*i+1; //se le asigna al bloque de turno todos los numeros impares a hasta que termine los bloques, de forma ascendente. Esto sale por la multipli
			//cación 2 y la suma de 1 al valor de "i" de turno, por ende, siempre sale un numero impar y por ende siempre sera el siguiente del anterior
		}
	}
	public void cargaInicialDES () {//otra funcion parecido al anterior
		for(int i=0;i<miArreglo.length;i++) {
			miArreglo[i]=2*(9-i)+1; //en vez de asignarle un valor impar de forma ascendente, lo hace forma descendente
		}
	}
    public GestionArreglo(int n) { //contructor de la clase, al ingresar un valor al parametro 
        miArreglo=new int [n]; //este creara el array con la longitud de ese valor ingresado
    }
    public void insertaelemxorden(int valor) { //función sin retorno con parametro donde se debe ingresar un entero
        int[] nuevoArreglo=new int[miArreglo.length+1]; //crea un nuevoArreglo con la misma longitud que el anterior
        boolean insertado=false; //crea una variable insertado tipo boolean que nos ayudara a saber si un valor ya fue insertado o no previamente, al comienzo sera false
        for(int i=0;i<miArreglo.length;i++) { //recorre todos los bloques del arreglo ya hecho
        	if(valor<miArreglo[i] && !insertado) { //si el valor es mayor al valor del bloque de turno y si aun no se ha insertado, osea, si la variable insertada es dife
        		//rente a true
        		nuevoArreglo[i]=valor; //si es asi entonces toma el valor del bloque del arreglo recien hecho con el valor recien ingresado
        		insertado=true; //y cambia el valor de la variable insertada a true para que no se vuelva a inserta ese valor ya que ya sera true y no se cumplira el if
        		i--; //se reduce el valor de i para que al terminar el bucle se sume +1 y vuelva de nuevo al valor de i previamente ingresada, pero ahora al haber cambia-
        	//do el insertado y el valor de i es igual al valor entonces no se cumple las condiciones y pasa a...
        	}else { //lo siguiente 
        		nuevoArreglo[i+(insertado?1:0)]=miArreglo[i]; //
        		//[i+(insertado?1:0)] es el que da que bloque asignar el valor, es la i de turno mas 1 o 0, si el valor de insertado es true entonces el valor se suma +1
        		//para que de este modo el valor recien insertado este en el bloque de i, mientras que en el blqoue siguiente se le copia el valor del bloque i pero del 
        		//arreglo primero. Para que se hace esto? Para que al insertar un nuevo valor este tome el valor donde sea mayor que numeros menores que el pero menor a
        		//numeros mayores, osea, un orden, al este tomar ese valor entonces se necesita que los numeros mayores tome un bloque despues del que tenian, por ende
        		//tiene que tomar su bloque i pero +1 para que sigan un orden. Pero si no fue insertado entonces se suma +0, osea, el valor del bloque del nuevoArreglo
        		//Sera igual igual que el anterior ya que no se ingreso un nuevo valor aun y no cambia al resto su orden
        	}
        }
        miArreglo=nuevoArreglo; //se le asigna esta nuevo arreglo con el valor recien ingresado al viejo arreglo
    }
    public void insertaelemxordenDES(int valor) { //
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

    
    public void insertaelemxindice(int valor,int indice)  //al ingresar
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
