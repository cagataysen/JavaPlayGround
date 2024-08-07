package org.encapsulation.FinalKeyword;

final class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Bu sınıf kalıtım alamaz çünkü Animal sınıfı final olarak tanımlanmış
// class Dog extends Animal {
// }
//Bunu yapamazsın

class Bird {
    final void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Bu metod override edilemez çünkü fly metodu final olarak tanımlanmış
    // void fly() {
    //    System.out.println("Sparrow is flying");
    // }
}

public class TestFinal {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}
