package com.bharath.patterns.templatemethod.task;

public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    public String addHardDisk() {
        return "Desktop Hard disk";
    }

    @Override
    public String addRAM() {
        return "Desktop RAM";
    }

    @Override
    public String addKeyboard() {
        return "Desktop Keyboard";
    }
}
