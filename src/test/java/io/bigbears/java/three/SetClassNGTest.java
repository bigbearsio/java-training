package io.bigbears.java.three;

import io.bigbears.java.two.DonaldDuck;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class SetClassNGTest {

    SetClass set = new SetClass();

    @Test
    public void testSomeMethod() {
        assert set.ducks.size() == 4;
    }

    @Test
    public void testConstain() {
        assert set.ducks.contains(new DonaldDuck("Nik"));
    }

}
