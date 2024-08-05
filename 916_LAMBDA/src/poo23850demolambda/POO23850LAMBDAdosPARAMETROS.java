package poo23850demolambda;
public class POO23850LAMBDAdosPARAMETROS {
    public static void main(String[] args) {
        ISumable sum1=(a,b) -> (a+b); //declara una variable llamada sum1 de la interfas ISumable a la cual se le da una expresion lambda a su metodo abstracto
//"suma" que tiene dos parametros "a" y "b", a este metodo se le dice gracias a esta expresion que al invocarse se sume la "a" y la "b" (a+b)
        System.out.println(sum1.suma(10,20)); // Llama al método suma de sum1 con los argumentos 10 y 20, devolviendo 30.
        
        ISumable sum2=(int a,int b) -> (a+b); //lo mismo que arriba, pero definiendo explicitamente los tipos de los parametros del metodo, 
		/*
		 * Especificar los tipos de los parámetros en una expresión lambda no es siempre
		 * necesario, pero puede ser útil en situaciones donde se necesita mayor
		 * claridad, se deben resolver ambigüedades, o se sigue una convención de
		 * codificación específica. La elección entre dejar que el compilador infiera
		 * los tipos o especificarlos explícitamente depende del contexto y las
		 * necesidades del proyecto
		 */
        System.out.println(sum2.suma(100,200));
        
        ISumable sum3=(int a,int b) -> { //lo mismo que arriba pero en este caso se usa un bloque de codigo(este entre corchetes) y se usa un retorno.
        	//Aunque de igual forma los anteriores tambien retornan la suma correspondiente de forma automatica, aqui esta mas implicita y te da mas seguridad
             return (a+b);
        };
        System.out.println(sum3.suma(1000,2000));
    }
}
