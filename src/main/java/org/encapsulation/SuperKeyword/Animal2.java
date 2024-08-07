package org.encapsulation.SuperKeyword;


class Animal2 {

    /*Constructor method*/
    Animal2() {
        System.out.println("Animal is created");
    }

}

class Dog2 extends Animal {

    Dog2() {
        super();
        System.out.println("Dog is created");
    }

}

class TestConstructor2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}

