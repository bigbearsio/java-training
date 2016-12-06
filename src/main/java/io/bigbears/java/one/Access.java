package io.bigbears.java.one;

public class Access {

    /*default*/
    String yo0 = "Yo !";

    public String yo1 = "Yo !!";

    protected String yo2 = "Yo !!!";

    private String yo3 = "Yo !!!";

}

class Access2 extends Access {

    String getYo0() {
        return yo0;
    }

    String getYo() {
        return yo1;
    }

    String getYo2() {
        return yo2;
    }

}
