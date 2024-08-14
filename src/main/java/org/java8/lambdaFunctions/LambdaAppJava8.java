package org.java8.lambdaFunctions;

public class LambdaAppJava8 {

    public int func(int a, int b, Anonim anonim){
        return anonim.call(a, b) * 2;
    }

    public static void main(String[] args) {
        LambdaAppJava8 app = new LambdaAppJava8();
        app.func(2, 3, (a, b) -> a + b); // Using Lambda
    }


}
