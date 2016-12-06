package io.bigbears.java.zero;

/**
 *
 * @author nuboat
 */
public class Main {

    static String concat(final String[] args) {
        return args[0] + args[1] + args[2];
    }

    public static void main(String[] args) {
        System.out.println(concat(args));
    }

}
