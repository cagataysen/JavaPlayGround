package org.encapsulation.SuperKeyword;

class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

}



class TestSuper{

    public static void main(String args[]){

        Dog dog = new Dog();
        dog.printColor();

    }


}
