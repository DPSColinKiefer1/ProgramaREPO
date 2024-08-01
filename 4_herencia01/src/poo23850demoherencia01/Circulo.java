/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo23850demoherencia01;

/**
 *
 * @author C00301
 */
public class Circulo extends Figeom{
    private double radio;
    public Circulo() {
        this(1);//radio=1;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{"+super.toString() + "\n\t\tradio=" + radio 
                +" , area="+this.getArea()+ '}';
    }
    public double getArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
