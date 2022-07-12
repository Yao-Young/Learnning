package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version3;

public class President extends Approver{

    public President(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + " 审批采购单: " + request.getNumber() + " 金额：" + request.getAmount() + " 目的" + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
