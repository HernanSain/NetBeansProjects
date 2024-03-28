/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorstudy;

import entities.Gente;
import java.util.ArrayList;
//import java.util.Comparator;

/**
 *
 * @author John
 */
public class ComparatorStudy {

//    public static Comparator<Gente> cn = (Gente g1, Gente g2) -> g2.getNombre().compareTo(g1.getNombre());

    public static void main(String[] args) {
        ArrayList<Gente> g = new ArrayList<Gente>();
        Gente t1 = new Gente();
        t1.setEdad(25);
        t1.setNombre("Pepe");
        g.add(t1);

        Gente t2 = new Gente();
        t2.setEdad(32);
        t2.setNombre("George");
        g.add(t2);

        Gente t3 = new Gente();
        t3.setEdad(28);
        t3.setNombre("Silvie");
        g.add(t3);

        Gente t4 = new Gente();
        t4.setEdad(35);
        t4.setNombre("Leopoldo");
        g.add(t4);

        Gente t5 = new Gente();
        t5.setEdad(35);
        t5.setNombre("Analia");
        g.add(t5);
        
        ServiComp sc = new ServiComp();
        sc.ordenaGente(g);
        
        System.out.println("");
        
        sc.ordenaPorNombre(g);
        
        System.out.println("");
        sc.ordenaPorEdad(g);

    }

}
