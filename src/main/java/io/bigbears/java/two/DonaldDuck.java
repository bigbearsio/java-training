package io.bigbears.java.two;

import java.util.Objects;

public class DonaldDuck extends Duck
        implements FlyBehavior {

    public final String name;

    public DonaldDuck() {
        this.name = "Donald Duck";
    }

    public DonaldDuck(final String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is ." + name);
    }

    @Override
    public void sing() {
        System.out.println("Kab Kab Kab");
    }

    @Override
    public void fly() {
        System.out.println("I'm Fly");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DonaldDuck) {
            return this.hashCode() == obj.hashCode();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
