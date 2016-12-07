package io.bigbears.java.two;

import java.util.Random;

public class Main {

    private Random r = new Random();
    private Duck donald;
    private Duck rocket;

    public Main() {
        donald = new DonaldDuck();
        rocket = new RocketDuck(new FlyByRocket());

        sing(donald);
        sing(rocket);
        sing(rocket);
        sing(donald);
        sing(rocket);
        sing(donald);
        sing(rocket);
        sing(donald);
        sing(donald);
    }

    private void sing(Duck duck) {
        duck.sing();
    }

    private void fly(FlyBehavior wing) {
        wing.fly();
    }

    private void iam(DonaldDuck duck) {
        duck.name();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
