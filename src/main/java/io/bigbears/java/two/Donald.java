package io.bigbears.java.two;

public class Donald {

    public final String name;

    public Donald() {
        this.name = "Donald";
    }

    public Donald(final String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("My name is ." + name);
    }

    public void bark() {
        System.out.println("Kab Kab Kab");
    }

}
