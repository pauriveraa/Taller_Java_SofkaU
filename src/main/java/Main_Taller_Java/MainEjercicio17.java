package Main_Taller_Java;

import Objects.Electrodomestico;
import Objects.Lavadora;
import Objects.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainEjercicio17 {
    private static final Logger logger = LoggerFactory.getLogger(MainEjercicio17.class);
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos_arr = new Electrodomestico[10];
        float precioTotalLavadoras=0;
        float precioTotalTelevisores=0;
        float precioTotalElectrodomesticos=0;

        electrodomesticos_arr[0] = new Electrodomestico(10,5);
        electrodomesticos_arr[1] = new Electrodomestico(30,5);
        electrodomesticos_arr[2] = new Electrodomestico(30,5);
        electrodomesticos_arr[3] = new Electrodomestico(30,5);
        electrodomesticos_arr[4] = new Lavadora(100,"azul",'A',20,15);
        electrodomesticos_arr[5] = new Lavadora(80,"gris",'B',25,15);
        electrodomesticos_arr[7] = new Television(35,"negro",'A',15,40,true);
        electrodomesticos_arr[6] = new Lavadora(15,3);
        electrodomesticos_arr[8] = new Television(20,5);
        electrodomesticos_arr[9] = new Television(22,5);

        for (Electrodomestico electrodomestico : electrodomesticos_arr) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Television) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            }
            precioTotalElectrodomesticos += electrodomestico.precioFinal();
        }

        logger.info("Precio total lavadoras: {}", precioTotalLavadoras);
        logger.info("Precio total televisores: {}",precioTotalTelevisores);
        logger.info("Precio total electrodomesticos: {}" , precioTotalElectrodomesticos);
    }
}

