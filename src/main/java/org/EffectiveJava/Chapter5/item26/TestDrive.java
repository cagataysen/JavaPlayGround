package org.EffectiveJava.Chapter5.item26;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Cagatay");
        nameList.add("Joshua");
        //nameList.add(Boolean.FALSE);

        String anElementFromList = (String) nameList.get(1);

        System.out.println(anElementFromList);

    }
}
