package jmu.cs.SE.design_pattern.action.Ch2_Command.V5;

public class ModifyCommand extends Command{

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }
}
