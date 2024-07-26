package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.ProgrammingLanguages;
import ru.aston.hw2.two.interfaces.Procedural;

import java.util.Objects;

public final class LowLevelLanguages extends ProgrammingLanguages implements Procedural {

    public LowLevelLanguages(String name) {
        super(name);
    }

    @Override
    public void displayProceduralInfo() {
        System.out.print(" процедурный /");
    }

    public void displayLowLevelInfo() {
        System.out.print(" низкоуровневый /");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LowLevelLanguages)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}

