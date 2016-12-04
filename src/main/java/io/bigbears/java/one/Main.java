package io.bigbears.java.one;

public class Main {
    
    public String sayHi() {
        return "Hello World !";
    }
    
    public void print() {
        System.out.println(sayHi());
    }
    
    public static void main(final String [] args) {
        final Main main = new Main();
        main.print();
    }
    
}
