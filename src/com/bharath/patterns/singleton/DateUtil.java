package com.bharath.patterns.singleton;

public class DateUtil {

    private DateUtil() {
    }

    private static DateUtil instance;

    public static DateUtil getInstance(){
        if (instance == null){
            instance = new DateUtil();
        }
        return instance;
    }

}
