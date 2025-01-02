package org.EffectiveJava.Chapter4.item22;

public class TestDrive {
    public static void main(String[] args) {
        AbilityToFly ab = new Bird();
        ab.imflying();

        Bird bird = new Bird();
        bird.birdSound();
    }
}
