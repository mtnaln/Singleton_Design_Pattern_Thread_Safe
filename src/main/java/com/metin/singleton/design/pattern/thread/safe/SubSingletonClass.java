package com.metin.singleton.design.pattern.thread.safe;

public class SubSingletonClass extends SingletonPatternThreadSafeExample implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
