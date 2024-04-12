/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colesim;

/**
 *
 * @author john
 */
public class Literal {

    public String literal(int accion, int tabla)  {
        String dupla = "Ingrese opcion ";
        int opcion;

        switch (accion) {
            case 1:
            switch(tabla){
                case 1:
                    dupla="Nuevo Curso";
                    break;
                case 2:
                    dupla="Nuevo Profesor";
                    break;
                case 3:
                    dupla="Nuevo Estudiante";
                    break;
            }    
                break;
            case 2:
                            switch(tabla){
                case 1:
                    dupla="Lista  Curso";
                    break;
                case 2:
                    dupla="Lista  Profesor";
                    break;
                case 3:
                    dupla="Lista  Estudiante";
                    break;
            }
                break;
            case 3:
                            switch(tabla){
                case 1:
                    dupla="Modifica Curso";
                    break;
                case 2:
                    dupla="Modifica Profesor";
                    break;
                case 3:
                    dupla="Modifica Estudiante";
                    break;
            }
                break;
        }
        return dupla;
   }
    

public String literalTabla(int tabla){
        String ltTabla="";
        switch(tabla){
            case 1:
                ltTabla="cursos";
                break;
            case 2:
                ltTabla="profesores";
                break;
            case 3:
                ltTabla="estudiantes";
                break;
                
        }
        return ltTabla;
    }
        public String literalAccion(int accion){
        String ltAccion="";
        switch(accion){
            case 1:
                ltAccion="Cursos";
                break;
            case 2:
                ltAccion="Profesores";
                break;
            case 3:
                ltAccion="Estudiantes";
                break;
                
        }
        return ltAccion;
    }
}
