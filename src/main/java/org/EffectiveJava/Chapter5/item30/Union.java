package org.EffectiveJava.Chapter5.item30;

import java.util.HashSet;
import java.util.Set;

//Generic union method
public class Union {

    //Generic method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {

        Set<E> result = new HashSet<>(s1);

        result.addAll(s2);

        return result;
    }

    // access modifier <conventionlar> dönüşTipi method_name(parameters..)

    public static <T extends Number> int sumUp(T value1, T value2){
        return value1.intValue() + value2.intValue();
    }


    public static void main(String[] args) {
        Set<String> Fenerbahce = Set.of("Cagatay", "Alex", "Dirk Kuyt", "Volkan");
        Set<String> Turkey = Set.of("Cagatay", "Arda Guler", "Kenan Yildiz");

        Set<String> union = union(Fenerbahce, Turkey);

        System.out.println(union);

        System.out.println(sumUp(44.4, 12L));



    }




}
