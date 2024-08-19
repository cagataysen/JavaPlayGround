package org.java8.optionalClass;

import java.util.Optional;

public class OptionalPlayground {

    Optional<String> optionalName = Optional.of("Cagatay");

    /*If we dont know the value is null or not use down below example */
    Optional<String> optionalNameWeDontKnowIfNull = Optional.ofNullable(null);


    /*Empty optional defining*/
    Optional<String> emptyOptional = Optional.empty();


    void checkName(){
        if(optionalName.isPresent()){
            System.out.println(optionalName.get());
        }
    }


    public static void main(String[] args) {
        OptionalPlayground playground = new OptionalPlayground();
        playground.checkName();
    }


    /*Bad Example*/
    /*Dont use as a field variable*/
    private Optional<String> name;

    /*Good Example*/
    private String name2;


    /*Bad Example*/
    /*Avoid using as method parameter.*/
    public void doSomething(Optional<String> name) {

    }


    /*Good Example*/
    public void doSomething(String name) {
        if (name != null) {
        }
    }


    /*Dont use get method directly because if the optional is empty there can be exception*/
    /*Bad Example*/
    String nameA = optionalName.get(); // If this is null, exception

    /*Good Example*/
    String nameB = optionalName.orElse("Default Name");




}