package cs.ing.software.lab1;
import java.util.logging.Logger;

public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    public static void main(String[] args)
    {
        Automovil auto1 = new Automovil(0.9,100,10);
        String auto1Viaje = auto1.imprimirViaje(4);
        logger.info(auto1Viaje);
        String auto1Viaje2 = auto1.reabastecer(20);
        logger.info(auto1Viaje2);
        String auto1Viaje3 = auto1.imprimirViaje(30);
        logger.info(auto1Viaje3);
        String auto1Viaje4 = auto1.reabastecer(200);
        logger.info(auto1Viaje4);

        Camion camion = new Camion(1.6,100,10);
        String camionViaje1 = camion.imprimirViaje(4);
        logger.info(camionViaje1);

        String camionViaje2 = camion.reabastecer(50);
        logger.info(camionViaje2);

    }
}
