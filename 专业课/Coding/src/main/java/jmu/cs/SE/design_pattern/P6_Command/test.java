package jmu.cs.SE.design_pattern.P6_Command;

import jmu.cs.SE.design_pattern.P6_Command.command.GarageDoorOpenCommand;
import jmu.cs.SE.design_pattern.P6_Command.command.LightOnCommand;
import jmu.cs.SE.design_pattern.P6_Command.receiver.GarageDoor;
import jmu.cs.SE.design_pattern.P6_Command.receiver.Light;

public class test {


    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(new LightOnCommand(new Light()));
        remote.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        remote.buttonWasPressed();
    }

}
