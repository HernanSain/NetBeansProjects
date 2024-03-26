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
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServiHash {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, String> iniciaEnums(HashMap<String, String> cc) {

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

    public void listaHash(HashMap<String, String> cc) {
//        HashMap<Integer, String> ih = new HashMap<Integer, String>();
        int contador = 1;
        for (Map.Entry<String, String> algo : cc.entrySet()) {
            String key = algo.getKey();
            String value = algo.getValue();
            System.out.println(contador + " " + key + " "+value);
            contador++;

        }
    }

    public void elijo(HashMap<String, String> cc) {
        String pais = "";
        listaHash(cc);
        int n = 0;
        while (n == 0) {
            try {
                System.out.println("elija un pais por numero. Salir:99");
                n = leer.nextInt();
                String respuesta = "";
                switch (n) {
                    case 1:
                        System.out.println("la capital de Brasil es:");
                        respuesta = leer.next();
                        if (respuesta.equals("Brasilia")) {
                            System.out.println("correcto");
                        } else {
                            System.out.println("incorrecto");
                        }
                        n = 0;
                        break;
                    case 2:
                        System.out.println("la capital de Argentina es:");
                        respuesta = leer.next();
                        if (respuesta.equals("Buenos_Aires")) {
                            System.out.println("correcto");
                        } else {
                            System.out.println("incorrecto");
                        }
                        n = 0;
                        break;
                    case 3:
                        System.out.println("la capital de Uruguay es:");
                        respuesta = leer.next();
                        if (respuesta.equals("Montevideo")) {
                            System.out.println("correcto");
                        } else {
                            System.out.println("incorrecto");
                        }
                        n = 0;
                        break;
                    case 4:
                        System.out.println("la capital de Bolivia es:");
                        respuesta = leer.next();
                        if (respuesta.equals("La_Paz")) {
                            System.out.println("correcto");
                        } else {
                            System.out.println("incorrecto");
                        }
                        n = 0;
                        break;
                    case 5:
                        System.out.println("la capital de Paraguay es:");
                        respuesta = leer.next();
                        if (!respuesta.equals("Asunción")) {
                            System.out.println("incorrecto");
                        } else {
                            System.out.println("correcto");
                        }
                        n = 0;
                        break;
                    case 99:
                        n = 1;
                        break;
                }
            } catch (Exception e) {
                leer.nextLine();
            }
        }

    }
}
