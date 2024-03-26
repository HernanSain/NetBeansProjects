/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author John
 */
public class HashMapPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-----------------------------------------------------
        HashMap<String, Integer> ed = new HashMap<String, Integer>();
        ed.put("Juan", 32);
        ed.put("Pedro", 25);
        ed.put("Marina", 18);
        ed.put("Susana", 16);
        ed.put("Ana", 37);
        ed.put("Bety", 28);
        for (Map.Entry<String, Integer> entry : ed.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("nombre: " + key + " edad " + value);
        }
        System.out.println();
        TreeMap<Integer, String> edTree = new TreeMap();
        System.out.println(edTree);

    }


}
