package org.hashMap;
import java.util.HashMap;
import java.util.Map;

public class FindIntersectionOfArrays {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 3, 5};

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int num : array1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : array2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            if (map2.containsKey(key)) {
                int count = Math.min(entry.getValue(), map2.get(key));
                for (int i = 0; i < count; i++) {
                    System.out.println(key);
                }
            }

        }

    }


}
