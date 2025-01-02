package org.EffectiveJava.Chapter4.item20a21;

public interface Singer {

    public void writeSong();

    public void writePoem();

    default boolean singSong(){
        return true;
    }

}
