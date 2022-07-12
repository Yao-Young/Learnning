package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version3;

public class Congress extends Approver{

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + this.name + " 审批采购单 " + request.getNumber() + " 金额：" + request.getAmount() + " 目的" + request.getPurpose());
    }
}
