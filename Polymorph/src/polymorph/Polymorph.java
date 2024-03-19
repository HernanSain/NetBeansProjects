/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorph;

import entities.Animal;
import entities.Cat;
import entities.Pig;

/**
 *
 * @author John
 */
public class Polymorph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Pig p = new Pig();
        Animal c = new Cat();
        a.sonido();
        p.sonido();
        c.sonido();
    }

}
