package poo54263casointegradorhastasemana9;
public abstract class Jefe extends Empleado {
    protected double bonoPorLiderazgo;

    public Jefe(double bonoPorLiderazgo, String nombre, 
            String apellido, int edad, double salarioBase) {
        super(nombre, apellido, edad, salarioBase);
        this.bonoPorLiderazgo = bonoPorLiderazgo;
    }
    
    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
    public double getBonoPorLiderazgo() {
        return bonoPorLiderazgo;
    }

    public void setBonoPorLiderazgo(double bonoPorLiderazgo) {
        this.bonoPorLiderazgo = bonoPorLiderazgo;
    }
}
