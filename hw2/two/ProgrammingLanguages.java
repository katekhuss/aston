package ru.aston.hw2.two;

import ru.aston.hw2.two.interfaces.*;
import ru.aston.hw2.two.languages.*;

import java.util.Objects;

public abstract class ProgrammingLanguages {
    protected final String name;

    public ProgrammingLanguages(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.print("Язык программирования: " + name + " ");

        if (this instanceof Procedural) {
            ((Procedural) this).displayProceduralInfo();
        }
        if (this instanceof NonProcedural) {
            ((NonProcedural) this).displayNonProceduralInfo();
        }
        if (this instanceof LowLevelLanguages) {
            ((LowLevelLanguages) this).displayLowLevelInfo();
        }
        if (this instanceof HighLevelLanguages) {
            ((HighLevelLanguages) this).displayHighLevelInfo();
        }
        if (this instanceof OOP) {
            ((OOP) this).displayOOPInfo();
        }
        if (this instanceof Declarative) {
            ((Declarative) this).displayDeclarativeInfo();
        }
        if (this instanceof Functional) {
            ((Functional) this).displayFunctionalInfo();
        }
        if (this instanceof LogicalLanguages) {
            ((LogicalLanguages) this).displayLogicalInfo();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguages that = (ProgrammingLanguages) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
