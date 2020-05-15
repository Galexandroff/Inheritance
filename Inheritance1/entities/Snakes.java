package Inheritance1.entities;

public class Snakes extends Reptile{
    public Snakes(String name) {
        super(name);
    }

    @Override
    public void feedAnimals() {
        System.out.println("HARRY POTTER");
    }
}
