package com.bharath.patterns.factory.task;

public class Test {

    public static void main(String[] args) {
        Person p = PersonFactory.createPerson("female");
        p.wish("Wish test");
    }
}
