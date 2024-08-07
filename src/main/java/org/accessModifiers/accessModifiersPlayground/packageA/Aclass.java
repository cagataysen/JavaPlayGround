package org.accessModifiers.accessModifiersPlayground.packageA;

public class Aclass {

    private static String topSecret = "hallo hallooooo";

    protected static String gossip = "smoking a beer";

    public static void setTopSecret(String topSecret){
        Aclass.topSecret = topSecret;
    }

    public static String getTopSecret(){
        return topSecret;
    }

    /*static keywordu this keyworduyle iyi anlasamiyor, Aclass yapiyoruz
    *
    * this keywordu non static objeler icin kullanilir.
    *
    * System.out.println(this.nonStaticField);
    *
    * System.out.println(Aclass.staticField);
     *
    * */


}
