package Matematicos;

import java.util.Scanner;

public class Precio_Con_Iva {
    private static final double IVA = 0.21;

    public static void precio_final(){
        double precio;
        System.out.println("Ingrese prescio del producto: ");
        Scanner iva = new Scanner(System.in);
        precio = iva.nextDouble();
        precio += precio * IVA;
        System.out.println("El precio final del producto con Iva incluido es de:  $" + precio + ".");
    }
}
