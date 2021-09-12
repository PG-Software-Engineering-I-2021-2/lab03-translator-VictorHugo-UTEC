package cs.ing.software.lab1;

public class Camion extends Vehiculo{

    Camion(double _consumo, double _capacidad, double _cantidad){
        super(_consumo,_capacidad,_cantidad);
    }
    @Override
    String imprimirViaje(double _viaje) {
        double consumoViaje = _viaje * consumo;//
        //double remanenteFuel = cantidad*(capacidad/100) - consumoViaje;
        double remanenteFuel = 1*(capacidad/100)+(cantidad-1)*(capacidad/100)*0.95 - consumoViaje;
        String textOut;

        if(remanenteFuel > 0) {
            textOut = "El camion viajo: " + _viaje + " Km y aun tiene " + String.format("%.2f", remanenteFuel) + " de combustible";
            System.out.println(textOut);
            return textOut;
        }else {
            textOut = "camion necesita reabastecmiento de combustible";
            System.out.println(textOut);
            return textOut;
        }
    }
}
