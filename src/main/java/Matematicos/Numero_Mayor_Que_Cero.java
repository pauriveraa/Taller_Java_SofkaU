package Matematicos;

import java.util.Scanner;

public class Numero_Mayor_Que_Cero {
    public static void mayor_que_cero(){
        double numero;
        do{
            System.out.println("Ingrese un número: ");
            Scanner num = new Scanner(System.in);
            numero = num.nextDouble();
        }
        while(numero <= 0);
        System.out.println("El número " + numero + " es mayor que cero");
    }
}
