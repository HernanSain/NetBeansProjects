/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetstudy;

import java.util.HashSet;

/**
 *
 * @author John
 */
public class HashSetStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet();
        ServHash sh = new ServHash();
        sh.iniciaEnums(cars);
        sh.listaCars(cars);
//        cars.add("Ford_T");
//        cars.add("Vols_Wagen_Lux");
//        System.out.println("");
//        sh.listaCars(cars);
        System.out.println(cars.contains("Vols_Wagen"));
        cars.remove("Rolls_Roice");
        sh.listaCars(cars);
    }

}
