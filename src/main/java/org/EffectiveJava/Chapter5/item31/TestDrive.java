package org.EffectiveJava.Chapter5.item31;

import java.util.ArrayList;

import java.util.List;

public class TestDrive {

    public static void main(String[] args) {

        // PECS
        // Producer extend - Consumer super

        List<Object> object1 = new ArrayList<Object>();
        //List<Object> object1 = new ArrayList<String>(); You can't create such thing eventho Object is upper level thing than a String.

        //extends for down classes or itself
        //super for up classes or itself



        List<? extends A> list;
        list = new ArrayList<D>();


        List<? super B> list2;
        list2 = new ArrayList<B>();

        List<? super B> list3;
        list3 = new ArrayList<A>();


    }
}
