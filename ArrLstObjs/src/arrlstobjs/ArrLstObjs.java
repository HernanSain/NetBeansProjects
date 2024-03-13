package arrlstobjs;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServMain;

public class ArrLstObjs {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ServMain sm = new ServMain();
        Alumno a = new Alumno();
        ArrayList<Alumno> al = new ArrayList<Alumno>();
        int ctrl = 0;
        int menu = 0;
        try {
            while (ctrl == 0) {
                System.out.println("1:Ingresar Alumnos; 2:Listar Alumnos; 3:Salir");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        al.add(sm.nuevoAlumno());
                        break;
                    case 2:
                        int elije =sm.listarAlumnosPor();
                        
                        break;
                    case 3:
                        ctrl = 1;
                        break;
                }
            }
        } catch (Exception e) {
            leer.nextLine();
        }
    }

}
