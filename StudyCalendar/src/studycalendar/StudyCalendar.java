/*
Initaties two calendar objects and shows thier milliseconds and formated dates 
the first is the present time and the other is set 
Then substract de milliseconds and obteins the difference between the two dates
in days, hours, minutes and seconds
 */
package studycalendar;

import java.util.Calendar;
import java.util.Date;

public class StudyCalendar {

    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();//intance of objet calendar c with the present time default format
//        System.out.println("calendar fecha calendario calendario1 " + calendario1);//shows the object calendar c 
        System.out.println("milliseconds from the calendar object calendario1: " + calendario1.getTimeInMillis());
        Date fecha1 = calendario1.getTime();
        System.out.println("fecha Date de calendar " + fecha1);
        System.out.println(" milliseconds frome Date  " + fecha1.getTime());
        long mili1 = fecha1.getTime();
        /*Inicate another calendar and convert it to date usein calendar.getTime() methog*/
        Calendar calendario2 = Calendar.getInstance();//new instance o f calendar
        calendario2.set(2024, 2, 24, 20, 17);
        System.out.println("nueva fecha " + calendario2.getTime());
        Date g = calendario2.getTime();
        System.out.println("g " + g);
        System.out.println("fecha Date getTime()" + g.getTime());
        long mili2 = g.getTime();
        double diferencia = mili2 - mili1;
        int cantDias =(int) Math.round(diferencia / 86400000);
        System.out.println("dias " + cantDias);
        int resto =(int) Math.round(diferencia % 86400000);
        System.out.println("resto " + (resto));
        int cantHoras = Math.round(resto/3600000);
        System.out.println("horas "+cantHoras);
        ;

    }

}
