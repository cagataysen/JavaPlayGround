package org.accessModifiers.accessModifiersPlayground.packageA;

public class Bclass {

    static void printingOutMethod(){
        System.out.println(Aclass.gossip);
        //System.out.println(Aclass.topSecret);
    }

    public static void main(String[] args){
        printingOutMethod();
    }

}
