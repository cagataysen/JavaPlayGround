package org.hashMap;

import java.util.HashMap;

public class CharacterCounting extends HashMapPlayground {

    //Calculate the frequency of the each letters in the string
    public static void charCounting(String word){

        HashMap<Character, Integer> frequency = new HashMap<Character,Integer>();

        for(int i = 0; i < word.length(); i++){
            if(!frequency.containsKey(word.charAt(i))) {
                Integer j = 1;
                frequency.put(word.charAt(i), j);
                j++;
            }
            else{
                frequency.replace(word.charAt(i), frequency.get(word.charAt(i)) + 1);
            }
        }

        System.out.println(frequency);
    }
}
