package com.bharath.patterns.flyweight;

public class Circle extends Shape {

    private String label;

    public Circle() {
        label = "Circle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println(
                "Drawing a " + label + " with radius " + radius + " fill Color " + fillColor +
                        " fill style " + lineColor
        );
    }
}
