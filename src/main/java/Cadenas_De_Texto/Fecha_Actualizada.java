package Cadenas_De_Texto;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Fecha_Actualizada {
    public static void fecha(){
        Date dateNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd '-' HH:mm:ss");

        System.out.println("Fecha actual: " + ft.format(dateNow));
    }
}