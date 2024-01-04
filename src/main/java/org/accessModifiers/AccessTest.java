package org.accessModifiers;

public class AccessTest extends AccessModifiers{

    public static void main(String[] args) {

        AccessTest testObjesi = new AccessTest();

        System.out.println("Erisebildigim degiskenler : " +
                testObjesi.duz + " " + testObjesi.herkese + " " + testObjesi.korumali);

        System.out.println("Gizli :" + testObjesi.getGizli());
    }

}
