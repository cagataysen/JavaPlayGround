package org.EffectiveJava.Chapter2.item5;

public class Dictionary {

    private String language;

    public Dictionary(String language){
        this.language = language;
    }

    @Override
    public String toString(){
        return language;
    }
}
