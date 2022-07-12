package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version2;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}
