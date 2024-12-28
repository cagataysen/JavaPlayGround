package org.EffectiveJava.Chapter02.CreatingAndDestroyingObjects.item03;

import java.util.HashMap;
import java.util.Map;

/**
 * Enforce the singleton property with a private constructor or an enum type
 */

public enum CacheSingleton implements Cache{
    INSTANCE;

    private Map<Object, Object> map = new HashMap<Object, Object>();

    public void put(Object key, Object value)
    {
        map.put(key, value);
    }

    public Object get(Object key)
    {
        return map.get(key);
    }

}
