package Main_Taller_Java;
import java.util.Scanner;

import static Cadenas_De_Texto.Dia_Laboral.laboral;
import static Cadenas_De_Texto.Eliminar_Espacios.elimina_espacios;
import static Cadenas_De_Texto.Fecha_Actualizada.fecha;
import static Cadenas_De_Texto.Longitud_Frase.long_frase;
import static Cadenas_De_Texto.Palabras_Iguales.iguales;
import static Cadenas_De_Texto.Reemplazar_Caracter.reemplaza;
import static Matematicos.Area_Circulo.area_circulo;
import static Matematicos.Numero_MMI.mayor;
import static Matematicos.Numero_Mayor.numero_mayor;
import static Matematicos.Numero_Mayor_Que_Cero.mayor_que_cero;
import static Matematicos.Pares_Impares.par_impar;
import static Matematicos.Pares_Impares_F.par_impar_f;
import static Matematicos.Pasos_De_Dos.pasos;
import static Matematicos.Precio_Con_Iva.precio_final;
import static Menu.Cinematografico.cinematografico;

public class Main {
    public static void main(String[] args) {
        boolean opcion = true;
        do{
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
            System.out.println("11. Determinar longitud de una frase y cantidad de vocales en esta.");
            System.out.println("12. Diferencias entre dos palabras po frases.");
            System.out.println("13. Consulta fecha y hora actual.");
            System.out.println("14. Ingrese número para imprimir con saltos de 2 en dos hasta llegar a 1000");
            System.out.println("15. Mostrar menú Gestión cinematográfica.");
            System.out.println("16. ");
            System.out.println("17. Electrodomésticos.");
            System.out.println("18. Videojuegos y series");
            Scanner menu = new Scanner(System.in);
            int respuesta = menu.nextInt();

            switch (respuesta){
                case 0:{
                    opcion = false;
                    break;
                }
                case 1:{
                    numero_mayor();
                    opcion = true;
                    break;
                }
                case 2:{
                    mayor();
                    opcion = true;
                    break;
                }
                case 3:{
                    area_circulo();
                    opcion = true;
                    break;
                }
                case 4:{
                    precio_final();
                    opcion = true;
                    break;
                }
                case 5:{
                    par_impar();
                    opcion = true;
                    break;
                }
                case 6:{
                    par_impar_f();
                    opcion = true;
                    break;
                }
                case 7:{
                    mayor_que_cero();
                    opcion = true;
                    break;
                }
                case 8:{
                    laboral();
                    opcion = true;
                    break;
                }
                case 9:{
                    reemplaza();
                    opcion = true;
                    break;
                }
                case 10:{
                    elimina_espacios();
                    opcion = true;
                    break;
                }
                case 11:{
                    long_frase();
                    opcion = true;
                    break;
                }
                case 12:{
                    iguales();
                    opcion = true;
                    break;
                }
                case 13:{
                    fecha();
                    opcion = true;
                    break;
                }
                case 14:{
                    pasos();
                    opcion = true;
                    break;
                }
                case 15:{
                    cinematografico();
                    opcion = true;
                    break;
                }
                case 16:{
                    opcion = true;

                }
                case 17:{
                    opcion = true;
                }
                case 18:{
                    opcion = true;
                }
                default:{
                    System.out.println("No ingresó una opción correcta.");
                    opcion = true;
                }
            }
        }
        while (opcion == true);
    }
}
