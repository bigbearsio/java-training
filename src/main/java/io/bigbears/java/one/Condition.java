package io.bigbears.java.one;

import static java.lang.System.*;

public class Condition {

    public void showIf() {
        if (100 == 100) {
            out.println("100 == 100");
        }
    }

    public void showIfThenElse() {
        if (100 == 101) {
            out.println("100 == 100");
        } else {
            out.println("100 != 100");
        }
    }

    public void showTernary() {
        int n = ((100 % 3) == 0) ? 100 : 3;
    }

    public void showTryCatch() {
        try {
            throw new Exception("I failed");
        } catch (IllegalStateException e) {
            out.println(e.getMessage());
        } catch (Exception e) {
            out.println(e.getMessage());
        } finally {
            out.println("I do !");
        }
    }

    public void showSwitch() {
        char c = 'O';
        switch (c) {
            case 'A':
                System.out.println("Yo A!");
                break;
            case 'E':
                System.out.println("Yo E!");
                break;
            case 'I':
                System.out.println("Yo I!");
                break;
            case 'O':
                System.out.println("Yo O!");
                break;
            case 'U':
                System.out.println("Yo U!");
                break;
            default:
                System.out.println("No Yo");
        }
    }
}
