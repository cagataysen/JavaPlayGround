package org.java8.newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewFeaturesPlayGround {

    public static void main(String[] args) {
        List<Kullanici> kullanicilar = new ArrayList<>();

        kullanicilar.add(new Kullanici(1,"Sen"));
        kullanicilar.add(new Kullanici(2,"Mehmet"));
        kullanicilar.add(new Kullanici(3,"Emil"));
        kullanicilar.add(new Kullanici(4,"Murat"));
        kullanicilar.add(new Kullanici(5,"Cagatay"));
        kullanicilar.add(new Kullanici(6,"Levent"));
        kullanicilar.add(new Kullanici(7,"Hoppp"));

        //kullanicilar.stream().forEach(kullanici -> System.out.println(kullanici.toString()));

/*
        //asagidaki iki kod ayni sey
        kullanicilar.stream().forEach(user -> user.talk());   //user for parametresindeki i gibi, talk methodunu cagiriyor
        kullanicilar.stream().forEach(Kullanici::talk);   //Kullanici: Class indaki talk methodunu cagir
*/

/*
       long count = kullanicilar.stream().filter(user -> user.id>5).count();
        System.out.println(count);
 */

        List<Kullanici> filteredList = kullanicilar.stream().filter(user -> user.id>5).collect(Collectors.toList());  //id si 5ten buyuk listesini filtreledi
        filteredList.stream().forEach(Kullanici::talk);         //filteredListi yazdirdi

        List<Kullanici> mappedList = kullanicilar.stream().map(user -> new Kullanici(user.id+100, user.name)).collect(Collectors.toList());

        mappedList.stream().forEach(user -> System.out.println(user.toString()));

        //Listeyi map e donusturdu toMap ile
        Map<Integer, String> userMap = kullanicilar.stream().collect(Collectors
                .toMap(user -> user.id, user -> user.name));

        userMap.forEach((key, value) -> System.out.println(key + " : " + value));


    }
    }

class Kullanici{

    int id;
    String name;

    public Kullanici(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kullanici [id=" + id + ", name=" + name + "]";
    }

    public void talk() {
        System.out.println("Hi, I am " + this.name);
    }
}