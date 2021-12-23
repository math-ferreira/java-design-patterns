package com.bharath.patterns.singleton;

import java.io.Serializable;

public class Lesson4SerializableDateUtil implements Serializable {

    private static final long serialVersionUID = 1L;

    private Lesson4SerializableDateUtil() {
    }

    private static volatile Lesson4SerializableDateUtil instance;

    public static Lesson4SerializableDateUtil getInstance() {
        if (instance == null) {
            synchronized (Lesson4SerializableDateUtil.class) {
                if (instance == null) {
                    instance = new Lesson4SerializableDateUtil();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
