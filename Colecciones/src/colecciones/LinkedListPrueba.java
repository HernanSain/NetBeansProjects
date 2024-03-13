/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author John
 */
public class LinkedListPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        TreeSet<String> c = new TreeSet(cars);
        System.out.println(c);
    }

}
