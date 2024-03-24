/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicies;

import hashmapstudy.Capital;
import hashmapstudy.Pais;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author John
 */
public class ServiHash {
    public HashMap<String,String> iniciaEnums(HashMap<String,String> cc){
                
        Pais p1 = Pais.Argentina;
        Capital c1 = Capital.Buenos_Aires;
        cc.put(p1.name(), c1.name());

        Pais p2 = Pais.Bolivia;
        Capital c2 = Capital.La_Paz;
        cc.put(p2.name(), c2.name());

        Pais p3 = Pais.Brasil;
        Capital c3 = Capital.Brasilia;
        cc.put(p3.name(), c3.name());

        Pais p4 = Pais.Paraguay;
        Capital c4 = Capital.Asunción;
        cc.put(p4.name(), c4.name());

        Pais p5 = Pais.Uruguay;
        Capital c5 = Capital.Montevideo;
        cc.put(p5.name(), c5.name());

        return cc;
    }
    public void listaHash(HashMap<String,String> cc){
                for (Map.Entry<String, String> entry : cc.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);

        }
    }
}
