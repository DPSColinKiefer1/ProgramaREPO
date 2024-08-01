package poo23850demoasociacion;
public class POO23850DEMOasociacion {
    public static void main(String[] args) {
        Curso c1=new Curso("POO");
        Curso c2=new Curso("Base de Datos");
        c1.addEstudiante("Aaron Baquerizo");
        c1.addEstudiante("li ku");
        c1.addEstudiante("kung fu");
        c2.addEstudiante("Aaron Baquerizo");
        c2.addEstudiante("li ku");
        String[] estudiantes=c1.getEstudiantes();
        for(int i=0;i<c1.getNumeroEstudiantes();i++)
            System.out.print(estudiantes[i]+", ");
        System.out.println();
        System.out.println("numero de estudiantes: "+
                c1.getNumeroEstudiantes());
    }
    
}
