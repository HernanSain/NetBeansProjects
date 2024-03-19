/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

import entities.Automovil;
import entities.Camion;

/**
 *
 * @author John
 */
public class Interface2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil a = new Automovil();
        Camion c = new Camion();
        a.estableceTipo();
        a.estableceMarca();
        c.estableceTipo();
        c.estableceMarca();
    }

}
