package org.reflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {
    public static void main(String[] args) throws Exception {

        //name was private and final but with reflection we changed the name of the cat.
        Cat myCat = new Cat("Stella", 6);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field: catFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Jimmy McGill");
            }
        }
        System.out.println(myCat.getName());



        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for(Method method: catMethods){
            if(method.getName().equals("meow")){
                method.invoke(myCat); //same thing
                myCat.meow(); //same thing
            }
            System.out.println(method.getName());
        }


        for(Method method: catMethods){
            if(method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
        }
        // Output: How did you call this??

        for(Method method: catMethods){
            if(method.getName().equals("thisIsAPublicStaticMethod")){
                method.setAccessible(true);
                method.invoke(null); // some methods are static, you dont need an object of that class to be able to call that method
            }
        }
        // Output: I'm public and static

        for(Method method: catMethods){
            if(method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null); // some methods are static, you DONT need an object of that class to be able to call that method
            }
        }
        // Output: I'm private and static


    }
}
