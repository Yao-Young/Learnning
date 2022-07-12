package jmu.cs.SE.design_pattern.action.Ch2_Command.V5;

import java.io.IOException;
import java.util.ArrayList;

public class ConfigSettingWindow {

    private ArrayList<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        try {
            FileUtil.writeCommands(commands);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recover() {
        ArrayList list;
        list = FileUtil.readCommands();

        for (Object obj : list) {
            ((Command)obj).execute();
        }
    }


}
