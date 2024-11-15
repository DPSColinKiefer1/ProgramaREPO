/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author c00301
 */
public class Estudiante {
    private int codigo;
    private Nombre nombre;

    public Estudiante() {
    }

    public Estudiante(int codigo, Nombre nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public Nombre getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
    
}
