/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_2;

import entities.Alumno;
import java.util.ArrayList;
import services.ServAlumno;

/**
 *
 * @author John
 */
public class Collections_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServAlumno sv = new ServAlumno();
        ArrayList<Alumno> alocal = sv.nuevoAlumno();
    }

}
