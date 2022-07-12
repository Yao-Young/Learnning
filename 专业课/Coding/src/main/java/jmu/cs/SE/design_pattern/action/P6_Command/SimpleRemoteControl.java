package jmu.cs.SE.design_pattern.action.P6_Command;

import jmu.cs.SE.design_pattern.action.P6_Command.command.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }


    public void buttonWasPressed() {
        slot.execute();
    }


}
