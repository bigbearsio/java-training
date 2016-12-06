package io.bigbears.java.zero;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MainNGTest {

    @Test
    public void testConcat() {
        final String expected = "Hallow World !!";
        final String actual = Main.concat(
                new String[]{"Hallow", " ", "World !!"});

        org.testng.Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected);
        assertEquals(actual, expected);
        assert expected.equals(actual);
    }

    @org.testng.annotations.Test
    public void testMain() {
        Main.main(new String[]{"Hallow", " ", "World !!"});
    }

}
