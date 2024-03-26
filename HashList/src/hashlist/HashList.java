/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashlist;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author John
 */
public class HashList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(15, "hernan");
        hm.put(456, "juan");
        hm.put(5,"vivivane");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
            
        }
    }

}
