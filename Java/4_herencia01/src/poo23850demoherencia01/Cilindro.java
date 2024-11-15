/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo23850demoherencia01;

/**
 *
 * @author c00301
 */
public class Cilindro extends Circulo{
    private double altUra;
    public Cilindro() {
        this(1);
    }
    public Cilindro(double altUra) {
        this.altUra = altUra;
    }

    public Cilindro(double altUra, double radio, String color, boolean relleno) {
        super(radio, color, relleno);
        this.altUra = altUra;
    }
    @Override
    public double getArea(){
        return 2*super.getArea()+2*Math.PI*super.getRadio()*altUra;
    }

    @Override
    public String toString() {
        return "Cilindro{" +super.toString()+ "altUra=" + altUra + '}';
    }
    
    

    /**
     * @return the altUra
     */
    public double getAltUra() {
        return altUra;
    }

    /**
     * @param altUra the altUra to set
     */
    public void setAltUra(double altUra) {
        this.altUra = altUra;
    }
}
