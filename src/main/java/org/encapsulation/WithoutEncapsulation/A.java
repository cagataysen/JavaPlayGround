package org.encapsulation.WithoutEncapsulation;

class B {
    public int var1;
}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.var1 = -1;
    }
}