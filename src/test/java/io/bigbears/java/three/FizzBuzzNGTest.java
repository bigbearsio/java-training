package io.bigbears.java.three;

import io.bigbears.java.three.FizzBuzz;
import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FizzBuzzNGTest {

    final FizzBuzz fb = new FizzBuzz();
    final List<Integer> listN
            = Arrays.asList(3, 5, 18, 10, 21, 9, 6, 13, 8, 22);

    @Test
    public void testFizz() {
        final String r1 = fb.parse(3);
        assertEquals(r1, "Fizz");
    }

    @Test
    public void testBuzz() {
        final String r1 = fb.parse(5);
        assertEquals(r1, "Buzz");
    }

    @Test
    public void testFizzBuzz() {
        final String r1 = fb.parse(15);
        assertEquals(r1, "FizzBuzz");
    }

    @Test
    public void testBuzzFizz() {
        final String r1 = fb.parse(16);
        assertEquals(r1, "BuzzFizz");
    }

    @Test
    public void testPrintList() {
        fb.prints(listN);
    }

    @Test
    public void testPrintListStop() {
        System.out.println("============");
        fb.prints(listN, 18);
        System.out.println("============");
    }

    @Test
    public void testPrintListParallel() {
        fb.printParallel(listN);
    }

}
