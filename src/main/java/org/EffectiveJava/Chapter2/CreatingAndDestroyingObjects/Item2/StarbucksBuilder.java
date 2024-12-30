package org.EffectiveJava.Chapter2.CreatingAndDestroyingObjects.Item2;

/**
 * Consider a builder when faced with many constructor parameters.
 */

public class StarbucksBuilder {
    //necessery
    private String coffeeSize;

    //optional / depends on person
    private String noLactoseMilkAmount;
    private String softer;

    public static class Builder{

        //necessery
        private final String coffeeSize;

        //optional / depends on person
        private String noLactoseMilkAmount;
        private String softer;


        public Builder(String coffeeSize) {
            this.coffeeSize = coffeeSize;
        }

        public Builder noLactoseMilkPeople(String noLactoseMilk){
            noLactoseMilkAmount = noLactoseMilk;
            return this;
        }

        public Builder softDrinkers(String softValue){
            softer = softValue;
            return this;
        }

        public StarbucksBuilder build(){
            return new StarbucksBuilder(this);
        }




    }
    public StarbucksBuilder(Builder builder){
        coffeeSize = builder.coffeeSize;
        noLactoseMilkAmount = builder.noLactoseMilkAmount;
        softer = builder.softer;
    }
}
