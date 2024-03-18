/*
Ejercicios de la guia 10 colecciones
 */
package services;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServAlumno {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> nuevoAlumno() {
        Alumno a = new Alumno();
        ArrayList<Alumno> al = new ArrayList<Alumno>();
            int edad = -1;
            String nombre = "";
        try {
            while (edad == -1) {
                System.out.println("Nombre: ");
                nombre = leer.next();
                System.out.println("Edad: ");
                edad = leer.nextInt();
                a.setNombre(nombre);
                a.setEdad(edad);
                al.add(a);
            }
        } catch (Exception e) {
            edad = -1;
            leer.nextLine();
        }
        return al;
    }

}
