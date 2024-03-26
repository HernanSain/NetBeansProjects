/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedliststudy;

import java.util.LinkedList;

/**
 *
 * @author John
 */
public class LinkedListStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> marcas2 = new LinkedList();
        Marcas m1 = Marcas.Citroen;
        marcas2.add(m1.name());
        Marcas m2 = Marcas.Ford;
        marcas2.add(m2.name());
        Marcas m3 = Marcas.Mercedes_Benz;
        marcas2.add(m3.name());
        Marcas m4 = Marcas.Rolls_Roice;
        marcas2.add(m4.name());
        Marcas m5 = Marcas.Vols_Wagen;
        marcas2.add(m5.name());

        for (String string : marcas2) {
            System.out.println(string);
        }
        System.out.println("linkedList Methods");
        marcas2.addFirst("Kia");
        System.out.println("addFirst Method");
        System.out.println("");
        for (String string : marcas2) {
            System.out.println(string);
        }
        
        System.out.println("addLast method");
        marcas2.addLast("Toyota");
        System.out.println("");
        for (String string : marcas2) {
            System.out.println(string);
        }
    }
}
