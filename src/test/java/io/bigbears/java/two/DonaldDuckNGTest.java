/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bigbears.java.two;

import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class DonaldDuckNGTest {

    DonaldDuck roger = new DonaldDuck("Captain");
    DonaldDuck tony = new DonaldDuck("Iron");
    DonaldDuck steve = new DonaldDuck("Captain");

    @Test
    public void testEquals() {
        if (roger.equals(tony)) {
            System.out.println("1. roger == tony");
        }

        if (roger.equals(steve)) {
            System.out.println("2. roger == steve");
        }
    }

}
