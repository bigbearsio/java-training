package io.bigbears.java.three;

import io.bigbears.java.two.DonaldDuck;
import java.util.HashSet;
import java.util.Set;

public class SetClass {

    Set<DonaldDuck> ducks = new HashSet<>();

    public SetClass() {
        ducks.add(new DonaldDuck("Steve"));
        ducks.add(new DonaldDuck("Hawkeye"));
        ducks.add(new DonaldDuck("Tony"));
        ducks.add(new DonaldDuck("Nik"));
        ducks.add(new DonaldDuck("Hawkeye"));
    }

}
