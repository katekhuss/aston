package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.ProgrammingLanguages;
import ru.aston.hw2.two.interfaces.Procedural;

import java.util.Objects;

public final class HighLevelLanguages extends ProgrammingLanguages implements Procedural {

    public HighLevelLanguages(String name) {
        super(name);
    }

    @Override
    public void displayProceduralInfo() {
        System.out.print(" процедурный /");
    }

    public void displayHighLevelInfo() {
        System.out.print(" высокоуровневый /");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HighLevelLanguages)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}
