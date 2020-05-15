package Inheritance1;

import Inheritance1.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        animals.add(new Lizard("Python"));
        animals.add(new Gorilla("King Kong"));
        animals.add(new Bear("Mecho"));
        animals.add(new Snakes("Choveko"));

        for (Animal animal: animals) {
            animal.feedAnimals();
        }
    }
}
