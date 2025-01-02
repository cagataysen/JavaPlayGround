package org.EffectiveJava.Chapter2.item5;

public class WritingAnalysisDependencyInjection {

    private final Dictionary dictionary;

    public WritingAnalysisDependencyInjection(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public static boolean isValid(){
        return true;
    }

}
