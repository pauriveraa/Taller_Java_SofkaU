package Cadenas_De_Texto;

import java.util.Locale;
import java.util.Scanner;

public class Reemplazar_Caracter {
    public static void reemplaza(){
        String temp = "";
        String frase = "La sonrisa sera la mejor arma contra la tristeza, ";
        frase = frase.replace('a','e');
        System.out.println("Complemente la frase: La sonrisa sera la mejor arma contra la tristeza, ");
        Scanner complemento = new Scanner(System.in);
        temp = complemento.nextLine();
        temp= temp.toLowerCase();
        frase += temp;
        System.out.println(frase + ".");
    }
}
