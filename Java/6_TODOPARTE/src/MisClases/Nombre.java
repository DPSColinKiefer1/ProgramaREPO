/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author c00301
 */
public class Nombre {
    private String nombre;

    public Nombre() {
    }

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre{" + "nombre=" + nombre + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
