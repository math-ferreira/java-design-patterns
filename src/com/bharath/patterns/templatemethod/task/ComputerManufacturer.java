package com.bharath.patterns.templatemethod.task;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        String hardDisk = addHardDisk();
        String ram = addRAM();
        String keyboard = addKeyboard();
        System.out.println("Build Computer with: " + hardDisk + ", " + ram + " and " + keyboard);
    }

    public abstract String addHardDisk();

    public abstract String addRAM();

    public abstract String addKeyboard();
}
