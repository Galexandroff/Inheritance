package Inheritance3;

public class Car extends Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsuption(DEFAULT_FUEL_CONSUMPTION);
    }
}
