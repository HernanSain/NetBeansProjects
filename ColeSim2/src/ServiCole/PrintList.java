/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiCole;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintList {

    public void printList(ArrayList<String> lst) {
        Iterator it = lst.iterator();
        int cont = 1;
        int c = lst.size();
        while (it.hasNext()) {
            System.out.print(it.next() + "-");
            cont++;
            if (cont > c) {
                System.out.println("");
                cont = 1;
            }
        }
    }
}
