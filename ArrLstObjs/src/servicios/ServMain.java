/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ServMain {

    static Scanner leer = new Scanner(System.in);

    public Alumno nuevoAlumno() {
        Alumno a = new Alumno();
        int ctrl = 0;

        while (ctrl == 0) {
            try {
                System.out.println("Nombre:");
                a.setNombre(leer.next());
                System.out.println("Edad (en números)");
                a.setEdad(leer.nextInt());
                ctrl = 1;
            } catch (Exception e) {
                System.out.println("La edad debe estar en numeros enteros");
                leer.nextLine();
                ctrl = 0;
            }
        }
        return a;
    }

    public int listarAlumnosPor() {
        int elije = 0;
        try {
            while (elije == 0) {
                System.out.println("1:por nombre; 2:por edad; 3:salir");
                elije = leer.nextInt();
                switch (elije) {
                    case 1:
                        elije = 1;
                        break;
                    case 2:
                        elije = 2;
                        break;
                    case 3:
                        elije = 3;
                        break;
                    default:
                        elije = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("must enter an integer");
            elije = 0;
            leer.nextLine();
        }
        return elije;
    }

    public void listaAlumnosPorNombre(ArrayList<Alumno> al) {
        System.out.println("lista alumnos por nombre");
    }

    public void listaAlumnosPorEdad(ArrayList<Alumno> al) {
        System.out.println("lista alumnos por edad");
    }
    
}
