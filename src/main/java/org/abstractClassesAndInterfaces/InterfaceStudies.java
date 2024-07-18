/*
*
* Interface i uygulayan sınıf bu metotları mutlaka uygulamak yani override etmek zorundadır.
*
*Abstract bir sınıf interface i uygulayabilir ve metotları uygulamak zorunda değildir.
*
*Yani abstract olmayan bir sınıf mutlaka metotları override etmek zorundadır.
*
* Interfaceler %100 abstractır.
*
* */

package org.abstractClassesAndInterfaces;

//belirtilmeyen metotlar default olarak public abstracttır.
interface InterfaceStudies{

    void method1();

    void method2();

}

// InterfaceStudies = NewInterface

interface NewInterface{
    public abstract void method1();

    public abstract void method2();

}

interface AnotherInterface extends InterfaceStudies, NewInterface{

}

//Multiple Inheritance
class A implements NewInterface   {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//Govdeli Interface Java 8
//default keyword unu methodlara ekleyerek artık mumkun olabiliyor
//govdeliler gibi override edilmek zorunda degil

interface Java8Interface{

    default void defaultMethod1(){
        System.out.println("default method java 8 new feature");
    }

    default void defaultMethod2(){
        System.out.println("default method java 8 new feature");
    }
}


class Java8InterfaceImpl implements Java8Interface{

    @Override
    public void defaultMethod1(){
        System.out.println("default method override! ");
    }

    //govdeliyi override etmeye gerek yok, 2. methodu yazmıyorum buraya.

}


/*STATIC METHODLAR OVERRIDE EDILMEZ.*/

interface JavaInterfaceStaticMethod{

    public static void staticMethod(){
        System.out.println("This is Java 8 interface static method");
    }

}

class Java8InterfaceStaticMethodImpl implements JavaInterfaceStaticMethod{

}








