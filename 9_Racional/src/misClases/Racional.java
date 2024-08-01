package misClases;
public class Racional  extends Number implements Comparable<Racional>{
    private long numerador=0;
    private long denominador=1;
    public Racional() {
        this(0,1);
    }
    public Racional(   long numerador,   long denominador   ) {
        long mcd=mcd(numerador,denominador);
        this.numerador=  ((denominador > 0) ? 1 : -1) * numerador / mcd  ;
        this.denominador=Math.abs(denominador) / mcd;
    }
    private long mcd(long n,long d){
        long n1=Math.abs(n);
        long n2=Math.abs(d);
        int mcd=1;
        for(int k=1;k<=n1 && k<=n2;k++){
            if(n1 % k==0 && n2 % k==0) mcd=k;
        }
        return mcd;
    }

    public long getNumerador() {
        return numerador;
    }

    public long getDenominador() {
        return denominador;
    }

    
    

    @Override
    public int intValue() {
        return (int)doubleValue();
    }
    @Override
    public long longValue() {
        return (int)doubleValue();
    }
    @Override
    public float floatValue() {
        return (float)doubleValue();
     }
    @Override
    public double doubleValue() {
         return numerador * 1.0 / denominador;
    }
    public Racional add(Racional segundoRacional){
        long n=numerador*segundoRacional.getDenominador() +
                denominador*segundoRacional.getNumerador();
        long d=denominador*segundoRacional.getDenominador();
        return new Racional(n,d);
    }
    public Racional substract(Racional segundoRacional){
        long n=numerador*segundoRacional.getDenominador() -
                denominador*segundoRacional.getNumerador();
        long d=denominador*segundoRacional.getDenominador();
        return new Racional(n,d);
    }
   public Racional multiply(Racional segundoRacional){
        long n=numerador*segundoRacional.getNumerador();
        long d=denominador*segundoRacional.getDenominador();
        return new Racional(n,d);
    }
   public Racional divide(Racional segundoRacional){
        long n=numerador*segundoRacional.getDenominador();
        long d=denominador*segundoRacional.getNumerador();
        return new Racional(n,d);
    }

    @Override
    public String toString() {
        if(denominador==1) return numerador + "";
        else  return numerador + "/"+denominador;
    }
   
    @Override
    public int compareTo(Racional o) {
        if(this.substract(o).getNumerador() > 0) return 1;
        else  if(this.substract(o).getNumerador() < 0) return -1;
        else  return 0;
    }
    
}
