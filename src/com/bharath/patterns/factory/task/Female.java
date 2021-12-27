package com.bharath.patterns.factory.task;

public class Female implements Person {

    @Override
    public void wish(String msg) {
        System.out.println("Wish Female person: " + msg);
    }
}
