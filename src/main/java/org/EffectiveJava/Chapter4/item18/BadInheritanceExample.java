package org.EffectiveJava.Chapter4.item18;

import java.util.HashSet;

public class BadInheritanceExample extends HashSet<Object> {
    public static void main(String[] args) {
        BadInheritanceExample badInheritanceExample = new BadInheritanceExample();
        badInheritanceExample.add("bad example, to use add function, we extend HashSet");


    }



}
