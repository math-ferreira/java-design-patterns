package com.bharath.patterns.factory.task;

public class Male implements Person {

    @Override
    public void wish(String msg) {
        System.out.println("Wish male person: "+ msg);
    }
}
