/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Collections_3 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        String[] nombre = new String[10];
        nombre[0]="pepe montesiori";
        nombre[1]="alejandro vantermole";
        nombre[2]="maria de los antos";
        nombre[4]="victorio erbeta";
        nombre[9]="rosario";
        nombre[5]="facultad de ciencias";
        nombre[6]="felipe de la edit";
        nombre[7]="sorete empolvado";
        nombre[8]="dos gardenias";
        nombre[3]="zorro gris";
        System.out.println("lista sin ordenar");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+nombre[i]);
        }
//convierte el array en arraylist
ArrayList<String> an = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            an.add(nombre[i]);
        }
        System.out.println("lista ordenada mediante Collections");
        Collections.sort(an);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(an.get(i));
//        }
        System.out.println("listad usando iterator");
        Iterator lit = an.iterator();
        for (Iterator<String> iterator = an.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
            
        }
    }

}
