package Cadenas_De_Texto;

import java.util.Locale;
import java.util.Scanner;

public class Dia_Laboral {
    public static void laboral(){
        String dia;
        System.out.println("Ingrese un día de la semana: ");
        Scanner labo = new Scanner(System.in);
        dia = labo.nextLine();
        dia = dia.toLowerCase();

        switch (dia){
            case "domingo":{
                System.out.println("El " + dia + " no es un día laboral.");
                break;
            }
            default:{
                System.out.println("El " + dia + " es un día laboral.");
            }
        }

    }
}
