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
        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1:Ingresar Alumnos; 2:Listar Alumnos; 3:Salir");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        al.add(sm.nuevoAlumno());
                        menu = 0;
                        break;
                    case 2:
                        menu = 0;
                        int elije = sm.listarAlumnosPor();
                        switch (elije) {
                            case 1:
                                sm.listaAlumnosPorNombre(al);
                                break;
                            case 2:
                                sm.listaAlumnosPorEdad(al);
                                break;
                        }
                        break;
                    case 3:
                        menu = 1;
                        break;
                    default:
                        menu = 0;
                }
            } catch (Exception e) {
                menu = 0;
                leer.nextLine();
            }
        }

    }
}
