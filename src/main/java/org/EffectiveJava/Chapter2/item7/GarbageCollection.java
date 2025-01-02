package org.EffectiveJava.Chapter2.item7;

//Item7: Eliminate obsolete object references.

public class GarbageCollection {
    public void finalize()
    {
        System.out.println("Garbage Collection worked and cleaned.");
    }


    public static void main(String[] args) {

        GarbageCollection cagatay = new GarbageCollection();
        GarbageCollection alex = new GarbageCollection();
        GarbageCollection orhan = new GarbageCollection();

        cagatay = null;

        alex = orhan;

        System.gc();

    }

}
