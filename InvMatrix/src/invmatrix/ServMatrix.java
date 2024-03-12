/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invmatrix;

/**
 *
 * @author John
 */
public class ServMatrix {

    public int[][] creaMatrix(int filas, int columnas) {
        int[][] A = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                A[i][j] = (int) Math.round(Math.random() * 9);
            }
        }
        return A;
    }

    public void imprimeMatrix(int[][] A, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public int[][] transpuesta(int[][]A,int filas, int columnas){
        int[][]B = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              B[i][j]=A[j][i];
            }
        }
    return B;
    }
        public void imprimeMatrixB(int[][] B, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
