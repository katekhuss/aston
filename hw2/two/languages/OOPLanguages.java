package ru.aston.hw2.two.languages;

import ru.aston.hw2.two.ProgrammingLanguages;
import ru.aston.hw2.two.interfaces.NonProcedural;
import ru.aston.hw2.two.interfaces.OOP;

import java.util.Objects;

public final class OOPLanguages extends ProgrammingLanguages implements OOP, NonProcedural {

    public OOPLanguages(String name) {
        super(name);
    }

    @Override
    public void displayOOPInfo() {
        System.out.print(" объектно-ориентированный /");
    }

    @Override
    public void displayNonProceduralInfo() {
        System.out.print(" непроцедурный /");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OOPLanguages)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}
