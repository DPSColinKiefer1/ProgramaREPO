package misClases;
public class GestionDeArreglos {
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
    public GestionDeArreglos(int n) { //contructor de la clase, al ingresar un valor al parametro 
        miArreglo=new int [n]; //este creara el array con la longitud de ese valor ingresado
    }
    public void insertaelemxorden(int valor) {
        int[] nuevoArreglo=new int[miArreglo.length+1]; //crea un nuevoArreglo con la misma longitud que el anterior
        boolean insertado=false; //crea una variable insertado tipo boolean que nos ayudara a saber si un valor ya fue insertado o no previamente, al comienzo sera false
        for(int i=0;i<miArreglo.length;i++) { //recorre todos los bloques del arreglo ya hecho
        	if(valor<miArreglo[i] && !insertado) { //dado que los arreglos viene de mayor a menor entonces los elementos que son menores al parametros
        		//son saltados pero apenas vea uno que sea mayor o igual, entonces indica que debe insertarse
        		nuevoArreglo[i]=valor; //se inserta el valor en el nuevoArreglo en la posicion del anterior ya que es menor a este
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
        	if(valor>miArreglo[i] && !insertado) {
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
            if(indice<0 || indice>miArreglo.length) //verfica si el indice puesto en el parametro es accesible por el tamaño actual del arreglo
                  throw new ArrayIndexOutOfBoundsException("error: fuera de rango"); //si no saca esto
            int[] nuevoArreglo=new int[miArreglo.length+1]; //el nuevo arreglo que copiara las modificaciones, es un arreglo de tamanio +1 del viejo
            for(int i=0,j=0;i<nuevoArreglo.length;i++){ //recorre todos los bloques del nuevoArreglo, se crea tambien la variable j para recorrer el viejo
                if(indice==i) //si el indice es igual a la variable i entonces se inserta el valor del parametro en el actual bloque del nuevoArreglo
                	nuevoArreglo[i]=valor; //se le pone al nuevo arreglo el valor del parametro justo en la posicion del indice deseada por el if
                else nuevoArreglo[i]=miArreglo[j++]; //si no es el indice querido por el parametro entonces simplemente se lo copa el valor del viejo
                //en el arreglo nuevo. Es como que si tiene un arreglo de tamaño 5 como valor 3 5 5 1 2. Y le quiere poner el valor 10 al index 5.
                //entonces este va recurriendo los bloques y copiando los valores iguales ya que j++ permite que los valores de miArreglo se cambien
                //constantemente y nuevoArreglo por i tambien lo hace hasta que llega al index 5 donde ahi si nuevoArreglo ya no copia al viejo si no
                //que toma el valor del parametro y lo inserta en el nuevoArreglo. De este modo se pone el valor de 10 en el index 5. Pero cuando lo
                //se vuelve a repetir el index ahora con el index 6 donde al no incrementar j++ entonces se pone el valor del index 5 de viejo 
                //en el index 6 del nuevo arreglo permitiendo asi que no se reemplaza los valores de miArreglo y se siga con normalidad.
                //"j++ es para que no se repita el indice del viejo parametro ya que es el unico modo en el que j incrementa su valor"
            }
            miArreglo=nuevoArreglo;//copía el nuevoArreglo en el viejo
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