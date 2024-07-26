package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.ProgrammingLanguages;
import ru.aston.hw2.two.interfaces.Declarative;
import ru.aston.hw2.two.interfaces.NonProcedural;

import java.util.Objects;

public abstract class DeclarativeLanguages extends ProgrammingLanguages implements NonProcedural, Declarative {

    public DeclarativeLanguages(String name) {
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
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}
