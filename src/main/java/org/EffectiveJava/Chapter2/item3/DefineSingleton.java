package org.EffectiveJava.Chapter2.item3;

public class DefineSingleton {
    public static DefineSingleton ds = new DefineSingleton();

    private DefineSingleton() {
    }


    public static DefineSingleton getInstance()
    {
        return ds;
    }

}
