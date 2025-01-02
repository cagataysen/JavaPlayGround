package org.EffectiveJava.Chapter4.item24;

public class LocalClass {
    public void writeSomething()
    {

        class localClassInner
        {


        }

        localClassInner localInner = new localClassInner();

    }
}
