package org.EffectiveJava.Chapter4.item24;

public class NonStaticNested {
    private String word = "Word";

    public class NonStaticNestedClass
    {

        public void writeThis()
        {
            System.out.println(word);
        }

    }
}
