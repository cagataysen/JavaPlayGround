package org.hashMap;
import java.util.HashMap;
import java.util.Map;


public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Karakter: " + entry.getKey() + ", Frekans: " + entry.getValue());
        }
    }
}
