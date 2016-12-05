package io.bigbears.java.two;

public interface FlyBehavior {

    void fly();

    static String V = "1.0";

    static String version() {
        return V;
    }

}
