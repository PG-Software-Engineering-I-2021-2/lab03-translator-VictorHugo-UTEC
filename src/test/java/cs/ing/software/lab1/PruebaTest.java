package cs.ing.software.lab1;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PruebaTest {
    @Test
    public void Test01(){
        Automovil auto1 = new Automovil(0.9,100,10);
        //logger.info(auto1.imprimirViaje(5));
        Assert.assertEquals(auto1.imprimirViaje(5),"El vehiculo viajo: 5.0 Km y aun tiene 5.5 de combustible");
    }

}
