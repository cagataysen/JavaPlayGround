package org.EffectiveJava.Chapter4.item16;

//Item 16: In public classes, use accessor methods, not public fields
public class ItemSixteenTest {
    public static void main(String[] args) {
        Football fb = new Football("Fenerbahce", 35);
        fb.setTeamName("Hatayspor");
        fb.setTeamPlayerCount(-15);

        Time t = new Time(10, 11);
        //t.hour = 130;  cannot change final
    }
}
