package io.bigbears.java.zero;

public class Math {

    public static void main(final String[] args) {
        int index = 0;

        int new1 = index++;
        System.out.println("index: " + index + " new1: " + new1);

        int new2 = ++index;
        System.out.println("index: " + index + " new2: " + new2);

        int new3 = 4;
        new3 += 2;
        System.out.println("new3: " + new3);
    }

}
