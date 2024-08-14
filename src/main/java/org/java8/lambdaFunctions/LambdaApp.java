package org.java8.lambdaFunctions;

public class LambdaApp {

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();


        /*Anonim interface unit created*/
        app.func(2, 3, new Anonim() {

            @Override
            public int call(int a, int b){
                return a + b;
            }
        });

    }

    public int func(int a, int b, Anonim anonim){
        return anonim.call(a, b) * 2; /*Anonim interface unit runs here*/
    }




}
