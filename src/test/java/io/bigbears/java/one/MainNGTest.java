package io.bigbears.java.one;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MainNGTest {
    
    final Main main = new Main();

    @Test
    public void testSayHi() {
        assertEquals("Hello World !", main.sayHi());
    }

    @Test
    public void testPrint() {
        main.print();
    }
    
}
