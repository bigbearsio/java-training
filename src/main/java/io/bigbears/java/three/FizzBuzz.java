package io.bigbears.java.three;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    String parse(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return "BuzzFizz";
        }
    }

    void prints(final List<Integer> listN) {
        for (Integer i : listN) {
            System.out.println(parse(i));
        }
    }

    void printExcept(final List<Integer> listN, int except) {
        for (final Integer element : listN) {
            if (element != 18) {
                System.out.println(parse(element));
            }
        }
    }

    List<Integer> listN = Arrays.asList(3, 5, 18, 10, 21, 9, 6, 13, 8, 22);
    void prints(final List<Integer> listN, int stop) {
        int index = 0;
        while (listN.get(index) != 18) {
            System.out.println(listN.get(index) + ": " + parse(listN.get(index++)));
        }
    }

    void printParallel(final List<Integer> listN) {
        listN.parallelStream()
                .forEach(i -> System.out.println(parse(i)));
    }

}
