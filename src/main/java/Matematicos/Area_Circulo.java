package Matematicos;

import java.util.Scanner;

public class Area_Circulo {
    public static void area_circulo() {

        double radio;
        double area;
        System.out.println("Ingrese el radio del circulo: ");
        Scanner a = new Scanner(System.in);
        radio = a.nextDouble();
        area = Math.PI* Math.pow(radio,2);
        System.out.println("El área del circulo de radio " + radio + " es: " + area);
        }
}
