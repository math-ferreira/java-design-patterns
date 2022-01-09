package com.bharath.patterns.templatemethod;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new XMLDataRenderer();
        renderer.render();
    }
}
