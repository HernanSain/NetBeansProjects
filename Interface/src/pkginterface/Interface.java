/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import entities.Cat;
import entities.Dog;

/**
 *
 * @author John
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.print("Dog ");
        d.animalSound();
        d.animalRun();
    }

}
