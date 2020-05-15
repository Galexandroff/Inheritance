package Inheritance1.entities;

import java.util.List;

public class Lizard extends Reptile {
    public Lizard(String name){
        super(name);
    }

    @Override
    public void feedAnimals() {
        System.out.println("TSTSTSTST");
    }
}
