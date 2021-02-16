package Matematicos;

public class Pares_Impares {
    public static void par_impar(){
        int x = 1;
        while (x <= 100){
            int temp = x % 2;
            if(temp == 0){
                System.out.println("El número " + x + " es par.");
                x++;
            }
            else{
                System.out.println("El número " + x + " es impar.");
                x++;
            }
        }
    }
}
