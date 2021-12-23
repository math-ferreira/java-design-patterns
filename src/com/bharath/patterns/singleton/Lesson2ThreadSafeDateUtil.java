package com.bharath.patterns.singleton;

import java.io.Serializable;

public class Lesson2ThreadSafeDateUtil {

    private Lesson2ThreadSafeDateUtil() {
    }

    private static Lesson2ThreadSafeDateUtil instance;

/*    public static synchronized Lesson2ThreadsDateUtil getInstance(){
        if (instance == null){
            instance = new Lesson2ThreadsDateUtil();
        }
        return instance;
    }*/

    public static Lesson2ThreadSafeDateUtil getInstance() {

        synchronized (Lesson2ThreadSafeDateUtil.class) {
            if (instance == null) {
                instance = new Lesson2ThreadSafeDateUtil();
            }
        }
        return instance;
    }

}
