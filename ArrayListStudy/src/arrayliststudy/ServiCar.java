/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServiCar {

    static Scanner leer = new Scanner(System.in);

    public String ingreseMarca() {
        String marca = leer.nextLine();
        return marca;
    }

    public void listaMarcas(ArrayList<String> cars) {
        Iterator it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        for (Iterator<String> iterator = cars.iterator(); iterator.hasNext();) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i)+" ");
//        }
    }

    public ArrayList<String> cambia(ArrayList<String> cars) {
        listaMarcas(cars);
        System.out.println("marca a cambiar:");
        String borrar = leer.nextLine();
        System.out.println("cambiar por ");
        String borrar2 = leer.nextLine();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals(borrar)) {
                cars.set(i, borrar2);
            }
        }
        return cars;
    }

    public ArrayList<String> borra(ArrayList<String> cars) {
        listaMarcas(cars);
        System.out.println("marca a borrar:");
        String borrar = leer.nextLine();
        for (String x : cars) {
            if (x.equals(borrar)) {
                cars.remove(x);
            }
        }

        return cars;
    }

}
