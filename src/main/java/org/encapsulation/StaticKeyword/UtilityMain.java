package org.encapsulation.StaticKeyword;

public class UtilityMain {
    public static void main(String[] args) {
        Utility u1 = new Utility(1);
        Utility u2 = new Utility(2);

        System.out.println("Static count: " + Utility.count); // Statik üye

        System.out.println("u1 id: " + u1.id); // Örnek üye
        System.out.println("u2 id: " + u2.id);
    }
}


/*Statik üyeler doğrudan sınıf adı ile erişilir ve tüm örneklerde paylaşılan verileri temsil eder. Örnek üyeler ise her objeye özeldir.*/
