package poo54263casointegradorhastasemana9;
public class JefeArea extends Jefe 
            implements Contratacion {
    public JefeArea(double bonoPorLiderazgo, String nombre, String apellido, 
                 int edad, double salarioBase) {
        super(bonoPorLiderazgo, nombre, apellido, 
                edad, salarioBase);
    }
    public double calcularSalario() {
        return salarioBase+bonoPorLiderazgo;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+calcularSalario());
        System.out.println("Bono por Liderazgo: "+bonoPorLiderazgo);
    }
    public void contratarEmpleado() {
        System.out.println("Jefe de Area: " +nombre+" "+apellido+
                " ha contrado a un empleado");
    }
    public void despedirEmpleado() {
        System.out.println("Jefe de Area: " +nombre+" "+apellido+
                " ha despedido a un empleado");
    }
}
