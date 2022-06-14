package SE.design_pattern.P6_Command.command;

import SE.design_pattern.P6_Command.command.Command;
import SE.design_pattern.P6_Command.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
