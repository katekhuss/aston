package ru.aston.hw2.one.animals;

public abstract class Mammal extends Animal {
    static boolean spine = true;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        return o instanceof Mammal;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
