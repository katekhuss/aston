package ru.aston.hw2.one.animals;

import ru.aston.hw2.one.interfaces.Water;

import java.util.Objects;

public class Fish extends Animal implements Water {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " молчит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
