package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.interfaces.Functional;
import ru.aston.hw2.two.interfaces.NonProcedural;
import ru.aston.hw2.two.interfaces.Declarative;

import java.util.Objects;

public final class FunctionalLanguages extends DeclarativeLanguages implements Functional, NonProcedural, Declarative {

    public FunctionalLanguages(String name) {
        super(name);
    }

    @Override
    public void displayNonProceduralInfo() {
        System.out.print(" непроцедурный / ");
    }

    @Override
    public void displayDeclarativeInfo() {
        System.out.print(" декларативный /");
    }

    @Override
    public void displayFunctionalInfo() {
        System.out.print(" функциональный /");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunctionalLanguages)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}
