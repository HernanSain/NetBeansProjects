nn/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import entidades.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author John
 */
public class ArrayListDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Alumno a = new Alumno();
        ArrayList<Alumno> A = new ArrayList();
        a.setNombre("Pepe");
        a.setEdad(19);
        A.add(a);
        //--------------------------------------
        Alumno a1 = new Alumno();
        a1.setNombre("Toto");
        a1.setEdad(21);
        A.add(a1);
        //----------------------------------
        Alumno a2 = new Alumno();
        a2.setNombre("Pepa");
        a2.setEdad(17);
        A.add(a2);
        //--------------------------------
        Alumno a3 = new Alumno();
        a3.setNombre("Pipo");
        a3.setEdad(22);
        A.add(a3);

        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i).getNombre() + " " + A.get(i).getEdad());
        }
        A.sort(ca);
        System.out.println();
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i).getNombre() + " " + A.get(i).getEdad());
        }

    }
    public static Comparator<Alumno> ca = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            if (a1.getEdad() < a2.getEdad()) {
                return -1;
            } else if (a1.getEdad() > a2.getEdad()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
}
