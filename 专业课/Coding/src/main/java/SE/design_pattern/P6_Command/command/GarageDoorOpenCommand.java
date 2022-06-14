package SE.design_pattern.P6_Command.command;

import SE.design_pattern.P6_Command.command.Command;
import SE.design_pattern.P6_Command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;


    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
