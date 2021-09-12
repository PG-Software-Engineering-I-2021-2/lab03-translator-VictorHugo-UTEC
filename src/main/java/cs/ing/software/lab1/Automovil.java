package cs.ing.software.lab1;

public class Automovil extends Vehiculo {

    Automovil(double _consumo, double _capacidad, double _cantidad){
        super(_consumo,_capacidad,_cantidad);
    }

    @Override
    String imprimirViaje(double _viaje) {
        double consumoViaje = _viaje * consumo;
        double remanenteFuel = cantidad - consumoViaje;
        String textOut;

        if(remanenteFuel > 0) {
            textOut = "El vehiculo viajo: " + _viaje + " Km y aun tiene " + remanenteFuel + " de combustible";
            System.out.println(textOut);
            return textOut;
        }else{
            textOut = "Vehiculo necesita reabastecmiento de combustible";
            System.out.println(textOut);
            return textOut;
        }
    }
}
