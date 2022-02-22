package by.practice.maria.inheritance;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Animal> animals = new ArrayList<>();
    // new Animal[10]
    // When animals.size > 10 - Create new array with bigger capacity and copy elements from original array to the new one

    public static void main(String[] args) {
        fillAnimalsList();
        for (Animal animal : animals) {
            animal.voice();
        }
    }

    public static void fillAnimalsList() {
        Cat cat = new Cat("Basiliy");
        Dog dog = new Dog("Barbossa");
        Dog sDog = new Dog("Super-Dog");

        for (int i = 0; i < 12; i++) {
            animals.add(cat);
            animals.add(dog);
        }
    }
}
