package Cadenas_De_Texto;

import java.util.Scanner;

public class Eliminar_Espacios {
    public static void elimina_espacios(){
        String frases;
        System.out.println("Ingrese una frase: ");
        Scanner frase = new Scanner(System.in);
        frases = frase.nextLine();
        frases = frases.replaceAll(" ","");
        System.out.println(frases);
    }
}
