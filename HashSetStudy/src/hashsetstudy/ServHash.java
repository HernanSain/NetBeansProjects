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
public class ServHash {

    public HashSet<String> iniciaEnums(HashSet<String> cars) {
        Marcas m1 = Marcas.Citroen;
        cars.add(m1.name());
        Marcas m2 = Marcas.Ford;
        cars.add(m2.name());
        Marcas m3 = Marcas.Mercedes_Benz;
        cars.add(m3.name());
        Marcas m4 = Marcas.Rolls_Roice;
        cars.add(m4.name());
        Marcas m5 = Marcas.Vols_Wagen;
        cars.add(m5.name());
        return cars;
    }

    public void listaCars(HashSet<String> cars) {
        for (String car : cars) {
            System.out.println("car " + car);
        }

    }
}
