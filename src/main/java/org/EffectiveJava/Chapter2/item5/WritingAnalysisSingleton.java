package org.EffectiveJava.Chapter2.item5;

public class WritingAnalysisSingleton {
    //Only one instance we want.

    private static final Dictionary turkish = new Dictionary("Türkçe");
    public static WritingAnalysisSingleton INSTANCE = new WritingAnalysisSingleton();

    private WritingAnalysisSingleton(){

    }

    public static boolean isValid(){
        return true;
    }
}
