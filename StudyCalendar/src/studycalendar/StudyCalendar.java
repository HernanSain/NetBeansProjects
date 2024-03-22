/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studycalendar;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author John
 */
public class StudyCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fc = Calendar.getInstance();//intance of objet calendar c with the present time default format
        System.out.println("calendar fecha calendario fc " + fc);//shows the object calendar c 
        System.out.println("milliseconds from the calendar object fc: " + fc.getTimeInMillis());
                Date fechaCalendario = fc.getTime();
        System.out.println("fecha Date de calendar " + fechaCalendario);
        System.out.println("fecha calendario milliseconds "+fechaCalendario.getTime());

////        Calendar d = Calendar.getInstance();//new instance o f calendar
////        d.set(2025, 3, 21, 21, 5);
////        System.out.println("nueva fecha " + d.getTime());
////        Date g = d.getTime();
////        System.out.println("g "+g);
////        System.out.println("fecha Date getTime()"+g.getTime());
    }

}
