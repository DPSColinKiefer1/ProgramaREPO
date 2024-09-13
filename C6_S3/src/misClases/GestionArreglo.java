package misClases;

public class GestionArreglo {
    public int[] miArreglo;
    public GestionArreglo(int tamanio) {
        miArreglo=new int[tamanio];
        for( int i=0 ; i < miArreglo.length ; i++  )
            miArreglo[i]=(int)(Math.random()*21);
    }
    /**
     * método que compara el arreglo actual con otro
     * @param otroArreglo
     * @return true si los arreglos son iguales, false en otro caso
     */
    public boolean compararArreglo(int[]  otroArreglo){
        if(miArreglo.length != otroArreglo.length) return false;
         for( int i=0 ; i < miArreglo.length ; i++  ) {
             if( miArreglo[i] != otroArreglo[i]) return false;
         }
         return true;
    }
    public int[] getArreglo() {
    	return miArreglo;
    }
    public int[] fusionarArreglo(int[]  otroArreglo){
        int[] fusion=new int[miArreglo.length+otroArreglo.length ];
         for( int i=0 ; i < miArreglo.length ; i++  ) 
             fusion[i]=miArreglo[i];
         for( int i=0 ; i < otroArreglo.length ; i++  ) 
             fusion[miArreglo.length+i]=otroArreglo[i];
        return fusion;
    }
    public void mostrarArreglo(){
        for(int i=0;i<miArreglo.length;i++){
            System.out.print(miArreglo[i]+" ");
        }
        System.out.println();
    }
}
