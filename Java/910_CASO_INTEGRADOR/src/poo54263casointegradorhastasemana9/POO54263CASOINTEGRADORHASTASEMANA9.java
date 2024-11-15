package poo54263casointegradorhastasemana9;
public class POO54263CASOINTEGRADORHASTASEMANA9 {
    public static void main(String[] args) {
        // instanciar empleado usando polimorfismo
        Empleado e1=new EmpleadoNormal("Hugo","Lee",65,7000);
        Contratacion c1=new EmpleadoNormal("Lizardo","Silva",61,5000);
        Jefe j1=new JefeArea(5500,"Juan","Palacios",41,12000);
        e1.mostrarDetalles();
        c1.contratarEmpleado();
        c1.despedirEmpleado();
        j1.mostrarDetalles();
    }
    
}
