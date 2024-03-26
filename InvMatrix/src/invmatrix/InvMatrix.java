/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invmatrix;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class InvMatrix {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 0;
        int ctrl = 0;
        while (ctrl == 0) {
            try {
                System.out.println("enter number of rows/columns max 6");
                number = leer.nextInt();
                ctrl = 1;
                if (number > 6 || number < 1) {
                    ctrl = 0;
                }
            } catch (Exception e) {
                leer.nextLine();
            }
        }
        int filas = number;
        int columnas = number;

        ServMatrix sm = new ServMatrix();
        int[][] A = sm.creaMatrix(filas, columnas);
        sm.imprimeMatrix(A, filas, columnas);
        int[][]B = sm.transpuesta(A, filas, columnas);
        System.out.println("transpuesta:");
        sm.imprimeMatrixB(B, filas, columnas);
    }

}
