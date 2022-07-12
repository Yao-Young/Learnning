package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility;

import jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version1.PurchaseRequestHandler;
import jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version3.*;

public class UnitTest {

    public static void main(String[] args) {
//        //version1
//        PurchaseRequest request = new PurchaseRequest(10050);
//        PurchaseRequestHandler handle = new PurchaseRequestHandler();
//        handle.sendRequestToDirector(request);

        //version3
        Approver wj, gy, jg, meeting;
        wj = new Director("张无忌");
        gy = new VicePresident("杨过");
        jg = new President("郭靖");
        meeting = new Congress("董事会");

        wj.setSuccessor(gy);
        gy.setSuccessor(jg);
        jg.setSuccessor(meeting);

        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wj.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(600000, 1002, "购买葵花宝典");
        wj.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 1003, "购买金刚经");
        wj.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 1004, "购买桃花岛");
        wj.processRequest(pr4);
    }

}
