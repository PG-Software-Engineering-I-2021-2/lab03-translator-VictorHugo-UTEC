package cs.ing.software.lab1;

public abstract class Vehiculo {

    double consumo;
    double capacidad;
    double cantidad;

    Vehiculo(double myConsumo, double myCapacidad,double myCantidad){
        consumo = myConsumo;
        capacidad = myCapacidad;
        cantidad = myCantidad;
    }

    abstract String imprimirViaje(double viajeKm);
    abstract String reabastecer(double litros);
}
