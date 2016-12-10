package io.bigbears.java.one;

public class Math {

    public static void main(final String[] args) {
        int x = 100;
        int x1 = 100 + 1;
        int x2 = 100 - 1;
        int x3 = 100 / 10;
        int x4 = 100 * 2;
        int x5 = 100 % 5;

        x1 += 1;
        x2 -= 1;
        x3 /= 10;
        x4 *= 2;
        x5 %= 5;

        int index = 0;
        int new1 = index++;
        System.out.println("new1: " + new1 + " index: " + index);
        int new2 = ++index;
        System.out.println("new2: " + new2 + " index: " + index);
    }

}
