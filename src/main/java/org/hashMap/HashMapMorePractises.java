package org.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMorePractises {

    public static void main(String[] args) {

        /* Creating a hashMap object */
        Map<String, Integer> hashMap = new HashMap<>();

        /* Adding member to hashmap */
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 5);

        /* Reading from hashmap */
        System.out.println("Banana: " + hashMap.get("Banana"));

        /* Read and print key - values from hashmaps */
        for(String key: hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        /*
        * Key: Apple, Value: 3
        * Key: Orange, Value: 5
        * Key: Banana, Value: 2
        * */
        /*Printed out unordered as you see*/


        /*Iteration on hashmaps*/
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /*
         * Key: Apple, Value: 3
         * Key: Orange, Value: 5
         * Key: Banana, Value: 2
         * */
        /*Printed out unordered as you see*/

        /*update existing value*/
        hashMap.put("Banana", 31);
        System.out.println("new value of the banana: " + hashMap.get("Banana"));


        /*Remove or delete element*/
        hashMap.remove("Banana");

        /*Control if the key is still exist*/
        System.out.println("Is there a banana?: " + hashMap.containsKey("Banana"));

    }
}
