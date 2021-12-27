package com.bharath.patterns.factory.task;

public class PersonFactory {

    public static Person createPerson(String personType) {
        Person p = null;

        if (personType.equals("male")) p = new Male();
        else if (personType.equals("female")) p = new Female();

        return p;
    }
}
