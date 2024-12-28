package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item03;

public interface Cache <F,S>{

    public void put(F key, S value);
    public S get(F key);

}
