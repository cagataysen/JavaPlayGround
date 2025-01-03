package org.EffectiveJava.Chapter5.item32;

public class TestDrive {

    /*
    * varargs
    * */

    static void sumTest(int ...v){
        System.out.println(v.length);
        System.out.println(v[1]);
    }



/*
    static void sunTest(int a, int b){

    }


    static void sunTest(int a, int b, int c){

    }
    */

    public static void main(String[] args) {
        //sumTest();
        //sumTest(1);
        sumTest(3,2,3);
    }


}
