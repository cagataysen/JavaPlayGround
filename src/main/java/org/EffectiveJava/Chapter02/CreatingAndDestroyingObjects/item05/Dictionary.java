package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item05;

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
