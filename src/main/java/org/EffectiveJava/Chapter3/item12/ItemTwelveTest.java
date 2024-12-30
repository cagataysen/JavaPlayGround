package org.EffectiveJava.Chapter3.item12;

public class ItemTwelveTest {

    public static void main(String[] args) {
        Request as = new Request();
        as.setBody("body");
        as.setHeader("head");

        System.out.println(as.toString());
    }

}
