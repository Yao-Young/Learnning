package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version1;

public class PurchaseRequest {

    public int amount;

    public PurchaseRequest(int amount) {
        this.amount = amount;
    }

    public PurchaseRequest(){}


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
