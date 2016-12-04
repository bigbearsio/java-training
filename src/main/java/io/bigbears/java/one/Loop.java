package io.bigbears.java.one;

import java.util.List;
import java.util.Arrays;

public class Loop {

    public void forLoop() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }

    public void forEach() {
        List<Integer> list = Arrays.asList(0, 1, 2, 3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 4) {
            System.out.println(i++);
        }
    }

    public void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i++);
        } while (i < 4);
    }

}
