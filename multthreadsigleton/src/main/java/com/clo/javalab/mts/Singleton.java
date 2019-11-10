package com.clo.javalab.mts;

import javax.management.ReflectionException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance;

    private static boolean instanced = false;

    private Singleton() throws ReflectionException {
        if (!instanced) {
            instanced = true;
        } else {
            throw new ReflectionException(null, "Singleton can't be reflected");
        }
    }

    public static Singleton getInstance() throws ReflectionException {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    private Object readResolve() throws ReflectionException {
        return getInstance();
    }
}
