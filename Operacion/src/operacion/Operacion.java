/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;
import servicios.ServiOpera;

/**
 *
 * @author John
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiOpera so = new ServiOpera();
        try {
            int A = so.leeNumeroA();
            int B = so.leeNumeroB();
            so.calcula(A,B);
            
        } catch (Exception e) {
            System.out.println("debe ser un entero vuelva a intentarlo");
        }

    }

}
