/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.dominio;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class ServiCurso {

    Scanner leer = new Scanner(System.in);

    public Curso nuevoCurso() {
        Curso c = new Curso();
        c.setCurso(leer.next());
        return c;
    }
}
