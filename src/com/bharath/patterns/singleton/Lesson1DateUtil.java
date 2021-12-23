package com.bharath.patterns.singleton;

public class Lesson1DateUtil {

    private Lesson1DateUtil() {
    }

    private static Lesson1DateUtil instance;

    public static Lesson1DateUtil getInstance(){
        if (instance == null){
            instance = new Lesson1DateUtil();
        }
        return instance;
    }

}
