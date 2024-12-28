package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.Item02;

public class Starbucks {
    //necessery
    private String coffeeSize;

    //optional / depends on person
    private String noLactoseMilkAmount;
    private String softer;

/*
    // TELESCOPE PATTERN

    public Starbucks(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public Starbucks(String coffeeSize, String noLactoseMilkAmount) {
        this.coffeeSize = coffeeSize;
        this.noLactoseMilkAmount = noLactoseMilkAmount;
    }

*/

    /*

    // JAVA BEAN PATTERN


    public Starbucks() {
    }

    public void setCoffeeSize(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public void setNoLactoseMilkAmount(String noLactoseMilkAmount) {
        this.noLactoseMilkAmount = noLactoseMilkAmount;
    }

    public void setSofter(String softer) {
        this.softer = softer;
    }

*/






















}
