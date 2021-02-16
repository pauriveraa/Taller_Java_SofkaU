package Matematicos;

import java.util.Scanner;

public class Numero_MMI {

    public static void mayor() {
        double x = 0;
        double y = 0;
        System.out.println("ingrese el primer número a comparar: ");
        Scanner primero = new Scanner(System.in);
        x = primero.nextDouble();
        System.out.println("ingrese el segundo número a comparar: ");
        Scanner segundo = new Scanner(System.in);
        y = segundo.nextDouble();

        if (x > y) {
            System.out.println("El numero " + x + " es " + "mayor que " + y + ".");
        } else if (x < y) {
            System.out.println("El numero " + x + " es " + "menor que " + y + ".");
        } else {
            System.out.println(x + " es igual a " + x + ".");
        }
    }
}
