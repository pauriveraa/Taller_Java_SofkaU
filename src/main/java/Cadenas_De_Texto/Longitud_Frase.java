package Cadenas_De_Texto;

import java.util.Locale;
import java.util.Scanner;

public class Longitud_Frase {
    public static void long_frase(){
        String frase_consola;
        int cont = 0;
        int cont_a = 0;
        int cont_e = 0;
        int cont_i = 0;
        int cont_o = 0;
        int cont_u = 0;

        System.out.println("Ingrese una frase: ");
        Scanner frase = new Scanner(System.in);
        frase_consola = frase.nextLine();
        frase_consola = frase_consola.toLowerCase();
        System.out.println("El tamaño de la frase es de: " + frase_consola.length());

        for(int i=0;i<frase_consola.length();i++){
            if(frase_consola.charAt(i) == 'a'){
                cont_a++;
            }
            if(frase_consola.charAt(i)  == 'e' ) {
                cont_e++;
            }
            if(frase_consola.charAt(i)  == 'i'){
                cont_i++;
            }
            if(frase_consola.charAt(i)  == 'o'){
                cont_o++;
            }
            if(frase_consola.charAt(i)  == 'u'){
                cont_u++;
            }
        }
        cont = cont_a + cont_e + cont_i + cont_o + cont_u;
        System.out.println("La frase tiene " + cont + " vocales.");
        System.out.println(cont_a + " a.");
        System.out.println(cont_e + " e.");
        System.out.println(cont_i + " i.");
        System.out.println(cont_o + " o.");
        System.out.println(cont_u + " u.");
    }
}
