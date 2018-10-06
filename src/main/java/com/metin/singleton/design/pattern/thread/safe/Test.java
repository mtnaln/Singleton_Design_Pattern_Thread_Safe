package com.metin.singleton.design.pattern.thread.safe;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        SubSingletonClass sample1 = new SubSingletonClass();

        SingletonPatternThreadSafeExample clone1 = (SingletonPatternThreadSafeExample) sample1.clone();
        SingletonPatternThreadSafeExample clone2 = (SingletonPatternThreadSafeExample) sample1.clone();

        System.out.println(clone1 == clone2);
    }
}
