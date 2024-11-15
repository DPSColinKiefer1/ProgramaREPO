/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo23850demotodoparte;

import MisClases.*;


/**
 *
 * @author c00301
 */
public class POO23850demoTODOPARTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante e1=new Estudiante();
       e1.setCodigo(1);
       Nombre hu=new Nombre("hugo");
       e1.setNombre(hu);
       Estudiante e2=new Estudiante(2,new Nombre("paco"));
        System.out.println(e1+"\n"+e2);
    }
    
}
