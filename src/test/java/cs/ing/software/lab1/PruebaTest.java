package cs.ing.software.lab1;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.logging.Logger;


public class PruebaTest {
    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void TestCamion(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.reabastecer(40));
        Assert.assertEquals(Mercedes.reabastecer(40),"El combustible del Camion es: 68.0 litros.");
    }
    @Test
    public void Test01(){
        Automovil auto1 = new Automovil(0.9,100,10);
        //logger.info(auto1.imprimirViaje(4));
        Assert.assertEquals(auto1.imprimirViaje(4),"El Automovil viajo: 4.0 Km y aun tiene 6.4 litros de combustible");
    }
    @Test
    public void Test02(){
        Automovil auto1 = new Automovil(0.9,100,10);
        Assert.assertEquals(auto1.reabastecer(10),"El combustible del Automovil es: 20.0 litros.");
    }
    @Test
    public void Test03(){
        Automovil auto1 = new Automovil(0.9,100,10);
        //logger.info(auto1.imprimirViaje(5));
        Assert.assertEquals(auto1.imprimirViaje(30),"El Automovil necesita reabastecmiento de combustible.");
    }
    @Test
    public void Test04(){
        Automovil auto1 = new Automovil(0.9,100,10);
        //logger.info(auto1.imprimirViaje(5));
        Assert.assertEquals(auto1.reabastecer(200),"No de puede reabastecer el tanque del Automovil. Esta lleno.");
    }


}
