package ru.aston.hw2.one.animals;

import ru.aston.hw2.one.interfaces.Fur;

import java.util.Objects;

public class Bear extends Mammal implements Fur {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " рычит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
