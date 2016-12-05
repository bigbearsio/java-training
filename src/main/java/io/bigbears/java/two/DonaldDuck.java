package io.bigbears.java.two;

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
    public void bark() {
        System.out.println("Kab Kab Kab");
    }

    @Override
    public void fly() {
        System.out.println("I'm Fly");
    }

}
