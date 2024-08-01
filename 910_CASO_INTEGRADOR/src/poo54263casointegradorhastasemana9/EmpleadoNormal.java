package poo54263casointegradorhastasemana9;
public class EmpleadoNormal extends Empleado 
        implements Contratacion      {

    public EmpleadoNormal(String nombre, String apellido, 
            int edad, double salarioBase) {
        super(nombre, apellido, edad, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+calcularSalario());
        
    }

    @Override
    public void contratarEmpleado() {
        System.out.println("Empleado: "+nombre+" "+apellido+
                " ha sido contratado");
    }

    @Override
    public void despedirEmpleado() {
        System.out.println("Empleado: "+nombre+" "+apellido+
                " ha sido despedido");
    }
    
    
    
}
