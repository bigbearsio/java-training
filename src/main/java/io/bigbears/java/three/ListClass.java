package io.bigbears.java.three;

import io.bigbears.java.two.DonaldDuck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {

    List<DonaldDuck> ducks = new ArrayList<>();

    public ListClass() {
        ducks.add(new DonaldDuck("Steve"));
        ducks.add(new DonaldDuck("Hawkeye"));
        ducks.add(new DonaldDuck("Tony"));
        ducks.add(new DonaldDuck("Nik"));
        ducks.add(new DonaldDuck("Hawkeye"));
    }

    public void world() {

        Iterator<DonaldDuck> ite = ducks.iterator();
        while (ite.hasNext()) {
            DonaldDuck duck = ite.next();
            duck.sing();
        }

        for (int i = 0; i < ducks.size(); i++) {
            ducks.get(i).sing();
        }

        for (final DonaldDuck duck : ducks) {
            duck.sing();
        }

        ducks.forEach(duck -> duck.sing());

        ducks.sort((d1, d2) -> d1.name.compareTo(d2.name));

        ducks.remove(2);

    }

}
