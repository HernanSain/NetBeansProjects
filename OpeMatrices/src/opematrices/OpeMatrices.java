/*
Suma de matrices
Dadas dos matrices de la misma dimensión, A=(aij) y B=(bij), se define la matriz suma como: A+B=(aij+bij).
La matriz suma se obtienen sumando los elementos de las dos matrices que ocupan la misma misma posición. 
 */
package opematrices;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class OpeMatrices {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //inserta cantidad de filas y columnas
        int filas = 0;
        int columnas = 0;
        int ctrl = 0;
        while (ctrl == 0) {
            try {
                System.out.println("Input files/columns number");
                filas = leer.nextInt();
                columnas = filas;
                ctrl = 1;
            } catch (Exception e) {
                leer.nextLine();
                System.out.println("must be  an integer");
            }
        }

        ServMatrix sm = new ServMatrix();
        int[][] A = sm.llenaMatrixA(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] B = sm.llenaMatrixB(filas, columnas);
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] C = sm.sumaMatrixes(A, B, filas, columnas);
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
