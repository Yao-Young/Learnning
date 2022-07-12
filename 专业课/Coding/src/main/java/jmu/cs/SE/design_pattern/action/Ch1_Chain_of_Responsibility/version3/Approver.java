package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version3;

public abstract class Approver {

    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}
