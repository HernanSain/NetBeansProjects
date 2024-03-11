/*
creo un arreglo de dimension 5 de tipo entero y pruebo errores
 */
package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int ctrl=0;
        while(ctrl==0){
        try {
        System.out.println("write in an Integer, 99:salir");
        int n = leer.nextInt();
        myArray[0] = n;
        System.out.println("myArray[0] "+myArray[0]); 
        if(n==99){
            ctrl=1;
        }
        } catch (InputMismatchException e) {
            System.out.println("must be an integer");
            leer.nextLine();
        }
            
        }

    }

}
