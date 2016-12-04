package io.bigbears.java.one;

import static java.lang.System.*;

public class Operator {

    public void operation() {
        int value1 = 1;
        int value2 = 2;

        if (value1 == value2) {
            out.println("value1 == value2");
        }
        if (value1 != value2) {
            out.println("value1 != value2");
        }
        if (value1 > value2) {
            out.println("value1 > value2");
        }
        if (value1 < value2) {
            out.println("value1 < value2");
        }
        if (value1 <= value2) {
            out.println("value1 <= value2");
        }
    }

    public void condition() {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2)) {
            out.println("value1 AND value2 is 2");
        }
        if ((value1 == 1) || (value2 == 1)) {
            out.println("value1  OR value2 is 1");
        }
    }

    public void type() {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }

    class Parent {
    }

    class Child extends Parent implements MyInterface {
    }

    interface MyInterface {
    }
}
