/*

 */
package javatimeuno;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class JavaTimeUno {

    public static void main(String[] args) {
        
        LocalDateTime fecha = LocalDateTime.now();
        
        System.out.println(fecha);
         DateTimeFormatter frmFecha = DateTimeFormatter.ofPattern("E dd MM yy HH mm");
         String fechaFormateada = fecha.format(frmFecha);
         System.out.println(fechaFormateada);
     
         long mili = fecha.toEpochSecond(ZoneOffset.UTC);
        System.out.println(mili);
    }

}
