package Main_Taller_Java;
import java.util.Scanner;

import static Matematicos.Area_Circulo.area_circulo;
import static Matematicos.Numero_MMI.mayor;
import static Matematicos.Numero_Mayor.numero_mayor;
import static Matematicos.Pares_Impares.par_impar;
import static Matematicos.Pares_Impares_F.par_impar_f;
import static Matematicos.Precio_Con_Iva.precio_final;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite el número correspondiente a la acción que desea realizar: ");
        System.out.println("0. Salir. ");
        System.out.println("1. Identificar el número mayor.");
        System.out.println("2. Identificar si un némero es mayor, menor o igual a otro.");
        System.out.println("3. Hallar el área de un círculo.");
        System.out.println("4. Calcular el precio de un producto con Iva incluido.");
        System.out.println("5. Indica cuáles son los números pares e impares del 1 al 100 (while).");
        System.out.println("6. Indica cuáles son los números pares e impares del 1 al 100 (for).");
        Scanner menu = new Scanner(System.in);
        int respuesta = menu.nextInt();

        switch (respuesta){
            case 0:{
                break;
            }
            case 1:{
                numero_mayor();
                break;
            }
            case 2:{
                mayor();
                break;
            }
            case 3:{
                area_circulo();
                break;
            }
            case 4:{
                precio_final();
                    break;
            }
            case 5:{
                par_impar();
                break;
            }
            case 6:{
                par_impar_f();
            }
        }

    }
}
