package Inheritance3;

public class SportCar extends Car{
    public static final double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsuption(DEFAULT_FUEL_CONSUMPTION);
    }
}
