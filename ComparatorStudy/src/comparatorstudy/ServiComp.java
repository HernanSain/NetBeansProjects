/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorstudy;

import entities.Gente;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author John
 */
public class ServiComp {

    public void ordenaGente(ArrayList<Gente> g) {

        for (Iterator<Gente> iterator = g.iterator(); iterator.hasNext();) {
            Gente next = iterator.next();
            System.out.println(next.getNombre() + " " + next.getEdad());
        }
    }

    public void ordenaPorNombre(ArrayList<Gente> g) {

        g.sort(cn);
        ordenaGente(g);
    }
    public static Comparator<Gente> cn = new Comparator<Gente>() {
        @Override
        public int compare(Gente g1, Gente g2){
            return g1.getNombre().compareTo(g2.getNombre());
        }
    };
    
    
}
