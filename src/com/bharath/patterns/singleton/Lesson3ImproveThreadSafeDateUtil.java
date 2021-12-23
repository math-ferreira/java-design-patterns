package com.bharath.patterns.singleton;

public class Lesson3ImproveThreadSafeDateUtil {

    private Lesson3ImproveThreadSafeDateUtil() {
    }

    private static volatile Lesson3ImproveThreadSafeDateUtil instance;

    public static Lesson3ImproveThreadSafeDateUtil getInstance() {
        if (instance == null) {
            synchronized (Lesson3ImproveThreadSafeDateUtil.class) {
                if (instance == null) {
                    instance = new Lesson3ImproveThreadSafeDateUtil();
                }
            }
        }
        return instance;
    }

}
