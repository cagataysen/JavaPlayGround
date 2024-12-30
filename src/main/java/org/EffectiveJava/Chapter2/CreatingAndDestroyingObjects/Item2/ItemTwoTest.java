package org.EffectiveJava.Chapter2.CreatingAndDestroyingObjects.Item2;

public class ItemTwoTest {

    public static void main(String[] args) {
        StarbucksBuilder sb = new StarbucksBuilder.Builder("tall")
                .softDrinkers("i want soft").build();


    }
}
