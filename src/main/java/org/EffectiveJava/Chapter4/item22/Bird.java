package org.EffectiveJava.Chapter4.item22;

public class Bird implements AbilityToFly{

    public void birdSound(){
        System.out.println("cik");
    }

    @Override
    public boolean imflying(){
        return true;
    }
}
