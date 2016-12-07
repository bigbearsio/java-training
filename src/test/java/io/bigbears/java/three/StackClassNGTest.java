package io.bigbears.java.three;

import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class StackClassNGTest {

    StackClass stack = new StackClass();

    @Test
    public void testPop() {
        assert stack.ducks.pop().name.equals("Java");
    }

}
