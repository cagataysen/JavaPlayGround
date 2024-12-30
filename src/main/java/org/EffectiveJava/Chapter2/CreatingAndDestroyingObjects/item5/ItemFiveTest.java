package org.EffectiveJava.Chapter2.CreatingAndDestroyingObjects.item5;

import java.util.function.Supplier;

public class ItemFiveTest {
    public static void main(String[] args) {

        //ITEM 5: Prefer DI to hardwiring resources

        //Inappropriate
        //WritingAnalysisUtility.isValid();
        //WritingAnalysisSingleton.INSTANCE.isValid();


        //Appropriate
        WritingAnalysisDependencyInjection asd = new WritingAnalysisDependencyInjection(new Dictionary("Turkish"));
        asd.isValid();


        //SUPPLIER -- LAMBDA FUNCTION
        Supplier<String> fs = () -> "Cagatay";
        fs.get();


        //SUPPLIER can be used also but you need to configure WritingAnalysisDependencyInjection
        Supplier<Dictionary> turkish = () -> new Dictionary("Turkish");
        turkish.get();

        Supplier<String> shorter = ()-> WritingAnalysisUtility.LetsSayThatThisMethodHasVeryLongNameLol();
        shorter.get();
        //WritingAnalysisUtility.LetsSayThatThisMethodHasVeryLongNameLol();

        double randomNumber = Math.random();
        System.out.println(randomNumber);
        System.out.println(randomNumber);


        Supplier<Double> randomValue = ()-> Math.random();

        System.out.println(randomValue.get());
        System.out.println(randomValue.get());


    }
}
