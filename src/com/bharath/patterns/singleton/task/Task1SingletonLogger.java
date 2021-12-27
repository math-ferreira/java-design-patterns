package com.bharath.patterns.singleton.task;

import java.io.Serializable;

public class Task1SingletonLogger implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private Task1SingletonLogger() {
    }

    private static volatile Task1SingletonLogger instance;

    public static Task1SingletonLogger getInstance() {
        if (instance == null) {
            synchronized (Task1SingletonLogger.class) {
                if (instance == null) {
                    instance = new Task1SingletonLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    private Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
