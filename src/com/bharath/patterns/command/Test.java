package com.bharath.patterns.command;

public class Test {

    public static void main(String[] args) {
        Television television = new Television();

        RemoteControl remoteControl = new RemoteControl();

        Command onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        Command ofCommand = new OffCommand(television);
        remoteControl.setCommand(ofCommand);
        remoteControl.pressButton();

    }

}
