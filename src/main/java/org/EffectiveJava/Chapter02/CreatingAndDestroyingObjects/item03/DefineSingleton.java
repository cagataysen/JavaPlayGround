package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item03;

public class DefineSingleton {
    public static DefineSingleton ds = new DefineSingleton();

    private DefineSingleton() {
    }


    public static DefineSingleton getInstance()
    {
        return ds;
    }

}
