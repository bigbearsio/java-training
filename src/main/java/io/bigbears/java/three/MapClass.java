package io.bigbears.java.three;

import io.bigbears.java.two.DonaldDuck;
import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map<String, DonaldDuck> ducks = new HashMap<>();

    public MapClass() {
        ducks.put("Steve", new DonaldDuck("Steve"));
        ducks.put("Hawkeye", new DonaldDuck("Hawkeye"));
        ducks.put("Nik", new DonaldDuck("Nik"));
        ducks.put("Roger", new DonaldDuck("Roger"));
        ducks.put("Boat", new DonaldDuck("Hawkeye"));
        ducks.put("Roger", new DonaldDuck("Java"));
    }
}
