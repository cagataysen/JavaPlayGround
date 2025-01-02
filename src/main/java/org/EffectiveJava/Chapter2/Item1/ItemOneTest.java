package org.EffectiveJava.Chapter2.Item1;

public class ItemOneTest {

    /*
    * Eğer constructor ile çağırsaydım aşağıdaki food u,
    *
    * Food food = new Food("String input");
    *
    * ne olduğu logicigin karmaşık.
    *
    *
    * Static method çağırdığımda ise ne çağırdığımı daha rahat görebiliyorum.
    * bkz: Food.hotFood() daha anlamlı.
    *
    * */

    public static void main(String[] args){
        Food food = Food.hotFood("something");

        /*
        Fenerbahce fener = new Fenerbahce("Talisca", 22);
        Fenerbahce fener2 = new Fenerbahce("Ronaldo", 23);
        */

        Fenerbahce fb = Fenerbahce.newFootballPlayerProduce("Ronaldinho");

    }




}
