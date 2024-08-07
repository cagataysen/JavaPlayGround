# Differences Between Interface and Abstract Class

## **1. Definition**

- **Abstract Class**
    - A class that cannot be instantiated and may contain both complete (concrete) and incomplete (abstract) methods.
    - Can have instance variables and constructors.

- **Interface**
    - A reference type that can contain only abstract methods (method signatures) and constants.
    - Cannot have instance variables or constructors.

## **2. Methods**

- **Abstract Class**
    - Can have both abstract methods (without a body) and concrete methods (with a body).
    - Example:
      ```java
      abstract class Animal {
          abstract void makeSound();  // Abstract method
          
          void sleep() {              // Concrete method
              System.out.println("Sleeping...");
          }
      }
      ```

- **Interface**
    - All methods are abstract by default (until Java 8, which introduced default methods).
    - Example:
      ```java
      interface Animal {
          void makeSound();          // Abstract method
          
          default void sleep() {     // Default method (Java 8+)
              System.out.println("Sleeping...");
          }
      }
      ```

## **3. Constructors**

- **Abstract Class**
    - Can have constructors.
    - Example:
      ```java
      abstract class Animal {
          Animal() {
              // Constructor code
          }
      }
      ```

- **Interface**
    - Cannot have constructors.

## **4. Fields (Variables)**

- **Abstract Class**
    - Can have instance variables (fields) and methods with or without default values.
    - Example:
      ```java
      abstract class Animal {
          protected String name;    // Instance variable
      }
      ```

- **Interface**
    - Can only have static final variables (constants), and they must be initialized.
    - Example:
      ```java
      interface Animal {
          int NUM_LEGS = 4;         // Constant
      }
      ```

## **5. Inheritance**

- **Abstract Class**
    - Supports single inheritance. A class can only extend one abstract class.
    - Example:
      ```java
      class Dog extends Animal {
          void makeSound() {
              System.out.println("Bark");
          }
      }
      ```

- **Interface**
    - Supports multiple inheritance. A class can implement multiple interfaces.
    - Example:
      ```java
      class Dog implements Animal, Pet {
          public void makeSound() {
              System.out.println("Bark");
          }
      }
      ```

## **6. Use Cases**

- **Abstract Class**
    - Use when you want to provide a common base with shared code and properties.
    - Ideal for closely related classes that share a common behavior.

- **Interface**
    - Use when you want to define a contract for behavior that can be applied to unrelated classes.
    - Ideal for classes that do not share a common base but need to provide the same methods.

## **Summary**

- **Abstract Class**: Used for code reuse among closely related classes. Supports both abstract and concrete methods, instance variables, and constructors.
- **Interface**: Used for defining a contract for unrelated classes. Contains only abstract methods (or default/static methods) and constants. Supports multiple inheritance.
