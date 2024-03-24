/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapstudy;

import Servicies.ServiHash;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    
    public static void main(String[] args) {
        HashMap<String, String> cc = new HashMap<String, String>();
        ServiHash sh = new ServiHash();
        sh.iniciaEnums(cc);
        sh.listaHash(cc);

    }
    
}
