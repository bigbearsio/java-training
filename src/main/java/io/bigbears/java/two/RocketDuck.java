package io.bigbears.java.two;

public class RocketDuck extends Duck {

    private FlyBehavior wing;

    public RocketDuck(final FlyBehavior wing) {
        this.wing = wing;
    }

    @Override
    public void sing() {
        System.out.println("Kabbb kab");
    }

    public void fly() {
        wing.fly();
    }

    public FlyBehavior getWing() {
        return wing;
    }

    public void setWing(final FlyBehavior wing) {
        this.wing = wing;
    }

}
