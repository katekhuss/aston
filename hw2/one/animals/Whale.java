package ru.aston.hw2.one.animals;

import ru.aston.hw2.one.interfaces.Water;

import java.util.Objects;

public class Whale extends Mammal implements Water {

    public Whale(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " поёт");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whale)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
