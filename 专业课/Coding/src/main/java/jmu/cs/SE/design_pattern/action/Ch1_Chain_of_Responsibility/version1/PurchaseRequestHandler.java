package jmu.cs.SE.design_pattern.action.Ch1_Chain_of_Responsibility.version1;

public class PurchaseRequestHandler {

    public void sendRequestToDirector(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            this.handleByDirector(request);
        }
        else if (request.getAmount() < 100000) {
            this.handleByVicePresident(request);
        }
        else if (request.getAmount() < 500000) {
            this.handleByPresident(request);
        }
        else {
            this.handleByCongress(request);
        }
    }

    private void handleByDirector(PurchaseRequest request) {
        System.out.println("handle by Director, amount = " + request.getAmount());
    }

    private void handleByVicePresident(PurchaseRequest request) {
        System.out.println("handle by President, amount = " + request.getAmount());
    }

    private void handleByPresident(PurchaseRequest request) {
        System.out.println("handle by President, amount = " + request.getAmount());
    }

    private void handleByCongress(PurchaseRequest request) {
        System.out.println("handle by Congress, amount = " + request.getAmount());
    }
}
