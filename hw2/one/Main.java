package ru.aston.hw2.one;

import ru.aston.hw2.one.animals.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошка");
        Cat cat2 = new Cat("Кот");
        Bear bear = new Bear("Медведь");
        Fish fish = new Fish("Рыба");
        Whale whale = new Whale("Кит");

        Animal[] animals = {cat, cat2, bear, fish, whale};

        for (Animal animal : animals) {
            animal.voice();
            System.out.println(animal.hashCode());
        }

        System.out.println("\n" + cat.equals(cat2));
        System.out.println(fish.equals(whale));
        System.out.println(cat.hashCode() == bear.hashCode());
        System.out.println(fish.hashCode() == whale.hashCode());
    }
}
