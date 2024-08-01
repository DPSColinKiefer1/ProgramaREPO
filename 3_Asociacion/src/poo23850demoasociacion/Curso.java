package poo23850demoasociacion;
public class Curso {
    private String nombreCurso;
    private String[] estudiantes=new String[10];
    private int numeroEstudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void addEstudiante(String estudiante){
        estudiantes[numeroEstudiantes]=estudiante;
        numeroEstudiantes++;
    }
        
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String[] getEstudiantes() {
        return estudiantes;
    }
    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
}
