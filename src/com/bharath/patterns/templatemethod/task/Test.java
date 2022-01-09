package com.bharath.patterns.templatemethod.task;

public class Test {

    public static void main(String[] args) {
        ComputerManufacturer desktopManufacturer = new DesktopManufacturer();
        desktopManufacturer.buildComputer();

        ComputerManufacturer laptopManufacturer = new LaptopManufacturer();
        laptopManufacturer.buildComputer();
    }
}
