package org.EffectiveJava.Chapter4.item19;

public class ChildClass extends MotherClass{

    final int value;

    public ChildClass(int value) {
        this.value = value;
    }

    @Override
    void overrideMe(){
        System.out.println();
    }


    public static void main(String[] args) {
        ChildClass kid = new ChildClass(31);
    }
}
