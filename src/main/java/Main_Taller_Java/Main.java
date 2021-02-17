package Main_Taller_Java;
import java.util.Scanner;

import static Cadenas_De_Texto.Dia_Laboral.laboral;
import static Cadenas_De_Texto.Eliminar_Espacios.elimina_espacios;
import static Cadenas_De_Texto.Reemplazar_Caracter.reemplaza;
import static Matematicos.Area_Circulo.area_circulo;
import static Matematicos.Numero_MMI.mayor;
import static Matematicos.Numero_Mayor.numero_mayor;
import static Matematicos.Numero_Mayor_Que_Cero.mayor_que_cero;
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
        System.out.println("7. Confirma si un número es mayor a cero.");
        System.out.println("8. Verifica si un día de la semana es laboral o no.");
        System.out.println("9. Reemplaza la vocal (a) por (e).");
        System.out.println("10. Elimina espacios entre palabras.");
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
                break;
            }
            case 7:{
                mayor_que_cero();
                break;
            }
            case 8:{
                laboral();
                break;
            }
            case 9:{
                reemplaza();
                break;
            }
            case 10:{
                elimina_espacios();
                break;
            }
            default:{
                System.out.println("No ingresó una opción correcta.");
            }
        }

    }
}
