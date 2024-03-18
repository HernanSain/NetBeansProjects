/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author John
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Citroen");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println();
ArrayList<String> ac = new ArrayList<String>(cars);
Collections.sort(ac);
        for (int i = 0; i < ac.size(); i++) {
            System.out.println(ac.get(i));
        }
    }

}
