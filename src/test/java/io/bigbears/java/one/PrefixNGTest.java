package io.bigbears.java.one;

import org.testng.annotations.Test;

public class PrefixNGTest {

    @Test
    public void testMain() {
        final Prefix v1 = new Prefix();
        System.out.println("1 syo: " + v1.yo);
        v1.yo = "1N/A";

        System.out.println("1 syo: " + v1.yo);

        final Prefix v2 = new Prefix();
        System.out.println("2 syo: " + v2.yo);

        v2.yo = "2N/A";
        System.out.println("2 syo: " + v2.yo);

        System.out.println("====================");

        final Prefix v3 = new Prefix();
        System.out.println("3 syo: " + v3.syo);
        v3.syo = "3N/A";

        System.out.println("3 syo: " + v3.syo);

        final Prefix v4 = new Prefix();
        System.out.println("4 syo: " + v4.syo);

        v4.syo = "4N/A";
        System.out.println("4 syo: " + v4.syo);

        System.out.println("3 syo: " + v3.syo);
    }

}
