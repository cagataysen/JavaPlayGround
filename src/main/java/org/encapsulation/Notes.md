### ENCAPSULATION

### Encapsulation Notes

#### Encapsulation Principles
1. Define instance variables as `private`.
2. Provide access through public getter/setter methods.
3. Use Java Standards for naming getter/setter methods.

By following these three principles, our code will be flexible, maintainable, and extensible.

#### Encapsulation Example

**Without Encapsulation:**
```java
class B {
    public int var1;
}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.var1 = -1;
    }
}
```

**With Encapsulation:**
```java
package chapter1.test1;

class B {
    private int var1;

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }
}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.setVar1(10);
        System.out.println(b.getVar1());
    }
}
```

A class in Java is not public by default. If no access modifier is specified, the class is package-private (default), meaning it is only accessible within the same package.
