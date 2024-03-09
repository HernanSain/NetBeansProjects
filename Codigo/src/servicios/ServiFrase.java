/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author John
 */
public class ServiFrase {

    public void codifica(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            String x = frase.substring(i, i + 1);
            switch (x) {
                case "a":
                    x = "@";
                    break;
                case "e":
                    x = "#";
                    break;
                case "i":
                    x = "&";
                    break;
                case "o":
                    x = "%";
                    break;
                case "u":
                    x = "?";
                    break;
            }
//            System.out.print(x);
            resultado = resultado.concat(x);

        }
        System.out.println(resultado);
        System.out.println("");
    }

}
