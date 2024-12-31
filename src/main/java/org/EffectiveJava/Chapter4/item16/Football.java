package org.EffectiveJava.Chapter4.item16;

// 1 --> Cut direct access.
// 2 --> I have control on my data now by making variables private.
// 3 --> I can make Read only by deleting setter function.
// 4 --> I can make write only by deleting getter function.
// 5 --> Data hiding.

public class Football {

    private String teamName;
    private int teamPlayerCount;

    public Football(String teamName, int teamPlayerCount) {
        this.teamName = teamName;
        this.teamPlayerCount = teamPlayerCount;
    }

    public int getTeamPlayerCount() {
        return teamPlayerCount;
    }

    public void setTeamPlayerCount(int teamPlayerCount) {
        if(teamPlayerCount < 0){
            System.out.println("Player count can't set to negative numbers.");
        }
        this.teamPlayerCount = teamPlayerCount;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }



}
