package poo23850demolambda;
public class POO23850LAMBDAconUNparametro {
    public static void main(String[] args) {
        IMensajero2 s2=(nombre) -> { //al metodo mensaje de la interfaz IMensajero2 se le asigna una expresión lambda, el metodo acepta un parámetro 
        	//de tipo String y devuelve un String
        //IMensajero2 s2: Declara una variable s2 de tipo IMensajero2.
		//s2: Se le asigna a la variable s2 una expresión lambda que acepta un parámetro de tipo String y devuelve un String.
		//() -> { }: Es el cuerpo de la lambda, que se ejecuta cuando se invoca al método accept de la interfaz Consumer.
        //(nombre): Define el parámetro de la lambda. En este caso, nombre es un String que representa el parámetro de la expresión lambda.
            return "Eres Crema, "+nombre; //devuelve un String con el valor de nombre concatenado con "Eres Crema" 
        };
        System.out.println(s2.mensaje(" Javier")); // Llama al método mensaje de s2 con el argumento " Javier". La expresión lambda se ejecuta, retornando la cadena 
        //"Eres Crema, Javier"
    }
}
