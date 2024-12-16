package org.CoreJavaPlayGround;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface cagatayAnnotation{
        String value();
        int priority() default 1;
    }

    @cagatayAnnotation(value = "example")
    public void exampleMethod(){
        System.out.println("Hello world");
    }

}
