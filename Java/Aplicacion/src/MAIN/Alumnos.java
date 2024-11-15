package MAIN;

public abstract class Alumnos {
	String nombre;
	int edad;
	int cursos;
	double []  notas= new double[5];
	
	public abstract void mostrarDetalles();
	public abstract double calcularNotas();
	
	public Alumnos(String nombre, int edad, int cursos, double[] notas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cursos = cursos;
		this.notas = notas;
	}
	
}
