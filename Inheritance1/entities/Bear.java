package Inheritance1.entities;

public class Bear extends Mammal{
    public Bear(String name) {
        super(name);
    }

    @Override
    public void feedAnimals() {
        System.out.println("RAWRRRR");
    }
}
