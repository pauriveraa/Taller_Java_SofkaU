package Main_Taller_Java;

import Objects.persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEjercicio16 {
    public static void main(String[] args) {
        final int SOBREPESO = 1;
        final int PESO_IDEAL = 0;
        final int PESO_POR_DEBAJO_IDEAL = -1;

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String nombre = "";
        char sexo = 0;
        int edad = 0;
        float peso = 0;
        float altura = 0;

        System.out.println("Ingrese el nombre");
        try {
            nombre = buffer.readLine();
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Ingrese la edad");
        try {
            edad = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Ingrese el sexo");
        try {
            sexo = buffer.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Ingrese el peso");
        try {
            peso = Float.parseFloat(buffer.readLine());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Ingrese la altura");
        try {
            altura = Float.parseFloat(buffer.readLine());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        persona p1 = new persona(nombre,edad,sexo,peso,altura);
        persona p2 = new persona(nombre,edad,sexo);
        persona p3 = new persona();

        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setAltura(altura);
        p3.setPeso(peso);
        p3.setSexo(sexo);

        persona[] personas ={p1,p2,p3};
        for (persona persona : personas) {
            System.out.println(persona.toString());
            switch (persona.calularIMC()) {
                case SOBREPESO:
                    break;
                case PESO_IDEAL:
                    System.out.println("tiene un peso ideal");
                    break;
                case PESO_POR_DEBAJO_IDEAL:
                    System.out.println("tiene un peso por debajo del ideal");
                    break;
            }
            if (persona.serMayorDeEdad()) {
                System.out.println("es mayor de edad");
            } else {
                System.out.println("no es mayor de edad");
            }
        }
    }
}


