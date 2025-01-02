package org.EffectiveJava.Chapter2.item5;

public class WritingAnalysisUtility {

    private static final Dictionary turkish = new Dictionary("Türkçe");

    //Utility class larin temel ozelligi, private constructor olması, cunku initialize edilmesini istemiyorum.
    private WritingAnalysisUtility(){

    }

    public static boolean isValid(){
        return true;
    }


    public static String LetsSayThatThisMethodHasVeryLongNameLol(){
        return "Hello";
    }


}
