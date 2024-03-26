/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author John
 */
public class ArrayListPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //inserta en posicion 2 citroen
        cars.add(2, "Citroen");
        
        //uso de iterador para mostrar todo el araaylist

        Iterator ic = cars.iterator();
        while(ic.hasNext()){
            System.out.println(ic.next());
        }
        //ordenamos mediante Collections
        System.out.println("lista ordenada");
        Collections.sort(cars);
        Iterator it2 = cars.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
