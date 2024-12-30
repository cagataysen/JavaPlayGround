package org.EffectiveJava.Chapter3.item13;

public class ItemThirteenTest {

    //Item 13: Override clone judiciously

    public static void main(String[] args) {

        // Shallow Copy
        Stack st = new Stack();
        Stack st1 = st;

        System.out.println(st == st1);

        // Deep Copy
        Stack stc = new Stack();
        stc.stackName = "cagatay";
        Stack stc2 = new Stack();
        stc2.stackName = stc.stackName;

    }

}
