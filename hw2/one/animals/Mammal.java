package ru.aston.hw2.one.animals;

public abstract class Mammal extends Animal {
    static boolean spine = true;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
