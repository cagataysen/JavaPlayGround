package org.EffectiveJava.Chapter2.item3;

public interface Cache <F,S>{

    public void put(F key, S value);
    public S get(F key);

}
