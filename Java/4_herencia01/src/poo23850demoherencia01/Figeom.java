/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo23850demoherencia01;

import java.util.Date;

/**
 *
 * @author C00301
 */
public class Figeom {
    private String color; private boolean relleno;private Date fechacrea;
    public Figeom() {
        this("gUinda",true);//color="gUinda";relleno=true;
        fechacrea=new Date();
    }
    public Figeom(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
        fechacrea=new Date();
    }

    @Override
    public String toString() {
        return "Figeom{" + "color=" + color + ", relleno=" + relleno +
                ", fechacrea=" + fechacrea + '}';
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the relleno
     */
    public boolean isRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    /**
     * @return the fechacrea
     */
    public Date getFechacrea() {
        return fechacrea;
    }
}
