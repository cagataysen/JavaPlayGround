
# Java Collections Framework

Understanding the Java Collections Framework is essential for effectively managing and manipulating data structures in Java. Below are detailed explanations and code examples for various types of collections, including `List`, `ArrayList`, `Set`, `Map`, and `HashMap`.

## [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)

The `List` ==interface== in Java represents an ==ordered== collection (also known as a ==sequence==). It ==allows duplicate== elements and provides methods to access elements by their index.

### Key Features:
- **Ordered Collection**: Elements are stored in a specific order.
- **Indexed Access**: Access elements using an integer index.
- **Duplicates Allowed**: Multiple occurrences of the same element are allowed.

### Example:
```java
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        System.out.println(myList);
    }
}


## [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

`ArrayList` is a resizable array implementation of the `List` interface. It provides fast access to elements and is suitable for scenarios where frequent access and occasional modifications are required.

### Key Features:
- **Dynamic Sizing**: Automatically resizes itself as elements are added or removed.
- **Fast Random Access**: Provides quick access to elements using an index.

### Example:
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("Apple");
        arList.add("Banana");
        arList.add("Cherry");

        System.out.println(arList);
    }
}
```

## [Set](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)

The `Set` interface represents a collection that does not allow duplicate elements. It is used to model mathematical set operations.

### Key Features:
- **Unique Elements**: No duplicate elements are allowed.
- **Unordered**: The order of elements is not guaranteed.

### Example:
```java
import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Apple"); // Duplicate element

        System.out.println(mySet); // Apple will appear only once
    }
}
```

## [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

The `Map` interface represents a collection of key-value pairs, where each key is unique. It allows you to associate a value with a specific key.

### Key Features:
- **Key-Value Pairs**: Stores data in key-value pairs.
- **Unique Keys**: Each key is unique, but values can be duplicated.

### Example:
```java
import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Cherry", 3);

        System.out.println(myMap);
    }
}
```

## [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

`HashMap` is a hash table-based implementation of the `Map` interface. It allows null keys and values and provides constant-time performance for basic operations (get and put).

### Key Features:

- **Hash Table**: Uses a hash table to store the map.
- **Null Keys/Values**: Allows one null key and multiple null values.
- **Performance**: Provides constant-time performance for basic operations.

### Example:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Apple", 1);
        myHashMap.put("Banana", 2);
        myHashMap.put("Cherry", 3);

        System.out.println(myHashMap);
    }
}
```

## Summary

- **[List]**: Ordered collection with index-based access and support for duplicates.
- **[ArrayList]**: A resizable array implementation of `List` with fast random access.
- **[Set]**: Collection of unique elements without ordering guarantees.
- **[Map]**: Collection of key-value pairs with unique keys.
- **[HashMap]**: Hash table-based `Map` implementation allowing null keys and values.


