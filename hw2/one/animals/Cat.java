package ru.aston.hw2.one.animals;

import ru.aston.hw2.one.interfaces.Fur;

import java.util.Objects;

public class Cat extends Mammal implements Fur {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
