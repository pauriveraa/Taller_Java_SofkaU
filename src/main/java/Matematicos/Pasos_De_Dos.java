package Matematicos;

import java.util.Scanner;

public class Pasos_De_Dos {
    public static void pasos(){
        int num = 0;
        System.out.println("Ingrese un número: ");
        Scanner numero = new Scanner(System.in);
        num = numero.nextInt();
        while(num < 1000){
            System.out.println("Número: " + num);
            num += 2;
        }
    }
}
