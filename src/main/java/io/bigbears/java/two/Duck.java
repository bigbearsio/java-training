package io.bigbears.java.two;

import java.time.LocalDate;

public abstract class Duck {

    final LocalDate born;

    public Duck() {
        born = LocalDate.now();
    }

    String species() {
        return "duck";
    }

    final protected void born() {
        System.out.println("I's born " + born.toString());
    }

    abstract void bark();

}
