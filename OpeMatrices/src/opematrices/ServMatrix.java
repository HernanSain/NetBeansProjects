/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opematrices;

import java.util.Scanner;

public class ServMatrix {

    static Scanner leer = new Scanner(System.in);

    public int[][] llenaMatrixA(int filas, int columnas) {
        int[][] A = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int ctrl = 0;

                while (ctrl == 0) {
                    try {
                        System.out.println("Input an integer");
                        A[i][j] = leer.nextInt();
                        ctrl = 1;

                    } catch (Exception e) {
                        ctrl = 0;
                        leer.nextLine();
                        System.out.println("must be an integer");
                    }
                }

            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(A[i][j]+ " ");
            }System.out.println("");
        }
        return A;
    }
}
