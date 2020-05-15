package Inheritance1.entities;

public class Gorilla extends Mammal {
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public void feedAnimals() {
        System.out.println("UAHUASHASA");
    }
}
