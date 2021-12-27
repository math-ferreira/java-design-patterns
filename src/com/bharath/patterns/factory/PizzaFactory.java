package com.bharath.patterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;

        if (type.equals("cheese")) p = new CheesePizza();
        else if (type.equals("broccoli")) p = new BroccoliPizza();
        else if (type.equals("veggie")) p = new VeggiePizza();

        return p;

    }
}
