package io.bigbears.java.two;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class RocketDuckNGTest {

    Duck duck, donald;

    public RocketDuckNGTest() {
        duck = new RocketDuck(new FlyByRocket());
        duck.species();
        duck.sing();
        duck.born();

        RocketDuck rocket = (RocketDuck) duck;
        rocket.species();
        rocket.sing();
        rocket.born();
        rocket.setWing(null);

        donald = new DonaldDuck("Lung Donald");
    }

    @Test
    public void testBark() {
    }

    @Test
    public void testFly() {
    }

    @Test
    public void testSetWing() {
    }

}
