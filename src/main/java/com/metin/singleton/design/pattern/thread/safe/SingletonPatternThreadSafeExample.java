package com.metin.singleton.design.pattern.thread.safe;

import java.io.Serializable;

public class SingletonPatternThreadSafeExample implements Serializable {

    private static volatile SingletonPatternThreadSafeExample instance;

    protected SingletonPatternThreadSafeExample() {
    }

    public static SingletonPatternThreadSafeExample getInstance() {

        if (instance == null) {

            synchronized (SingletonPatternThreadSafeExample.class) {

                if (instance == null) {
                    instance = new SingletonPatternThreadSafeExample();
                }
            }
        }

        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}


