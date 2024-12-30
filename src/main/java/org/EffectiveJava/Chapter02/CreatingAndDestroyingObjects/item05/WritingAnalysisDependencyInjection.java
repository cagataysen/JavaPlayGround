package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item05;

public class WritingAnalysisDependencyInjection {

    private final Dictionary dictionary;

    public WritingAnalysisDependencyInjection(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public static boolean isValid(){
        return true;
    }

}
