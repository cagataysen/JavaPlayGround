package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item06;

import java.util.ArrayList;
import java.util.List;

//ITEM 6: Avoid creating unnecessary objects
public class ItemSixTest {

    private static long sum(){
        Long sum = 0L;  //SO SLOW
        //long sum = 0L;  // SO FAST

        for (int i = 0; i < 150; i++) {
            sum += i;
        }
        return sum;
    }




    public static void main(String[] args) {
        String word = new String("bikini"); //DONT USE IT
        String word2 = "bikini";
        String word3 = "bikini";

        System.out.println(word == word2); //false
        System.out.println(word2 == word3); //false


        long start = System.nanoTime();
        sum();
        long end = System.nanoTime();
        long totalTime = end - start;
        System.out.println(totalTime);


        //Autoboxing, unboxing
        ArrayList<Integer> integer = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integer.add(i); //Integer.valueOf(i);
        }


        List<Integer> li = new ArrayList<Integer>();
        int sum2 = 0;
        for (Integer i: li){
            if(i.intValue() % 2 == 0){  //i.intValue() --> i

            }
        }

        int a = 2;

        Integer fq = Integer.valueOf(2);


    }

}
