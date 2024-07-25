package ru.aston.hw2.two;

import ru.aston.hw2.two.languages.*;

public class Main {

    public static void main(String[] args) {
        LowLevelLanguages[] lowLevelLanguages = new LowLevelLanguages[] {
                new LowLevelLanguages("Assembler")
        };

        HighLevelLanguages[] highLevelLanguages = new HighLevelLanguages[] {
                new HighLevelLanguages("Fortran"),
                new HighLevelLanguages("Basic"),
                new HighLevelLanguages("Pascal"),
                new HighLevelLanguages("C")
        };

        OOPLanguages[] oopLanguages = new OOPLanguages[] {
                new OOPLanguages("C++"),
                new OOPLanguages("Visual Basic"),
                new OOPLanguages("Delphi"),
                new OOPLanguages("Java")
        };

        DeclarativeLanguages[] declarativeLanguages = new DeclarativeLanguages[] {
                new LogicalLanguages("Prolog"),
                new FunctionalLanguages("Lisp")
        };

        ProgrammingLanguages[][] langCategories = new ProgrammingLanguages[][] {
                lowLevelLanguages,
                highLevelLanguages,
                oopLanguages,
                declarativeLanguages
        };

        for (ProgrammingLanguages[] category : langCategories) {
            for (ProgrammingLanguages lang : category) hash: {
                lang.displayInfo();
                System.out.println("хэш-код: " + lang.hashCode());

                if (category.length > 1) equalz: {
                    System.out.print("Равен ли первому объекту из категории? " + lang.equals(category[0]));
                }

                System.out.println();
            }
            System.out.println();
        }
    }
}
