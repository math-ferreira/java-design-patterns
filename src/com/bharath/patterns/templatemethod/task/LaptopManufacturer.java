package com.bharath.patterns.templatemethod.task;

public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    public String addHardDisk() {
        return "Laptop Hard disk";
    }

    @Override
    public String addRAM() {
        return "Laptop RAM";
    }

    @Override
    public String addKeyboard() {
        return "Laptop Keyboard";
    }
}
