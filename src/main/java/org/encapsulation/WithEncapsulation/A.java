package org.encapsulation.WithEncapsulation;

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