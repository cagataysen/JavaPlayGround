package org.EffectiveJava.Chapter2.Item1;

public class Food {

    String name;

    public static Food coldFood(String name){
        return new IceCream();
    }

    public static Food hotFood(String name){
        return new Pizza();
    }

}
