package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version3;

public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 50000) {
            System.out.println("主任" + this.name + " 审批采购单: " + request.getNumber() + " 金额：" + request.getAmount() + " 目的" + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
