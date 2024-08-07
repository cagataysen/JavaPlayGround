package org.encapsulation.InheritenceExample;

public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Animal sınıfından miras alınan metod
        dog.bark(); // Dog sınıfının kendi metodu
    }
}
