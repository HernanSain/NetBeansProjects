/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.Scanner;

public class ServMain {
    static Scanner leer = new Scanner(System.in);
    public Alumno nuevoAlumno(){
            Alumno a = new Alumno();
            int ctrl=0;
            try {
            while(ctrl==0){
            System.out.println("Nombre:");
            a.setNombre(leer.next());
            System.out.println("Edad (en números)");
            a.setEdad(leer.nextInt());
            ctrl=1;
            }            
        } catch (Exception e) {
                System.out.println("La edad debe estar en numeros enteros");
                ctrl=0;
                leer.nextLine();
        }
            return a;
    }
        
}
