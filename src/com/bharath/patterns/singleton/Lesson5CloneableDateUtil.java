package com.bharath.patterns.singleton;

import java.io.Serializable;

public class Lesson5CloneableDateUtil implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private Lesson5CloneableDateUtil() {
    }

    private static volatile Lesson5CloneableDateUtil instance;

    public static Lesson5CloneableDateUtil getInstance() {
        if (instance == null) {
            synchronized (Lesson5CloneableDateUtil.class) {
                if (instance == null) {
                    instance = new Lesson5CloneableDateUtil();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
