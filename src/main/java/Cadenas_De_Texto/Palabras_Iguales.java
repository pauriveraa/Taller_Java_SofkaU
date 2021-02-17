package Cadenas_De_Texto;

import java.util.Scanner;

public class Palabras_Iguales {
    public static void iguales(){
        String primero;
        String segundo;
        System.out.println("Ingrese una primera palabra: ");
        Scanner primera = new Scanner(System.in);
        primero = primera.nextLine();
        System.out.println("Ingrese una segunda palabra: ");
        Scanner segunda = new Scanner(System.in);
        segundo = segunda.nextLine();

        if(primero.length() == segundo.length()){
            if(primero.equals(segundo)){
                System.out.println("Las palabras" + primero + " y " + segundo + " son iguales.");
            }
            else {
                for (int i = 0; i < primero.length(); i++) {
                        if (primero.charAt(i) != segundo.charAt(i)) {
                            System.out.println(" Las palabras no coinciden en la posición: " + i );
                            System.out.println("Donde se tiene "+ primero.charAt(i) + " en vez de " + segundo.charAt(i));
                        }
                }
            }
        }
        else{
            System.out.println("Las palabras no son iguales.");
        }
    }
}
