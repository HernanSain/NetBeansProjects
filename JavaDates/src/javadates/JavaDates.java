/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.Year;

public class JavaDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year y = Year.now();
        System.out.println(y);
        System.out.println("LocalDate " + LocalDate.now());
        System.out.println("localTime " + LocalTime.now());
        System.out.println("LocalDateTime " + LocalDateTime.now());
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter F = DateTimeFormatter.ofPattern("MM-dd-yyy E HH-mm");
        String ff = fecha.format(F);
        System.out.println(ff);
        Calendar cc = Calendar.getInstance();
        System.out.println(cc.getTime().getYear() + 1900);
        int x = cc.getTime().getMonth();
        String mes = "";
        switch (x) {
            case 0:
                mes = "ene";
                break;
            case 1:
                mes = "feb";
                ;
                break;
            case 2:
                mes = "mar";
                break;
            case 3:
                mes = "abr";
                break;
            case 4:
                mes = "may";
                break;
            case 5:
                mes = "jun";
                break;
            case 6:
                mes = "jul";
                break;
            case 7:
                mes = "ago";
                break;
            case 8:
                mes = "set";
                break;
            case 9:
                mes = "oct";
                break;
            case 10:
                mes = "nov";
                break;
            case 11:
                mes = "dic";
                break;

        }
        System.out.println(mes);
     

    }
}
