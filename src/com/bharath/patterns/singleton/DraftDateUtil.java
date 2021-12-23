package com.bharath.patterns.singleton;

public class DraftDateUtil {

    private DraftDateUtil() {
    }

    /* Lazy strategy -  o mais indicado, instanciado somente quando utilizado
    private static DateUtil instance;

    public static DateUtil getInstance(){
        if (instance == null){
            instance = new DateUtil();
        }
        return instance;
    }*/

    /* Eager v1
    /private static DateUtil instance = new DateUtil();*/

    // Eager v2 static block
    private static DraftDateUtil instance;

    // Eager v2 static block: executed when class is loaded into memory
    static {
        instance = new DraftDateUtil();
    }

    // Eager strategy v1 and v2
    public static DraftDateUtil getInstance() {
        return instance;
    }

}
