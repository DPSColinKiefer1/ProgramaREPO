package poo54263casointegradorhastasemana9;
public abstract class Empleado {
    protected  String nombre;
    protected String apellido;
    protected int edad;
    protected double salarioBase;

    public Empleado(String nombre, String apellido, 
            int edad, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
