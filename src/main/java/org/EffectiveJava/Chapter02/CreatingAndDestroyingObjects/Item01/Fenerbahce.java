package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.Item01;

public class Fenerbahce {
    private String newFootballPlayer;
    private int age;

    public Fenerbahce(String newFootballPlayer, int age) {
        this.newFootballPlayer = newFootballPlayer;
        this.age = age;
    }

    public static Fenerbahce newFootballPlayerProduce(String newFootballPlayer){
        return new Fenerbahce(newFootballPlayer, 22);
    }

    public Fenerbahce (String newCoach){
        this.newFootballPlayer = newFootballPlayer;
    }




}
