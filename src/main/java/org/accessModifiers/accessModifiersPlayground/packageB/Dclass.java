package org.accessModifiers.accessModifiersPlayground.packageB;

import org.accessModifiers.accessModifiersPlayground.packageA.Aclass;

public class Dclass {

    static void printingOutMethod(){

        Aclass.setTopSecret("topSecretHasChanged");
        System.out.println(Aclass.getTopSecret());
        //System.out.println(Aclass.topSecret);
    }

    public static void main(String[] args){
        printingOutMethod();
    }


}

