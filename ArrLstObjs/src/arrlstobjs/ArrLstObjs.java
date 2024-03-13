
package arrlstobjs;

import java.util.Scanner;
import servicios.ServMain;

public class ArrLstObjs {

static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        ServMain sm = new ServMain();
        int ctrl = 0;
        int menu =0;
        try {
            while (ctrl==0){
                System.out.println("1:Ingredsar Alumnos; 2:Listar Alumnos; 3:Salir");
                menu=leer.nextInt();
                switch(menu){
                    case 1:
                     sm.nuevoAlumno();
                     break;
                    case 2:
                        break;
                    case 3:
                        ctrl=1;
                        break;
                }
            }
        } catch (Exception e) {
        leer.nextLine();
        }
    }
    
}
