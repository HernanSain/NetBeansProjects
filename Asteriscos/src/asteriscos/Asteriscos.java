/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
* *
* *
* * * *
 */
package asteriscos;
import java.util.Scanner;
public class Asteriscos {
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Dibujo d = new Dibujo();
        Scanner leer = new Scanner(System.in);
        int lados = 0;
        System.out.println("ingrese cantidad de lados");
        lados = leer.nextInt();
        d.cuadrado(lados);
    }

}
