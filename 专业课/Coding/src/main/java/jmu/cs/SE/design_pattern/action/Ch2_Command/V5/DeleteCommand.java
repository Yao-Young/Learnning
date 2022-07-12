package jmu.cs.SE.design_pattern.action.Ch2_Command.V5;

public class DeleteCommand extends Command {

    public DeleteCommand(String name) {
        super(name);
    }


    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.delete(args);
    }

    @Override
    public void execute() {
        configOperator.delete(this.args);
    }
}
