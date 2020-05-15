package Inheritance3;

public class Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.setFuelConsuption(DEFAULT_FUEL_CONSUMPTION);
    }

    public double getFuelConsuption() {
        return fuelConsumption;
    }

    public void setFuelConsuption(double fuelConsuption) {
        this.fuelConsumption = fuelConsuption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers) {
        double fuelNeeded = this.fuelConsumption * kilometers;
        if (this.fuel >= fuelNeeded) {
            this.fuel = this.fuel - fuelNeeded;
        }
    }
}