package io.bigbears.java.three;

import io.bigbears.java.two.DonaldDuck;
import java.util.Stack;

public class StackClass {

    Stack<DonaldDuck> ducks = new Stack<>();

    public StackClass() {
        ducks.push(new DonaldDuck("Steve"));
        ducks.push(new DonaldDuck("Hawkeye"));
        ducks.push(new DonaldDuck("Nik"));
        ducks.push(new DonaldDuck("Roger"));
        ducks.push(new DonaldDuck("Hawkeye"));
        ducks.push(new DonaldDuck("Java"));
    }
}
