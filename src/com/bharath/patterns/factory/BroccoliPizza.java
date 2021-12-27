package com.bharath.patterns.factory;

public class BroccoliPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Broccoli Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Broccoli Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Broccoli Pizza");
    }
}
