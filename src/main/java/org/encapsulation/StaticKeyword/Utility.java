package org.encapsulation.StaticKeyword;

public class Utility {
    public static int count = 0; // Statik üye

    public int id; // Örnek üye

    public Utility(int id) {
        this.id = id;
        count++;
    }
}