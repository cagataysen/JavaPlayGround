package org.accessModifiers.accessModifiersPlayground.packageB;

import org.accessModifiers.accessModifiersPlayground.packageA.Aclass;

public class Cclass extends Aclass{

    static void printingOutMethod(){
        System.out.println(Aclass.gossip);
        //System.out.println(Aclass.topSecret);
    }

    public static void main(String[] args){
        printingOutMethod();
    }

}
