package org.hashMap;


import java.util.HashMap;

public class HashMapPlayground {


    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);


        System.out.println(happy);

        System.out.println(happy.get("c"));



        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("helloKittyFan21", "AloeVera?");
        fun.put("coolguyswag", "password123");

        fun.remove("helloKittyFan21");

        System.out.println(fun);

        System.out.println(fun.containsValue("password123"));
        System.out.println(fun.containsValue("password124"));
        System.out.println(fun.containsKey("coolguyswag"));
        System.out.println(fun.size());

        System.out.println(fun.replace("bobbyJoe1996", "b3tt3rP@ssword!" ));
        System.out.println(fun);
        System.out.println(fun.values());
        System.out.println(fun.keySet());


        CharacterCounting.charCounting("Hello");


        /*They dont have an order (not like arraylist)*/


    }


}
