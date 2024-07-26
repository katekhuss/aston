package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.interfaces.Declarative;
import ru.aston.hw2.two.interfaces.NonProcedural;

import java.util.Objects;

public final class LogicalLanguages extends DeclarativeLanguages implements Declarative, NonProcedural {

    public LogicalLanguages(String name) {
        super(name);
    }

    @Override
    public void displayNonProceduralInfo() {
        System.out.print(" непроцедурный /");
    }

    @Override
    public void displayDeclarativeInfo() {
        System.out.print(" декларативный /");
    }

    public void displayLogicalInfo() {
        System.out.print(" логический /");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogicalLanguages)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}
