package Matematicos;

public class Pares_Impares_F {
    public static void par_impar_f(){
        for(int i =1; i <= 100; i++){
            int temp = i % 2;
            if(temp == 0){
                System.out.println("El número " + i + " es par.");
            }
            else{
                System.out.println("El número " + i + " es impar.");
            }
        }
    }
}
