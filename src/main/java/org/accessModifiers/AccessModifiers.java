package org.accessModifiers;

public class AccessModifiers {
    public String herkese = "public degisken";
    protected String korumali = "protected degisken";
    String duz = "default degisken";
    private String gizli = "private degisken";


    public String getGizli() {
        return this.gizli;
    }

    public static void main(String[] args) {

        AccessTest testObjesi = new AccessTest();

        //alinacak hata java: gizli has private access in org.accessModifiers.AccessModifiers
        //System.out.println("Erisebildigim degiskenler : " + testObjesi.gizli +
        //      testObjesi.duz + " " + testObjesi.herkese + " " + testObjesi.korumali);

    }

}
