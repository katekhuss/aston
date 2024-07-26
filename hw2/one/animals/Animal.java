package ru.aston.hw2.one.animals;

import java.util.Objects;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
