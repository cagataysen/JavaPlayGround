package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.Item02;

public class ItemTwoTest {

    public static void main(String[] args) {
        StarbucksBuilder sb = new StarbucksBuilder.Builder("tall")
                .softDrinkers("i want soft").build();


    }
}
