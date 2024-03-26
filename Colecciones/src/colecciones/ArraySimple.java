/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author John
 */
public class ArraySimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] loco = new String[5];
        loco[0] = "pepe";
        loco[1] = "tito";
        loco[2] = "nena";
        loco[3] = "tita";
        loco[4] = "beba";
//        for (int i = 0; i < loco.length; i++) {
//            System.out.println(loco[i]);
//        }
        ArrayList<String> al = new ArrayList();
        for (int i = 0; i < loco.length; i++) {
            al.add(loco[i]);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println();
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
           if(al.get(i).equals("beba")){
               System.out.println("beba esta en la lista");
           } 
        }
    }
    
   
}
