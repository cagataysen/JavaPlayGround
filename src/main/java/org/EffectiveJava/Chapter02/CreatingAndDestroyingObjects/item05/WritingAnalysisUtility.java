package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item05;

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
